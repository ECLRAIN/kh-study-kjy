## 컨트롤러 실습 문제

다음 요청을 처리할 수 있는 컨트롤러를 `spring03quiz` 프로젝트에 구현하세요

- 프로젝트 포트는 8888로 설정
- http://localhost:8888/quiz/bmi
	- 사용자의 키(cm)와 몸무게(kg)를 전달받아 BMI 계산 후 출력 
- http://localhost:8888/quiz/subway
	- 사용자의 출생년도(year)를 입력받아 지하철 요금을 계산 후 출력
- http://localhost:8888/quiz/calendar
	- 사용자가 연도(year)와 월(month)을 입력하면 해당 월의 일 수를 출력

## 컨트롤러 실습 문제

다음 요청을 처리할 수 있는 컨트롤러를 `spring04quiz` 프로젝트에 구현하세요

- 프로젝트 실행 포트는 8765로 설정
- http://localhost:8765/quiz/sum
	- 시작(begin)과 종료(end)값을 정수로 입력받아 해당 구간의 숫자 합계 출력
- http://localhost:8765/quiz/gugudan
	- 문제 개수(count)를 입력받아 해당 개수만큼 구구단 문제를 랜덤으로 출력
	- 범위는 `2~9`단, `x1~x9`로 설정

- 다음 주소가 처리되도록 구현해보세요
	- http://localhost:8765/quiz/total?v=10&v=20&v=30
	- 전달된 v에 해당하는 모든 값들의 합계를 구하여 출력
	 











