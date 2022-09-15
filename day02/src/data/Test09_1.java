package data;
import java.lang.*;
public class Test09_1 {
	public static void main(String[] args) {
		//준비 - 시작시각, 종료시각, 시간당요금
		int inHour = 12 , inMinute = 40;
		int outHour = 12 , outMinute = 57;
		int pricePerHour = 1200;
		
		//계산 - 이용시간, 이용요금
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		//System.out.println(time);
		
		int pricePerMinute = pricePerHour / 60;
		//System.out.println(pricePerMinute);
		
		//int price = 이용시간(분) * 분당요금;
		int price = time * pricePerMinute;
		
		int hour = time / 60;
		int minute = time % 60;
		
		//int fixPrice = price / 100 * 100;//신규 변수 생성
		price = price / 100 * 100;//기존 변수 변경
		
		//출력
		System.out.println("이용시간은 다음과 같습니다");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println("이용요금은 다음과 같습니다");
		System.out.println(price);
		//System.out.println(fixPrice);
	}
}
