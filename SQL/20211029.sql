desc dual;
select * from dual;

-- 함수 : 단일행 함수, 집합 함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환
-- 숫자 함수
select ABS(-15.5) from dual;
select floor(16.7) "Floor" from dual;
select round(15.593) from dual;     -- 16
select round(15.593,2) from dual;       -- 15.59
select round(15.593,-1) from dual;      --20
select trunc(15.6789) from dual;  --특정 자리숫에서 잘라낸다. (버림)
select trunc(15.6789,2) from dual;  --특정 자리숫에서 잘라낸다. (버림)
select trunc(15.6789,-1) from dual;  --특정 자리숫에서 잘라낸다. (버림)
select mod(10,6) from dual;         --나머지를 반환한다.


--문자 함수

SELECT LOWER('MR. SCOTT MCMILLAN') "Lowercase" from dual;
select ename, lower(ename) from emp;                --소문자로 변환
select concat('저는', '손흥민 입니다.') from dual;     -- 문자의 값만 연결
select ename || 'is a ' from emp;
select concat ('나의 이름은 ', ename) from emp;
select LPAD('page 1',15,'*') from dual; -- *********page 1
select RPAD('page 1',15,'*') from dual; -- page 1*********
select rpad('001111-3',14,'*') from dual;

select SUBSTR('ABCDEFG', 3, 4) from dual;
select substr('001212-3001234', 1, 8) from dual;    --문자를 잘라 추출
select substr(hiredate, 1, 2) from dual;


select rpad(substr('001212-30012314',1,8),14,'*') from dual;
select rpad(substr(name,1,2),4,'*')from customer;
select name from customer;
select * from customer;


select Ltrim('     =from=      ')  from dual; -- 잘라내고 남은 부분 표시
select Rtrim('     =from=      ')  from dual;

select trim('+' from '+++++from+++++')as a from dual; -- 잘라내고 싶은 문자를 앞에 표시
select trim(' ' from '     +++++from+++++      ')as a from dual;

select replace('JACK and JUE', 'J', 'BL') from dual;
select replace('000-0000-0000', '-', '') from dual;

-- 날짜 함수
select sysdate from dual;                       -- 시스템에 저장된 날짜를 반환
select sysdate-30 from dual;                    -- 09 / 29
select add_months(sysdate, 4)from dual;         --특정 날짜에 개월 수를 더한다.
select last_day(sysdate) from dual;        -- 해당 달의 마지막 날짜를 반환.


-- 변환 함수

-- 날짜 -> 문자  to_char(원본, 패턴)
select to_char(sysdate, 'YYYY.MM.DD. day dy AM PM HH HH24:MI:ss') from dual;
-- 2021.10.29. 13:00
select to_char(sysdate, 'YYYY-MM-DD HH24:MI') from dual;

select hiredate, to_char(hiredate, 'YYYY.MM.DD.') from emp;


-- 숫자 -> 문자  to_char(원본, 패턴)

select to_char(100000.12, '0,000,000.000') from dual;
--                      0100000      
select to_char(100000, 'L9,999,999') from dual;

select to_char(100000.123, 'L9,999,999.9') from dual;

select sal, to_char(sal*1200, 'L9,999,999') from emp;




-- 문자 -> 날짜  to_date(원본, 패턴)
select to_date('2021.10.25.', 'YYYY.MM.DD.') from dual;

-- 2021.01.01~ 오늘
select trunc(sysdate - to_date('2013-05-17', 'YYYY-MM-DD')) from dual;




-- 문자 -> 숫자  to_number(원본, 패턴)
select to_number('100,000', '9,999,999') + 100000 from dual;


-- switch case 와 유사한 decode 함수
-- emp 테이블에서 사원 이름, 부서번호, 부서이름 출력
 select * from dept;
 SELECT * FROM EMP;
 select ename, deptno, 
        decode(deptno,
            10, 'ACCOUNT',
            20, 'RESEARCH',
            30, 'SALES',
            40, 'OPERATIONS'
        ) as dname
 from emp
 ;

-- 직급에 따라 급여를 인상하도록 하자. 
-- 직급이 'ANALYST'인 사원은 5%, 
--       'SALESMAN'인 사원은 10%, 
--       'MANAGER'인 사원은 15%, 
--       'CLERK'인 사원은 20%인 인상한다.
select ename, job, sal,
        decode(job, 
            'ANALYST', sal*1.05,
            'SALESMAN', sal*1.1,
            'MANAGER', sal*1.15,
            'CLERK', sal*1.2
        ) as upSal
from emp
;




--------------------------------------------------------------
-- 집합 함수 (그룹 함수)
-- 하나의 행의 컬럼이 대상이 아니고, 행 그룹의 컬럼들(집합)이 대상이다.
--------------------------------------------------------------
select 
to_char(sum(sal) * 1200, 'l999,999,999') as "월 급여 총액",
to_char(round(avg(sal) * 1200), 'l999,999,999') as "월 급여 평균",
count(*) as "총 사원의 수",
count(comm) as " 커미션이 등록된 수",
sum(comm) as " 커미션 합",
avg(comm) as "커미션 평균",
max(sal) as "가장 큰 급여",
min(sal) as "가장 낮은 급여"
from emp
;


-- 사원들의 업무의 개수

select count(distinct job) from emp;

-- 각 부서별 급여의 총 합

select sum(sal) from emp where deptno = 10;
select sum(sal) from emp where deptno = 20;
select sum(sal) from emp where deptno = 30;

select * from emp order by deptno;

--group by : 특정 컬럼으로 그룹핑 -> 그룹내의 평균이나 합
-- 부서번호를 기준으로 그룹핑
-- -> 급여의 총합, 평균, 최대, 최소, 사원의 수, 커미션 평균, 커미션 총합

select deptno,
    count(*) as "사원의 수",
    sum(sal) as "급여 총합",
    trunc(avg(sal)) as "급여 평균",
    max(sal) as "최대급여",
    min(sal) as" 최소급여",
    count(comm) as "커미션 수",
    nvl(sum(comm), 0) as "커미션 총합",
    nvl(avg(comm), 0) as "커미션 평균"
from emp
where deptno != 20
group by deptno
--having avg(sal) >= 2000
having max(sal) > 2900
order by deptno
;



