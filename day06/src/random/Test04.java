package random;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			
			System.out.print(a + " x " + b + " = ");
			
			int user = sc.nextInt();
			
			if(user == a * b) {
				System.out.println("정답");
			}
			else {
				System.out.println("오답");
			}
		}
		
		//sc.close();
	}
}
