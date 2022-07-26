package data;
import java.lang.*;
public class Test04 {
		public static void main() {
			//영화관 요금표 계산
			
			//변수준비
			//(참고)=는 같다가 아니라 우측의 값을 좌측에 집어넣는 '대입' 연산 기호
			int adult = 12000;
			int kid = 7500;
			int adultCount = 2;
			int kidCount = 3;
			//토탈계산식 입력
			int adultTotal = adult * adultCount;
			int kidTotal = kid * kidCount;
			int total = adultTotal + kidTotal;
			//출력
			System.out.println("성인 요금은 다음과 같습니다");
			System.out.println(adultTotal);
			System.out.println("청소년 요금은 다음과 같습니다");
			System.out.println(kidTotal);
			System.out.println("총 결제 금액은 다음과 같습니다");
			System.out.println(total);
		}
}
