-- 한줄씩 블럭 설정 후 alt + c 실행 (alt+c 실행 안되면 이클립스 껏다키기.)

create user boardtest identified by boardtest
grant resource, connect to boardtest
alter user boardtest default tablespace users  
alter user boardtest temporary tablespace temp 

