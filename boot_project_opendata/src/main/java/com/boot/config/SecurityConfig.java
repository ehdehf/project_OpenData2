package com.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers(
                    "/", "/main",
                    "/login", "/login_yn",
                    "/register", "/register_ok",
                    "/checkId", "/checkEmail",
                    "/mail/**",
                    "/css/**", "/js/**", "/img/**",
                    "/api/**",
                    "/oauth/**",

                    // 관리자 로그인 전에 필요한 페이지들
                    "/admin/login", "/admin/login_yn",
                    "/admin/otp", "/admin/otpCheck"
                ).permitAll()

                .antMatchers("/admin/logout").permitAll()
                .antMatchers("/admin/resendOTP").permitAll()
                .antMatchers("/admin/otp", "/admin/otpCheck").permitAll()


                // 관리자 권한
                .antMatchers("/admin/**").permitAll()

                .anyRequest().permitAll()
            .and()

            .rememberMe().disable()
            .formLogin().disable()
            .httpBasic().disable()

            .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
