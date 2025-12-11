<div align="center">

# 🌫️ 전국 미세먼지 실시간 지도 서비스  
### 공공데이터 API + Kakao Map + Spring Boot + Oracle 통합 프로젝트

<br>

<img src="https://img.shields.io/badge/Java-17-007396?logo=java">
<img src="https://img.shields.io/badge/SpringBoot-2.7-6DB33F?logo=springboot">
<img src="https://img.shields.io/badge/MyBatis-000000">
<img src="https://img.shields.io/badge/Oracle-F80000?logo=oracle">
<img src="https://img.shields.io/badge/KakaoMapAPI-FFCD00">
<img src="https://img.shields.io/badge/PublicData-0052CC">
<img src="https://img.shields.io/badge/AWS-232F3E?logo=amazonaws">

<br><br>
</div>

---

## 📖 프로젝트 개요

공공데이터 포털의 전국 미세먼지 측정소 데이터를 수집하고  
카카오 지도 API와 좌표 변환을 활용하여  
**“전국 대기질 정보의 실시간 시각화”**를 구현한 프로젝트입니다.

- 개발 기간 : 1차: `2025.11.03 ~ 2025.11.10`, 2차: `2025.11.24 ~ 2025.11.30`
- 개발 인원 : `7명`  
### 👨‍💻 담당 역할

👨‍💻 담당 역할 (내가 실제로 맡은 부분만 정리)

- 🧑‍🏫 팀원 

- 🧑‍🏫 **팀장** — 일정 관리, 업무 분배, 코드 리뷰 및 프로젝트 총괄

-🔐 인증 기능 개발 — 사용자/관리자 인증 체계 분리 설계, 로그인·회원가입 구현, OTP 로직 전체 개발

🛡 보안 기능 구축 — BCrypt 암호화, 세션 관리, 직접 쿠키 처리 방식(Remember-Me 미사용) 구현

✉️ 이메일 인증 시스템 구현 — 인증코드 발송, OTP 전송/재전송, 만료 처리

🗂 세션 관리 기능 개발 — 사용자/관리자 세션 분리, 세션 남은 시간 표시, 자동 로그아웃 처리

🧭 대기질 조회 기능 공동 개발 — 공공데이터 + Kakao Map 기반 실시간 대기측정소 조회(공동 기여)

⭐ 즐겨찾기 기능 공동 기여 — 관심지역 등록/삭제 기능 일부 참여

⭐ 주요 특징 (내가 구현한 기능 중심으로 작성한 버전)

🔐 사용자/관리자 인증 체계 분리 및 보안 강화
→ 사용자와 관리자 인증로직 완전 분리, 권한 기반 접근 통제 구조 설계

🔑 관리자 전용 OTP(6자리) 2차 인증 적용
→ 3분 만료시간, 재전송 기능, 이메일 전송 및 검증 로직 직접 구현

🛡 회원 보안 강화 기능 구축
→ BCrypt 기반 비밀번호 암호화, 직접 구현한 쿠키 인증 방식
→ 세션 만료 감지 및 자동 로그아웃 처리

✉️ 이메일 인증 시스템 구축
→ 인증코드 발송, OTP 검증, 만료·재발급 처리

🧭 실시간 대기질 조회 기능(공동 작업)
→ 공공데이터 API + Kakao Map API를 이용하여 측정소 정보 시각화

📍 관심지역(즐겨찾기) 기능 일부 기여
→ 사용자별 즐겨찾기 등록/삭제 기능 개발 참여

⏱ 세션 관리 고도화
→ 사용자·관리자 세션 분리 저장
→ 세션 잔여시간 UI 표시
→ 30분 경과 시 자동 로그아웃

---

## 🛠 기술 스택

| 분야 | 기술 |
|------|-------|
| **Frontend** | <img src="https://img.shields.io/badge/html5-E34F26?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-663399?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/jquery-0769AD?style=flat-square&logi=html5&logoColor=white"> |
| **Backend** | <img src="https://img.shields.io/badge/Jsp-FF4000?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/Java-F7DF1E?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/Lombok-4285F4?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/MyBatis-006600?style=flat-square&logi=html5&logoColor=white"> |
| **Database** | <img src="https://img.shields.io/badge/Oracle Database-09476B?style=flat-square&logi=html5&logoColor=white"> |
| **Infra / Server** | AWS EC2(Ubuntu) <img src="https://img.shields.io/badge/Apache Tomcat-F8DC75?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logi=html5&logoColor=white"> |
| **API / External Services** | 공공데이터 대기질 API Kakao Geocoding API Kakao Map API |
| **Build Tool** | <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logi=html5&logoColor=white"> |
| **Tools** | <img src="https://img.shields.io/badge/STS-6DB33F?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/Figma-E73562?style=flat-square&logi=html5&logoColor=white"> <img src="https://img.shields.io/badge/SourceTree-0052CC?style=flat-square&logi=html5&logoColor=white"> |

