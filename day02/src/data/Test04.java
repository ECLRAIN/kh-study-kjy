package data;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//영화관 요금 계산
		
		//준비
		//(참고) = 는 같다가 아니라 우측의 값을 좌측에 집어넣는 '대입' 연산 기호
		int adultPrice = 12000;
		int adultCount = 2;
		int teenPrice = 7500;
		int teenCount = 3;
		
		//계산
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int total = adultTotal + teenTotal;
		
		//출력
		System.out.println("성인 요금은 다음과 같습니다");
		System.out.println(adultTotal);
		System.out.println("청소년 요금은 다음과 같습니다");
		System.out.println(teenTotal);
		System.out.println("총 결제 금액은 다음과 같습니다");
		System.out.println(total);
	}
}
