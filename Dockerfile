# 사용할 Java 버전의 Base 이미지 선택
FROM openjdk:17

# 이미지 내에서 애플리케이션 파일을 보관할 디렉토리 생성 및 설정
WORKDIR /app

# 빌드 결과물인 JAR 파일을 Docker 이미지 안으로 복사
COPY ./build/libs/roulette-0.0.1-SNAPSHOT.jar /app/

# 컨테이너가 시작될 때 실행할 명령 설정
CMD ["java", "-jar", "/app/roulette-0.0.1-SNAPSHOT.jar"]