desc emp; -- emp 테이블 구조보기
select * from emp; -- emp 테이블 내용보기 

desc dept; -- dept 테이블 구조보기
select * from dept; -- dept 테이블 내용보기

desc bonus; -- bonus 테이블 구조보기
select * from bonus; --bonus 테이블 내용보기

desc salgrade; -- salgrade 테이블 구조보기
select * from salgrade; -- salgrade 테이블 내용보기(선생님이랑 같이 )


select empno, ename, deptno from emp; -- 열을 쉼표로 구분하여 출력하기 81p~실습 

select distinct deptno from emp; -- distinct로 열의 중복 제거하기

select distinct job, deptno from emp; -- 여러 개 열을 명시하여 중복 제거하기

select all job, deptno from emp; -- 직책, 부서 번호 출력하기(ALL 사용)

select ename, sal, sal*12+comm, comm from emp; -- 열에 연산식을 사용하여 출력하기

select ename, sal, sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+sal+comm, comm from emp; -- 곱하기를 사용하지 않고 연간 총 수입 출력하기

select ename, sal*12+comm as annsal, comm from emp; -- 별칭을 사용하여 사원의 연간 총 수입 출력하기

select * from emp order by sal; -- emp 테이블의 모든 열을 급여 기준으로 오름차순 정렬하기
select * from emp order by sal desc; -- emp 테이블의 모든 열을 급여 기준으로 내림차순 정렬하기
select * from emp order by empno desc; -- emp 테이블의 모든 열을 사원 번호 기준으로 내림차순 정렬하기
select * from emp order by deptno asc, sal desc; -- emp 테이블의 전체 열을 부서 번호 (오름차순) 급여(내림차순)로 정렬하기

SELECT DISTINCT JOB FROM EMP; -- 92P Q2

SELECT EMPNO AS EMPLOYEE_NO, ENAME AS EMPLOYEE_NAME, MGR AS SALARY, COMM AS COMMISSION, DEPTNO AS DEPARTMENT_NO
FROM EMP ORDER BY DEPTNO DESC, ENAME ASC; -- 92P Q3

select * from emp where deptno = 30; -- 부서 번호가 30인 데이터만 출력하기

select * from emp where deptno = 30 and job = 'SALESMAN'; -- and 연산자로 여러 개의 조건식 사용하기

select * from emp where deptno = 30 or job = 'CLERK'; -- or 연산자로 여러 개의 출력 조건 사용하기
select * from emp where deptno = 20 or job = 'SALESMAN'; -- or 연산자로 여러 개의 출력 조건 사용하기

select * from emp where sal * 12 = 36000; -- 곱셈 산술 연산자를 사용한 예

select * from emp where sal >= 3000; -- 대소 비교 연산자를 사용하여 출력하기

select * from emp where ename >= 'F'; -- 문자를 대소 비교 연산자로 비교하기(비교 문자열이 문자 하나일 때)

select * from emp where ename <= 'FORZ'; -- 문자열을 대소 비교 연산자로 비교하기 (비교 문자열이 여러 개일 때)

select * from emp where sal != 3000; -- 등가 비교 연산자(!=)를 사용하여 출력하기

select * from emp where sal <> 3000; -- 등가 비교 연산자(<>)를 사용하여 출력하기

select * from emp where sal ^= 3000; -- 등가 비교 연산자(^=)를 사용하여 출력하기

select * from emp where not sal = 3000; -- not 연산자를 사용하여 출력하기

select * from emp where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK'; -- or 연산자를 사용하여 여러 개 조건을 만족하는 데이터 출력하기

SELECT * FROM EMP WHERE JOB IN ('MANAGER', 'SALESMAN', 'CLERK'); -- IN 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE JOB != 'MANAGER' AND JOB <> 'SALESMAN' AND JOB ^= 'CLERK'; -- 등가 비교 연산자와 AND 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE JOB NOT IN ('MANAGER', 'SALESMAN', 'CLERK'); -- IN 연산자와 논리 부정 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE SAL >= 2000 AND SAL <= 3000; -- 대소 비교 연산자와 AND 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 3000; -- BETWEEN A AND B 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE SAL NOT BETWEEN 2000 AND 3000; -- BETWEEN A AND B 연산자와 NOT 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE ENAME LIKE 'S%'; -- LIKE 연산자 사용하여 출력하기

SELECT * FROM EMP WHERE ENAME LIKE '_L%'; -- 사원 이름의 두 번째 글자가 L인 사원만 출력하기

SELECT * FROM EMP WHERE ENAME LIKE '%AM%'; -- 사원 이름에 AM이 포함되어 있는 사원 데이터만 출력하기

