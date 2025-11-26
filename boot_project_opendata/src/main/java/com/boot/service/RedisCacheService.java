package com.boot.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
@RequiredArgsConstructor
public class RedisCacheService {

    @Autowired(required = false)
    private RedisTemplate<String, String> redisTemplate;

    // 저장
    public void set(String key, String value, long ttlSeconds) {
        if (redisTemplate == null) {
            System.out.println("⚠ Redis 비활성화 → set() 무시됨");
            return;
        }
        redisTemplate.opsForValue().set(key, value, ttlSeconds, TimeUnit.SECONDS);
    }

    // 조회
    public String get(String key) {
        if (redisTemplate == null) {
            System.out.println("⚠ Redis 비활성화 → get() 결과 null");
            return null;
        }
        Object data = redisTemplate.opsForValue().get(key);
        return data != null ? data.toString() : null;
    }

    // 삭제
    public void delete(String key) {
        if (redisTemplate == null) {
            System.out.println("⚠ Redis 비활성화 → delete() 무시됨");
            return;
        }
        redisTemplate.delete(key);
    }
}