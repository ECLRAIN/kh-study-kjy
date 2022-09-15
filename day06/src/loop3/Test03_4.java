package loop3;

import java.util.Scanner;

public class Test03_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 100;
		int count = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();
			
			total -= number;
			//System.out.println("total = " + total);
			
			if(total < 0) {
				break;
			}
			else {
				count++;
			}
		}
		
		sc.close();
		
		System.out.println("Game over!");
		System.out.println("총 "+count+"번 입력하셨습니다");
		
	}
}




