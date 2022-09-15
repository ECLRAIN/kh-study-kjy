package condition2;
import java.lang.*;
public class Test03_3 {
	public static void main(String[] args) {
		
		//준비
		int month = 7;
		
		//계산
		//int max = 28 or 30 or 31;
		int max;
		switch(month) {
		case 2:
			max = 28;
			break;
		case 4: case 6: case 9: case 11:
			max = 30;
			break;
		default:
			max = 31;
			break;
		}
		
		//출력
		System.out.println(max+"일");
		
	}
}
