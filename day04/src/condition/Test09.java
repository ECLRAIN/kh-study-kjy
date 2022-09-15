package condition;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		//준비
		
		int birth = 19990101;
		
		
		int year = birth / 10000;
		int now = 2022;
		int age = now - year + 1;
		System.out.println("age = " + age);
		
		if(20 <= age && age < 65) {
			System.out.println("요금 : 1250원");
		}
		else if(14 <= age && age < 20) {
			System.out.println("요금 : 720원");
		}
		else if(8 <= age && age < 14) {
			System.out.println("요금 : 450원");
		}
		else {
			System.out.println("요금 : 0원");
		}
	}
}










