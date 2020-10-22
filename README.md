# Fortune(오늘의 운세) 

- 비트캠프 2차 24시간 해커톤.
- 이름과 나이, 성별을 입력하면 오늘의 운세를 알려주는 프로그램입니다.
- 해커톤 멤버 : **오세준**, **박민섭**

## 일지

### 10/21

- 주제선정 및 리파짓토리 생성, 역할 분담.
- MemberJoinCommand, MemberLoginCommand, FortuneAddCommand, FortuneResponseCommand 생성

- 클라이언트에게 사용할 수 있는 명령을 보여주는 CommandListCommand생성

### 10/22

- 로그인 된 회원 정보를 저장할 수 있는 방법을 찾는 중.
- 일반회원 / 관리자 전용 커맨드창 만들기
- 로그아웃 기능

- 회원이 좋아요 한 운세 목록, 여태 봤던 운세 리스트, 기본 운세 문구 추가
- 매니저 권한 -  불량회원 딱지 기능 구현
- UI수정
- AdminMemberGradeCommand생성, Board관련 CRUD생성, 로그인 후 관리자/일반회원에게 커맨드 창을 보여주는 ShowXXXCommandListCommand생성

## 구현된 기능

- 회원 로그인, 회원가입 기능
- 운세 글귀 추가, 운세글귀 출력

- 로그인에서 관리자/일반회원계정으로 접속할 수 있도록 구현
- 관리자가 불량회원 / 우수회원 태그 추가기능
- 

## 버그

* admin계정이 중복저장 되고 있음. -> jason에 admin계정을 미리 넣어두는 것으로 했다.

- 로그인한 회원 정보를 불러오는 것이 되지 않음. -> 멤버를 스태틱으로 바꿔서 직접 멤버객체를 집어넣는 것으로 해결 했으나, 인스턴스로 변환할 방법이 필요함.

- 