--2021.11.12
--
--중첩 질의
--
--평균 급여보다 더 많은 급여를 받는 사원을 검색하는 문장
select avg(sal) from emp;


select ename sal
from emp
where sal > (select avg(sal) from emp)
;

-- 다중형 서브 쿼리
--in some any all exists


select ename, sal, deptno
from emp
where deptno in (select distinct deptno
                 from emp
                 where sal >= 3000);


select distinct (deptno) from emp where sal >= 3000;
--select * from emp where deptno  



select ename, sal
from emp
where sal > all(select sal from emp where deptno = 30);

select sal from emp where deptno = 30;


select ename, sal
from emp
where sal > any (select sal from emp where deptno = 30);

----30번 부서의 사원들의 급여
--조건 : 30번 부서의 초고 급여보다 큰 급여를 받는 사원
--이름과 급여 출력
select ename, sal
from emp
where sal > all(select sal from emp where deptno = 30);

select ename, sal
from emp
where sal > (select max(sal) from emp where deptno = 30)
;

select * from customer where address like '%대한민국%' and custid = 2;

select sum(saleprice)
from orders o
where exists (select * from customer c where address like '%대한민국%' and c.custid = o.custid)
;

