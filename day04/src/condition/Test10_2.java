package condition;
import java.lang.*;
public class Test10_2 {
	public static void main(String[] args) {
		
		//준비
		int second = 18374781;
		
		//String message = "방금 전" or "?초 전" or "?분 전" or "?시간 전" or "?일 전";
		String message;
		if(second <= 10) {
			message = "방금 전";
		}
		else if(second < 1 * 60) {
			message = second + "초 전";
		}
		else if(second < 1 * 60 * 60) {
			int minute = second / 60;
			message = minute + "분 전";
		}
		else if(second < 1 * 24 * 60 * 60) {
			int hour = second / 60 / 60;
			message = hour + "시간 전";
		}
		else {
			int day = second / 24 / 60 / 60;
			message = day + "일 전";
		}
		System.out.println(message);
		
	}
}





