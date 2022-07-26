package data;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		//1시간에 1200원 
		//준비-들어온시간 나간시간 시간당 요금
		int inHour = 12; int inMinute = 40;
		int outHour = 16; int outMinute = 10;
		int pricePerHour = 1200;
		//계산식 이용시간 이용요금
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time = outTime - inTime;
		//System.out.println(time);
		int pricePerMinute = pricePerHour / 60;
		//price= 이용시간 분 * 분당요금
		int price = time * pricePerMinute;
		//System.out.println(pricePerMinute);
		
		//출력
		System.out.println("이용시간은 다음과 같습니다");
		System.out.println(3);
		
		
		
	}
}
