package loop;
//import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		
		int money = 1;
		
		for(int day = 1 ; day <= 30 ; day++) {
			System.out.println(day+"일차 - "+money+"원");
			//money += money;
			money *= 2;
		}
		
	}
}
