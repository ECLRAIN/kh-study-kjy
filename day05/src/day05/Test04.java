package day05;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//일의 자리 3|| 6|| 9|| //십의 자리에 
		for(int i= 1 ; i<=99 ; i++) {
			boolean ten =i /10==3 || i/10==6 || i/10==9;
			boolean one =i %10==3 || i%10==6 || i%10==9;
		//	System.out.println(ten);
			if(ten || one) {
				if(ten&&one) {
					System.out.println("짝짝");
				}
				else {
					System.out.println("짝");
				}
			}
			else {
				System.out.println(i);
			}

		}

		

	}
}