SELECT * FROM EMP WHERE ENAME NOT LIKE '%AM%'; -- 사원 이름에 AM이 포함되어 있지 않은 사원 데이터 출력하기

SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM FROM EMP; -- 별칭을 사용하여 열 이름 출력하기

SELECT * FROM EMP WHERE COMM = NULL; -- 등가 비교 연산자로 NULL 비교하기

SELECT * FROM EMP WHERE COMM IS NULL; -- IS NULL 연산자를 사용하여 출력하기

SELECT * FROM EMP WHERE MGR IS NOT NULL; -- 직속 상관이 있는 사원 데이터만 출력하기

SELECT * FROM EMP WHERE SAL > NULL AND COMM IS NULL; -- AND 연산자와 IS NULL 연산자 이용하기

SELECT * FROM EMP WHERE SAL > NULL OR COMM IS NULL; -- OR 연산자와 IS NULL 연산자 사용하기

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10 
UNION 
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20; -- 집합 연산자(UNION)를 사용하여 출력하기

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION
-- SELECT EMPNO, ENAME, SAL FROM EMP WHERE DEPTNO = 20; -- 집합 연산자(UNION)를 사용하여 출력하기 (출력 열 개수가 다를 때)

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION
SELECT ENAME, EMPNO, DEPTNO, SAL FROM EMP WHERE DEPTNO = 20; -- 집합 연산자(UNION)를 사용하여 출력하기 (출력 열의 자료형이 다를 때)

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION
SELECT SAL, JOB, DEPTNO, SAL FROM EMP WHERE DEPTNO = 20; -- 집합 연산자(UNION)를 사용하여 출력하기 (출력 열 개수와 자료형이 같을 때)

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10; -- 집합 연산자(UNION)를 사용하여 출력하기 (출력 결과 데이터가 같을 때)

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10; -- 집합 연산자(UNION ALL)를 사용하여 출력하기 (출력 결과 데이터가 같을 때)

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP 
MINUS
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10; -- 집합 연산자(MINUS)를 사용하여 출력하기

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP 
INTERSECT
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10; -- 집합 연산자(INTERSECT)를 사용하여 출력하기

SELECT * FROM EMP WHERE ENAME LIKE '%S';  -- 125P Q1

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND JOB = 'SALESMAN'; -- 125P Q2

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20 AND SAL > 2000 OR DEPTNO = 30 AND SAL > 2000; -- 125P Q3 집합연산자를 사용하지 않은 방식

SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20 AND SAL > 2000
UNION
SELECT EMPNO, ENAME, JOB, SAL, DEPTNO FROM EMP WHERE DEPTNO = 30 AND SAL > 2000 -- 125P Q3 집합연산자를 사용한 방식

--SELECT * FROM EMP WHERE SAL >= 2000 
UNION
SELECT * FROM EMP WHERE SAL <= 3000; -- 126P Q4

SELECT ENAME, EMPNO, SAL, DEPTNO FROM EMP WHERE DEPTNO =30 AND 
ENAME LIKE '%E%' AND SAL NOT BETWEEN 1000 AND 2000; -- 126P Q5

SELECT * FROM EMP WHERE JOB IN ('MANAGER','CLERK')
AND COMM IS NULL 
AND MGR IS NOT NULL
AND EMPNO NOT LIKE '_L%'; -- 126P Q6


select * from emp, dept order by empno; -- form절에 여러 테이블 선언하기 216p from절에 함께 명시하여 출력하면 생각보다 많은 양의 데이터가 출력. 명시한 가게이블을 구성하는 행이 모든경우의 수로 조합되어 출력하기 때문

select * from emp, dept where emp.deptno = dept.deptno order by empno; -- 열 이름을 비교하는 조건식으로 조인

select * from emp e, dept d where  e.DEPTNO = d.DEPTNO  order by empno; -- 테이블 이름을 별칭으로 표현

select  empno, ename, deptno, dname, loc from emp e, dept d where e.deptno = d.deptno ;  -- 두 테이블에 부서 번호가 똑같은 열 이름으로 포함 되어 있을때 

select e.empno, e.ename, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno order by d.deptno, e.empno; -- 열이름에 각각의 테이블 이름도 함께 명시 할 때 (번거롭더라도 테이블 끼리 겹치지 않는 열 이름이라도 테이블이나 별칭을 명시)

select e.empno, e.ename, e.sal, d.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and sal >= 3000; -- where절에 추가로 조건식 넣어 출력하기  (위에 출력 행을 더 제한 하고 싶다면 where절에 조건식을 추가로 지정, ex: 사원번호, 이름 ,급여, 근무 부서를 함께 출력 하되 급여가 3000이상인 데이터만 보려면 emp테이블과 dept테이블의 조인조건 외에 급여 관련 조건을 추가로 지정)

