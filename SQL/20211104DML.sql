

-- 2021.11.04

-- DML : 데이터의 변경 -> 데이터 삽입, 수정, 삭제

drop table emp01;
create table emp01
as
select * from emp
;
select * from emp01;

-- update 테이블이름 set 컬럼이름=값, 컬럼이름=값, ... where 행 선택 조건

-- 1. 모든 사원의 부서번호를 30번으로 수정합시다.
--    모든 사원은 where 절을 사용하지 않은 경우
update emp01
set deptno=30
;
select * from emp01;

-- 2. 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE 문을 보겠습니다.
update emp01
set sal = sal*1.1
;
select * from emp01;

-- 3. 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
update emp01
set hiredate = sysdate
;
select * from emp01;


-- 1.부서번호가 10번인 사원의 부서번호를 30번으로 수정합시다.
update emp01
set deptno=30
where deptno=10
;
select * from emp01 where deptno=10;
select * from emp01 order by deptno;


-- 2. 급여가 3000 이상인 사원만 급여를 10% 인상합시다.
update emp01
set sal = sal*1.1
where sal >= 3000
;
select * from emp01 where sal>=3000;

-- 3. 1987년에 입사한 사원의 입사일이 오늘로 수정합시다. 
--    사원의 입사일을 오늘로 수정한 후에 테이블 내용을 살펴봅시다.
update emp01
set hiredate = sysdate
where substr(hiredate, 1, 2) = '87'
;
select * from emp01 where substr(hiredate, 1, 2) = '21';