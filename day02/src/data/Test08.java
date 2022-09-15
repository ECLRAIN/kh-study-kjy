package data;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//준비 - 들어온시간(시/분), 나간시간(시/분)
		int inHour = 12, inMinute = 40;
		int outHour = 16, outMinute = 10;
		int periodPrice = 1000;
		
		//계산 - 가장 작은 단위로 변경해서 계산 후 원래 형태로 복원
		int inTime = inHour * 60 + inMinute;
		//System.out.println(inTime);
		int outTime = outHour * 60 + outMinute;
		
		int time = outTime - inTime;
		//System.out.println(time);
		
		//요금
		int price = time / 10 * periodPrice;
		
		//시간
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		System.out.println("주차요금은 다음과 같습니다");
		System.out.println(price);
		
		System.out.println("주차시간");
		System.out.println(hour);
		System.out.println(minute);
	}
}