---

## ✨ 주요 기능

### 🔐 인증 / 회원 기능
- 회원가입(약관 동의 포함)
- 로그인 / 소셜 로그인(Naver, Google)
- 관리자 로그인 시 OTP 2차 인증
- 아이디·비밀번호 찾기
- 마이페이지(조회, 수정, 삭제)
- 탈퇴 회원 관리

---

### 🧭 사용자 기능
- 지역별 대기질 정보 조회
- 미세먼지 등급 확인
- 지도 기반 시각화(Kakao Map API)
- 히트맵 기반 지역 오염도 표시  
- CSV / Excel 데이터 다운로드

---

### 💬 커뮤니티 기능
- 사용자 게시판 (작성 / 수정 / 삭제 / 조회)
- 공지사항 조회
- 댓글 / 대댓글 기능
- 1대1 문의 기능

---

### 🌐 공공데이터 기능
- 공공데이터 API 연동(대기질 정보)
- 실시간 미세먼지 정보 제공
- 지도 기반 위치 시각화
- 히트맵 구현

---

### 🛠 관리자 기능
- **회원 관리** (회원 정보 조회, 상태 변경, 탈퇴 회원 관리)
- **게시판 관리** (사용자 게시판·공지사항)
- **문의 리스트 관리** (1대1 문의 조회 및 대응)

---

### ⚡ 성능 최적화 및 서버 기능
- Redis 캐싱 처리
- Spring Scheduler 기반 자동 데이터 업데이트
- AWS EC2 서버 배포 및 환경 구성

---

## 🧭 메뉴 구조도 (PDF)

