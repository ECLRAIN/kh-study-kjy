package condition2;
import java.lang.*;
public class Test03_2 {
	public static void main(String[] args) {
		
		//준비
		int month = 7;
		
		//출력
		switch(month) {
		case 2:
			System.out.println("28일");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일");
			break;
		default:
			System.out.println("31일");
			break;
		}
		
	}
}