select * from emp e, salgrade s where e.sal between s.losal and s.HISAL;  -- 급여범위를 지정하는 조건식으로 조인하기 (between a and b 연산자를 사용하여 emp 테이블과 salgrade테이블 조인을 손쉽게 처리 )

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr = e2.empno; -- 같은 테이블을 두 번 사용하여 자체 조인하기 

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr = e2.empno(+) order by e1.EMPNO; -- 왼쪽 외부 조인 사용 

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1, emp e2 where e1.mgr(+) = e2.empno order by e1.empno; -- 오른쪽 외부 조인 사용

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc from emp e join dept d using (deptno) where sal >= 3000 order by deptno, e.empno; -- join~uslng을 사용하여 조인하기 

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc from emp e join dept d on (e.deptno = d.deptno) where sal <=3000 order by e.deptno, empno; -- join~on으로 등가 조인하기 

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 left outer join emp e2 on (e1.mgr = e2.empno) order by e1.empno; -- 왼쪽 외부 조인을 sql-99로 작성  (왼쪽 외부 조인의 기준열이 되는 것은 mgr열, klng은 직속 상관이 없으므로 mgr열의 값은 null)

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 right outer join emp e2 on (e1.mgr = e2. empno) order by e1.EMPNO, mgr_empno; -- 오른쪽 외부 조인을 sql-99로 작성하기

select * from emp; -- 데이터 전체 보기 

select e1.empno, e1.ename, e1.mgr, e2.empno as mgr_empno, e2.ename as mgr_ename from emp e1 full outer join emp e2 on (e1.mgr = e2.empno) order by e1.EMPNO; -- 전체 외부 조인을 sql-99로 작성하기 (sql-99조인은 from절에 특정 키워드를 사용함으로써 테이블을 조인)

-- 239p q1

-- q2

-- q3

-- q4

select sal from emp where ename = 'JONES' ; -- 242p 서브쿼리, 사원 이름이 jones인 사원의 급여 출력

select * from emp where sal > 2975; -- 급여가 2975보다 높은 사원 정보 출력  select문을 실행.



create table dept_temp as select * from dept ; -- dept 테이블을 복사해서 dept_temp 테이블 만들기  266p 10-1

select * from dept_temp; -- dept_temp 테이블 전체 열 조회하기 

insert into dept_temp (deptno, dname, loc) values (50, 'database', 'seoul') ; 
select * from dept_temp; -- dept_temp 테이블에 데이터 추가하기 (왼쪽코드는 하나의 sql문이 아님, lnsert문을 먼저 실행하고 select문을 따로 

insert into dept_temp values (60  , 'network' , 'busan') ;  
select * from dept_temp ; -- insert문에 열 지정 없이 데이터 추가하기 

insert into dept_temp (deptno, dname, loc) values(70 , 'web' , null ) ; 
select * from dept_temp; -- null을 지정하여 입력하기  이와 같이 null을 직접 입력하여 null을 명시적으로 지정 가능

insert into dept_temp (deptno, dname, loc) values (80,'mobile','') ;
select * from dept_temp; -- 빈 공백 문자열로 null을 입력 null을 직접 명시해야 하는 경우에 공백 문자열인 작은 따옴표를 사용하여 null을 입력하는 방식보다 null이란 단어를 정확히 입력하는 방식을 대부분 선호)

insert into dept_temp (deptno, loc) values(90, 'incheon');
select * from dept_temp; -- 열 데이터를 넣지 않는 방식으로 null 데이터 입력하기 (dname 열을 insert문에서 제외시키면, 자동으로 dname열은 null이 입력됨)

create table emp_temp as select * from emp where 1<>1 ;
 select * from emp_temp; -- emp 테이블을 복사해서 emp_temp 테이블 만들기 
 
 insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (9999, '원숭이', 'president', null, '2001/01/01', 5000, 1000, 10);
 select * from emp_temp; -- insert문으로 날짜 데이터 입력하기 (날짜 사이에 / 입력) hiredate열은 날짜 자료형 열
 
 insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (1111, '이숭이', 'manager', 9999, '2001-01-05', 4000, null, 20);
 select * from emp_temp; -- lnsert문으로 날짜 데이터 입력하기 (날짜사이에 - 입력) 년/월/일 순서와 반대로 데이터를 입력하면 오류 발생
 
 insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values ( 2111, '삼숭이' , 'manager', 9999, '07/01/2001', 4000, null, 20); -- 날짜 형식을 반대로 했을 때  오류가 뜸 밑에  처럼 to_date함수 사용 하는것이 좋음
 
 insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (2111, '삼숭이', 'manager', 9999, to_date('07/01/2001', 'dd/mm/yyyy'), 4000, null,20); -- to_date 함수를 사용하여 날짜 데이터 입력하기
 
 insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) values (3111, '힙숭이', 'manager', 9999, sysdate, 4000, null, 30);
 select * from emp_temp; -- sysdate를 사용하여 날짜 데이터 입력하기
 
