# Spring JDBC

다음 테이블에 대한 등록, 조회, 수정, 삭제(CRUD) 기능을 구현하세요

1. 방명록(guest_book) 테이블 - spring07quiz
2. 음악(music) 테이블 - spring08quiz
3. 도서(book) 테이블 - spring09quiz

## 요구사항

- 테이블 이름과 동일한 DTO가 존재해야 합니다
	- 내부에는 RowMapper와 ResultSetExtractor가 구현되어 있어야 합니다
- 컨트롤러를 테이블별로 구현하시기 바랍니다
	- 컨트롤러의 공용 주소는 테이블명으로 설정합니다
- 구현해야 할 기능
	- 등록(/insert)
	- 조회(/list)
	- 검색(/search)
	- 상세(/detail)
	- 수정(/update)
	- 삭제(/delete)
