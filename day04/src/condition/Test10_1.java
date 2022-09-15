package condition;
import java.lang.*;
public class Test10_1 {
	public static void main(String[] args) {
		
		//준비
		int second = 18374781;
		
		if(second <= 10) {
			System.out.println("방금 전");
		}
		else if(second < 60) {
			System.out.println(second + "초 전");
		}
		else if(second < 1*60*60) {
			int minute = second / 60;
			System.out.println(minute + "분 전");
		}
		else if(second < 1*24*60*60) {
			int hour = second / 60 / 60;
			System.out.println(hour+"시간 전");
		}
		else {
			int day = second / 60 / 60 / 24;
			System.out.println(day+"일 전");
		}
	}
}





