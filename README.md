# Spring-Boot-View-Test
스프링부트 뷰 테스트

http://millky.com/@origoni/post/1144?language=ko_kr
보고 따라 했습니다.

*추가 의존성
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
서버상태 확인용REST 제공

/metrics 		접속카운터나 응답시간, JVM상태 등
/health 		각종데이터 소스의 상태체크
/dump 			스레드 덤프
/configprops	속성 설정값
/env			환경변수나 시스템속성
