package condition;
import java.lang.*;
public class Test08 {
	public static void main(String [] args) {
		//준비
		int month=5;
		//출력
		if(month==3 || month==4 || month==5) {
			System.out.println("봄");
		}
		else {
			if(month==6 || month==7 || month==8) {
				System.out.println("여름");
			}
			else {
				if(month==9 || month==10 || month==11) {
					System.out.println("가을");
				}
				else {
					System.out.println("겨울");
				}
			}
		}
	}
}
