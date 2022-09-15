package condition;
import java.lang.*;
public class Test09_2 {
	public static void main(String[] args) {
		//준비
		
		int birth = 19990101;
		
		int year = birth / 10000;
		int now = 2022;
		int age = now - year + 1;
		System.out.println("age = " + age);
		
		//int price = 0 or 1250 or 720 or 450;
		int price;
		if(age < 8 || age >= 65) {
			price = 0;
		}
		else if(age >= 20) {
			price = 1250;
		}
		else if(age >= 14) {
			price = 720;
		}
		else {
			price = 450;
		}
		
		System.out.println("요금 : "+price+"원");
		
	}
}










