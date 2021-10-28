-- 이름: demo_madang.sql
-- 설명
-- madang 스키마를 생성하고 MADANG 서점 실습테이블과 데이터를 입력한다.

CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);

CREATE TABLE  Customer (
  custid      NUMBER(2) PRIMARY KEY,  
  name        VARCHAR2(40),
  address     VARCHAR2(50),
  phone       VARCHAR2(20)
);


CREATE TABLE Orders (
  orderid NUMBER(2) PRIMARY KEY,
  custid  NUMBER(2) REFERENCES Customer(custid),
  bookid  NUMBER(2) REFERENCES Book(bookid),
  saleprice NUMBER(8) ,
  orderdate DATE
);
-- Book, Customer, Orders 데이터 생성
INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

-- 주문(Orders) 테이블의 책값은 할인 판매를 가정함
INSERT INTO Orders VALUES (1, 1, 1, 6000, TO_DATE('2014-07-01','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (2, 1, 3, 21000, TO_DATE('2014-07-03','yyyy-mm-dd'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, TO_DATE('2014-07-03','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (4, 3, 6, 6000, TO_DATE('2014-07-04','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (5, 4, 7, 20000, TO_DATE('2014-07-05','yyyy-mm-dd'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, TO_DATE('2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, TO_DATE( '2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, TO_DATE('2014-07-08','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (9, 2, 10, 7000, TO_DATE('2014-07-09','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (10, 3, 8, 13000, TO_DATE('2014-07-10','yyyy-mm-dd'));

COMMIT;

-- 로그인한 사용자가 보유하고 있는 테이블 정보를 가지고 있는 메타데이터 테이블
select * from tab;

-- 테이블의 구조 확인
desc dept;

SELECT * FROM emp;
select * from dept;
select loc, deptno, dname from dept;
select * from book;
select * from customer;
select * from orders;
select orderid, custid, saleprice from orders;

-- Select 구문에서 컬럼의 산술연산이 가능
select sal, sal+100, sal - 100, sal * 12, sal / 2
from emp;

select * from emp;

-- 우리 외사의 사원들의 이름과 월 급여 연봉을 리스트로 출력
select ename, sal, sal * 12
from emp;

-- 연봉에 +comm, 주의! comm의 값 중에는 null
-- null : 정해지지 않은 값 - 있는것도 아니고 없는것도 아니다! 연산의 결과 = null;

select ename, sal, sal * 12, comm, sal * 12 + comm
from emp;

--null 값을 치환해주는 nvl 함수
-- nvl(컬럼명, 치환할 데이터) => 컬럼의 값중 null값은 치환 값으로 출력
select comm, nvl(comm, 100)
from emp
;

--nvl 함수를 이용해서 결과 값 도출
select ename, sal, sal * 12, comm, sal * 12 + comm,
            comm, nvl(comm,0), sal*12 + nvl(comm,0)
from emp;

-- 별칭을 이용해서 컬럼이름 사용

select ename as " 사원이름", sal as "월급여", sal*12 + nvl(comm,0) as "연봉"
from emp;

select ename name, sal sal, sal*12 + nvl(comm,0) saloYear
from emp;

-- 문자열을 연결해주는 || 연산자
select ename || ' is a ' || job msg
from emp;


-- 사원들이 소속된 부서 번호 출력
select distinct deptno
from emp
;

-- 우리 서점에 입점한 출판사 리스트
select distinct publisher
from book;

select distinct deptno, job
from emp;

-------------------------------------------
select *  -- 출력하고자 하는 컬럼
from emp  -- 대상 테이블
where sal >= 3000   -- 조건 : 비교연산 또는 논리연산 => 행을 찾을 조건
;


-- 10번 부서의 소속된 -> 행을 검색할 조건
-- 사원의 리스트 출력
select *
from emp
where deptno = 10
;

-- 이름이 FORD인 사원의 : 행
-- 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력 : 컬럼
select empno, ename, sal
from emp
where ename = 'FORD'  -- 문자열 비교시 반드시 작은 따움표 사용!!
;

-- 날짜 비교 : 82년 이후 입사자
select *
from emp
where hiredate >= '82/01/01'
;


-- 10부서 소속인 사원들 중에서    -> and
-- 직급이 MANAGER인 사람을 검색하여
-- 사원명, 부서번호, 직급을 출력하려고
select ename, deptno, job
from emp
where deptno = 10 and job = 'MANAGER'
;

-- 10부서 소속된 사원이거나    -> or
-- 직급이 MANAGER인 사람을 검색하여
-- 사원명, 부서번호, 직급을 출력
select ename, deptno, job
from emp
where deptno = 10 or job = 'MANAGER'
;

-- 부서번호가 10번이 아닌사원의 
-- 사원이름, 부서번호, 직급을 출력
select *
from emp
where not deptno = 10
-- where deptno <> 10
-- where deptno != 10
;

-- 2000에서 3000 사이의 급여를 받는 사원과 : 조건
select *
from emp
--where sal >= 2000 and sal <= 3000
where sal between 2000 and 3000
;

--1987년에 입사한 사원을 출력해 봅시다.
select *
from emp
where hiredate between '87/01/01' and '87/12/12'
;

-- 커미션이 300이거나 500이거나 1400인 사원을 
-- 검색하기 위해서 IN 연산자를 사용해 봅시다.
select *
from emp
-- where comm = 300 or comm = 500 or comm = 1400
where comm in(300, 500, 1400)
;

-- like 패턴 검색
-- F로 시작하는 이름을 가진 사원을 검색
select *
from emp
where ename like 'S%'
;

-- 이름 중 A를 포함하는 사원을 검색해봅시다.
-- 문자 A앞뒤에 %를 기술하면 문자열 중간에 A문자만 있으면 앞뒤에 어떤 문자열이 몇 개가 오든 상관 없이 찾는다.
select *
from emp
where ename like '%A%'
;

-- 이름이 N으로 끝나느 사원을 검색
select *
from emp
where ename like '%N'
;

-- 이름의 두 번째 글자가 A인 사원을 검색
select *
from emp
where ename like '_A%'
;

-- 이름 중 A를 포함하지 않는 사원
select *
from emp
where ename not like '%A%'
;

-- 커미션을 받지 않는 사원을 검색해 봅시다.
select *
from emp
-- where comm is null
where comm is not null and comm != 0
;

-- 정렬을 위한 order by 절
-- order by 컬럼명{[asc] | desc}, asc(오름차순) desc(내림차순)
select *
from emp
-- order by sal asc
-- order by sal -- 기본 정렬 : asc
order by sal desc
;

-- 사원 이름순으로 정렬
select *
from emp
order by ename
;

-- 입사일 순 정렬
select *
from emp
order by hiredate, sal asc
;