📄 메뉴 구조도 보기  
👉 [menu-structure-opendata.pdf](https://github.com/user-attachments/files/24016774/menu-structure-opendata.pdf)

---

## 🖥 화면 설계서 (PDF)

📄 화면 기획서 보기  
👉 [ui-design-opendata.pdf](https://github.com/user-attachments/files/24016796/ui-design-opendata.pdf)

---

## 🗂 ERD 및 테이블 명세서 (PDF)

📄 ERD  
</details> <details> <summary><strong>ERD 다이어그램</strong> ●</summary>
  
<img width="1256" height="1110" alt="image" src="https://github.com/user-attachments/assets/0f7df47b-a454-498e-87ec-5de1a9bd6295" />

</details>

📄 테이블 명세서  
➡ [table-definition-opendata.ods](https://github.com/user-attachments/files/24016807/table-definition-opendata.ods)

---

## 🔍 핵심 구현 내용 (내가 담당한 기능) 
●담당기능 ◐공동기여

🧭 사용자 기능
<details><summary><strong>◐ 실시간 전국 대기측정소 대기질 조회</strong> ◐</summary>

📌 설명

공공데이터 API 및 Kakao Map API를 연동하여 전국 측정소 대기질 조회

측정소 목록 로드 및 지도 마커 표시 로직 공동 구현

</details> <details><summary><strong>◐ 관심지역(즐겨찾기) 등록/삭제 기능</strong> ◐</summary>

📌 설명

사용자별 즐겨찾기 측정소 등록/삭제 기능 일부 기여

프론트·백엔드 공통 로직 개발 참여

</details>

🔐 인증 / 보안 기능 (담당 기능)
<details><summary><strong>● 회원가입 / 로그인 / 로그아웃</strong> ●</summary>

📌 설명

기본 회원가입/로그인/로그아웃 기능 구현

입력값 검증 및 에러 처리 구성

</details> <details><summary><strong>● 사용자/관리자 인증 체계 분리 설계</strong> ●</summary>

📌 설명

일반 사용자와 관리자의 인증 로직을 분리 설계

세션 구조, 접근 권한, 인증 흐름을 독립적으로 처리

</details> <details><summary><strong>● BCrypt 기반 비밀번호 암호화</strong> ●</summary>

📌 설명

BCryptPasswordEncoder를 사용한 비밀번호 단방향 해시 저장 구현

</details> <details><summary><strong>● Remember-Me 기능 미사용 — 직접 쿠키 처리 방식 구축</strong> ●</summary>

📌 설명

Spring Security의 Remember-Me 대신 직접 쿠키를 생성/파싱하는 방식 설계

로그인 유지 로직 완전 커스텀 구성

</details> <details><summary><strong>● 관리자 OTP 2차 인증(6자리 코드 생성)</strong> ●</summary>

📌 설명

관리자 로그인 시 6자리 OTP 자동 생성

3분 유효시간 설정

인증 실패/만료 처리 로직 개발

<img width="1470" height="904" alt="image" src="https://github.com/user-attachments/assets/f0542d05-2c94-42fb-812e-133c976465c2" />

</details> <details><summary><strong>● 이메일 기반 OTP 전송 및 재전송 기능</strong> ●</summary>

📌 설명

이메일로 OTP 발송

사용자가 요청 시 재전송 기능 제공

랜덤 코드 생성 로직 직접 구현

</details> <details><summary><strong>● 인증 성공 시 관리자 세션(isAdmin=true) 부여</strong> ●</summary>

📌 설명

OTP 인증 성공 시 관리자 세션 속성 부여

사용자 세션과 관리자 세션을 독립적으로 저장

</details> <details><summary><strong>● 세션 남은 시간 UI 표시 기능</strong> ●</summary>

📌 설명

세션 남은 시간을 사용자 화면에 실시간 표시

세션 만료 직전 경고 UI 제공

<img width="451" height="54" alt="image" src="https://github.com/user-attachments/assets/7c33bca0-2805-42ed-a38a-34681c66dfa8" />

</details> <details><summary><strong>● 자동 로그아웃(30분 경과 시 세션 만료 처리)</strong> ●</summary>

📌 설명

30분 경과 시 세션 자동 삭제

만료 시 사용자에게 알림 후 강제 로그아웃 처리

</details>

## 📬 프로젝트 구조

```plaintext
📦 boot_bookstore
├─ src/main/java/com.bookstore
│  ├─ controller
│  ├─ service
│  ├─ dao
│  ├─ dto
│  └─ config
├─ src/main/resources
│  ├─ mapper
│  ├─ static
│  └─ templates(JSP)
└─ docs
   ├─ menu-structure.pdf
   ├─ ui-design.pdf
   ├─ erd.pdf
   └─ table-definition.pdf
```

---

## 🚀 시연 영상 & 데모

아래 영상은 지역별 미세농도(대기질 정보)의 주요 기능을 실제 화면과 함께 보여줍니다.  
각 기능별 동작 방식과 흐름을 직관적으로 확인할 수 있습니다.

### 📌 전체 시연 영상
🔗 YouTube 링크: https://youtu.be/your-video-url  
또는  
🎥 EC2 배포 버전 직접 테스트: [http://3.26.104.30:8484/main](http://3.26.104.30:8484/main)

---
<!--
## ✨ 기능별 시연

### 🛒 1. 장바구니 기능
- 비로그인 장바구니 유지  
- 로그인 시 DB 장바구니와 병합  
- 수량 변경 / 삭제  
<img src="/docs/demo/cart.gif" width="600"/>

---

### 💳 2. Toss 결제 프로세스
- 결제 준비 → 승인 API 처리  
- 결제 성공 시 주문 자동 생성  
<img src="/docs/demo/payment.gif" width="600"/>

---

### 📦 3. 주문 생성 및 주문 내역 조회
- 주문 상세 페이지  
- 구매 이력 확인  
<img src="/docs/demo/order.gif" width="600"/>

---

### 🛍️ 4. 도서 검색 / 카테고리 조회
- 키워드 기반 검색  
- 카테고리 필터  
<img src="/docs/demo/search.gif" width="600"/>

---

### 🔐 5. 회원가입 / 로그인 / 로그아웃
- 아이디 중복 체크  
- 세션 기반 로그인 처리  
<img src="/docs/demo/login.gif" width="600"/>

---

### 🛠 6. 관리자 페이지
- 도서 등록 / 수정 / 삭제  
- 이미지 업로드  
- 재고 관리  
<img src="/docs/demo/admin.gif" width="600"/>

---
-->
