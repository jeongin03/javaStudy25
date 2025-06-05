-- conn orclstudy/oracle : orcl 접속
select * from scott.temp; insert into scott.temp values('text', 'from orclstudy'); select * from scott.temp; -- orclstudy로 사용 권한을 부여받은 temp 테이블 사용하기

select * from scott.temp; -- orclstudy로 권한 철회된 temp 테이블 조회하기 (실패)