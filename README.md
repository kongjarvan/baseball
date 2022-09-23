# MyBatis DB연결 세팅



### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- 엔티티 필요
- Dao 인터페이스 생성 필요

### MariaDB 사용자 생성 및 권한 주기
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 테이블 생성

```MariaDB

USE greendb;


create table stadium(
    id int primary KEY auto_increment,
    stadiumname varchar(20),
    location VARCHAR(10),
    createdAt TIMESTAMP
);


create table team(
    id int primary KEY auto_increment,
    teamname varchar(20),
    stadiumId VARCHAR(10),
    createdAt TIMESTAMP
);


```

### 더미데이터 추가
```MariaDB
insert into stadium(stadiumname, location, createdAt) VALUES('사직구장', '부산', NOW());
insert into stadium(stadiumname, location, createdAt) VALUES('종합운동장 야구장', '서울', NOW());
insert into stadium(stadiumname, location, createdAt) VALUES('시민야구장', '대구', NOW());
COMMIT;
```


