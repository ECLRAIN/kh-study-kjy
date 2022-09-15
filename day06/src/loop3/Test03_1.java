package loop3;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			
			total += number;
			System.out.println("total = " + total);
			
			if(total > 100) {
				break;
			}
		}
		
		sc.close();
		
	}
}
