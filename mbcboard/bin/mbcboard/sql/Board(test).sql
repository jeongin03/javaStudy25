-----------------------------member 테이블 부모로 생성하기 ---------------------------------------------
create table member( 
mno number(5) not null ,
bwriter nvarchar2(10) not null,
id nvarchar2(10) primary key, -- board 테이블의 bwriter와 fk로 관계설정 하려고 함 !!(타입일치)
pw nvarchar2(10) not null,
regidate date default sysdate not null 
)

-- 스퀀스 객체는 이미 1개가 있으니 board_seq를 같이 사용하겠다.
drop table member -- member 테이블 삭제용

-- 부모 더미데이터 입력
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '숭이','kkw','1111')

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '원숭이','bbb','2222')

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '이숭이','ccc','3333')

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '삼숭이','ddd','4444')

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '사숭이','eee','555')

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '오숭이','fff','666')

create sequence member_seq increment by 1 start with 1 nocycle nocache


select * from member

------------------------------------------member의 자식 board 외래키 생성 필수 ---------------------------------------------------------
drop table board -- 기존에 board 테이블 삭제
drop sequence board_seq -- 자동번호 생성 제가

create table board (
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000)not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fr foreign key (bwriter) references member(id)
-- board 테이블은 member의 자식 테이블로 member에 mname과 board에 bwriter를 관계 설정 (외래키)
-- ORA-02267: column type incompatible with referenced column type ->  pk와 fk를 붙여야함/
-- pk와  fk를 확인하고 연결 -> 자식테이블에 더미데이터를 삭제하고 실행해보자.

-- board 더미데이터를 넣어보니 
-- ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
-- 부모 테이블에 원숭이이라는 값이 없다. -> board에 원숭이를  id인 kkw로 변경

delete from board -- 조건없이 delete를 실행하면 모든 데이터가 삭제 됨 -> 외래키를 다시 지정해보자.



insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '덥네용~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕해요~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사영~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고영~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이또~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방가~', '무더운데 등교하시는냐고 고생하셨습니다.', 'kkw', sysdate)

select * from board
--------------------------------------------------------------------------------------

-- 조인 : 2개의 테이블을 연결하여 값을 가져온다.
select b.*, m.bwriter from member m inner join board b on m.id =b.bwriter where id='kkw'