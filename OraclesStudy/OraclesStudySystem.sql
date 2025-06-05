-- system 시스템  사용자계정
create user orclstudy identified by oracle; -- 397p system 사용자로 접속 후 사용자 생성하기((SQL*PLUS) cmd 실행창)
-- conn(연결하다) 명령어를 사용해 새로 생성한 ORCLSTUDY 사용자로 접속을 시도하면 접속이 되지 않음
-- 사용자가 생성되긴 했지만 데이터 베이스 연결을 위한 권한, 즉 CREATE SESSION 권한을 부여 받지 못함

-- grant(승인하다)문은 권한을 부여 하기 위해 사용하는 명령어
-- CREATE(크레이티 - 만들다, 창조하다) SESSLON(세션 - 사이트에 들어온 사용자가 접속한 시점부터 이탈까지 상호작용한 시간)

grant create session to orclstudy; -- system 사용자로 접속 후 orclstudy 사용자에게 권한 부여
-- orclstudy 사용자가 scott 계정처럼 테이블을 만들고 데이터를 사용하려면 몇몇 권한이 더 필요

-- 사용자 정보 조회 
-- select * from all_users whre username = 'orclstudy' ;
-- select * from dba_users whre username = 'orclstudy' ;
-- select * from dba_objects whre username = 'orclstudy' ;

-- 사용자 정보를 변경 할 때 alter(바꾸다) user문을 사용 

alter user orclstudy identified by orcl; -- 사용자 정보(패스워드) 변경
-- 사용자 생성과 마찬가지로 사용자 정보 변경도 system 사용자로 수행 .

-- 오라클 사용자 삭제
-- drop user 문을 사용하여 사용자를 삭제. 만약 삭제하려는 사용자가 다른 곳에서 접속 되어 있다면 삭제 되지 않는다는 점 주의.

drop user orclstudy ; -- 사용자 삭제

drop user orclstudy cascade ; -- 사용자와 객체 모두 삭제하기

-- 권한 관리 
-- 오라클에서는 권한을 시스템 권한(system privilege)과 객체 권한(object privilege)
-- 시스템 권한의 일부이며 any(다수의 비교값중 한개라도 만족하면 true) 키워드가 들어 있는 권한은 소유자에 상관없이 사용가능한 권한을 의미 

-- grant(승인하다) [시스템 권한] to [사용자 이름/롤(role : 규칙)이름/public(공공의)] with admin option;
-- 시스템 권한 : 오라클 데이터베이스에서 제공하는 시스템 권한을 지정함. 한 번에 여러 종류의 권한을 부여하려면 쉼표(,)로 구분하여 권한 이름을 여러 개 명시해 주면됨(필수).
-- 사용자이름/롤이름/public : 권한을 부여하려는 대상을 지정. 사용자 이름을 지정 해 줄수도 있음 롤(role)을 지정 할 수도 있음 public는 현재 오라클 베이스의 모든 사용자에게 권한을 부여하겠다는 의미
-- with admin option은 현재 grant문을 통해 부여 받은 권한을 다른 사용자에게 부여 할 수 있는 권한도 함께 부여 받음 현재 사용자가 권한이 사라져도, 권한을 재부여한 다른 사용자의 권한은 유지됨(선택)

create user orclstudy identified by oracle; -- system 계정으로 접속하여 사용자(orclstudy) 생성하기(sql*plus)

grant resource, create session, create table to orclstudy; -- 사용자 권한 부여하기 (sql*plus)

-- conn scott/tiger :  scott접속 



 
