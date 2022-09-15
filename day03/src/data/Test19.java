package data;
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		
		//준비
		int inHour = 9, inMinute = 50;
		int outHour = 10, outMinute = 10;
		
		//계산
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		
		int time = outTime - inTime;
		System.out.println("time = " + time);
		
		//boolean over = 이용시간이 5시간 초과;
		//boolean over = 이용시간이 300분 초과;
		boolean over = time > 300;
		
		//추가요금
		int overPrice = (time - 300) / 10 * 1000;
		
		//출력
		System.out.println("over = " + over);
		System.out.println("overPrice = " + overPrice);
		
	}
}