insert into emp_temp (empno, ename, job, mgr, hiredate, sal, comm, deptno) select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno from emp e, salgrade s where e.sal between s.losal and s.hisal and s.grade = 1 ;
select * from emp_temp order by ename;  --서브쿼리로 여러 데이터 추가하기 

delete from emp_temp where ename = '삼숭이' ; -- 삼숭이 열만 지움 ! ename이 삼숭이인 열을 지움 ! 조건 where를 붙여야됨 !

create table emp_ddl ( empno number(4), ename varchar2(10), tob varchar2(9), mrg number(4), hiredate date, sal number(7,2), comm number(7,2), deptno number(2) ); 
desc emp_ddl; -- 313p  모든 열의 각 자료형을 정의해서 테이블 생성하기   결과 확인하면 창 튀어나옴 명령어가 달라서 

create table dept_ddl as select * from dept ;
desc dept_ddl; -- 다른 테이블을 복사하여 테이블 생성하기

select * from dept_ddl; -- dept_ddl 테이블  전체 조회하기 

create table emp_ddl_30 as select * from emp where deptno = 30;
select * from emp_ddl_30; -- 다른테이블의 일부를 복사하여 테이블 생성

create table empdept_ddl as select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc from emp e, dept d where 1 <>1;
select * from empdept_ddl; -- 다른 테이블을 복사하여 테이블 생성 

create table emp_alter as  select * from emp;
select * from emp_alter; -- emp 테이블을 복사하여 emp_alter 테이블 생성   alter 실습

alter table emp_alter add hp varchar2(20);
select * from emp_alter; -- alter 명령어로 hp 열 추가  (추가 된 맨 마지막 열을 확인)

alter table emp_alter rename column hp to tel;
select * from emp_alter; -- alter 명령어로 hp열 이름을 tle로 변경 (열이름이 hp에서 tel로 변경됨

alter table emp_alter drop column tel; -- 오타나서 열 지우기
alter table emp_alter drop column tle; -- 이것도 지우고 다시 값 넣기  열지우고 다시 hp 실행후 이름변경 

alter table emp_alter modify empno number(5);
desc emp_alter; -- alter 명령어로  empno 열 길이 변경 

alter table emp_alter drop column tel;
select * from emp_alter; -- alter 명령어로 tel 열 삭제  (삭제 할 때 (드롭)drop 키워드를 사용)

rename emp_alter to emp_rename; -- 테이블 이름 변경하기

desc emp_alter; -- 바꾸기 전 이름으로 테이블 구성 살펴보기 결과 : 오류 뜸 기존 이름 emp_alter 사용 불가

select * from emp_rename; -- 변경된 테이블 이름(emp_rename)으로 조회하기 

create table table_notnull(login_id varchar2(20) not null,login_pwd varchar2(20) not null, tel varchar2(20));
desc table_notnull; -- 362p 테이블을 생성 할 때, not null 설정하기

insert into table_notnull (login_id,login_pwd,tel) values ('test_id_01', null, '010-1234-5678');  -- 제약조건이 not null인 열에 null 값 넣어보기 (결과 : 삽입 하기싫데)

insert into table_notnull (login_id, login_pwd) values('test_ id_01','1234');
select * from table_notnull; -- 제약 조건이 없는 tel열에 null 값 입력 

update table_notnull set login_pwd = null where login_id = 'test_id_01'; -- not null 제약조건이 지정된 열 데이터를 null값으로 업데이트하기 

select owner, constraint_name, constraint_type, table_name from user_constraints; -- 제약 조건 살펴보기 (scott계정) 제약조건의 이름을 따로 지정하지 않았으므로 오라클에 의해 자동으로 이름이 지정 


create user orclstudy identified by oracle; -- scott 계정으로 사용자 생성하기 (결과 : 권한이 불충분함)

create table temp(col1 varchar(20), col2 varchar(20));  grant select, insert on temp to orclstudy; -- 409p orclstudy 사용자에게 temp 테이블 권한 부여 하기 , orcl에게 temp 테이블의 여러 권한을 한번에 부여 
 
revoke select, insert on temp from orclstudy; -- orclstudy에 부여된 temp 테이블 사용 권한 취소하기

