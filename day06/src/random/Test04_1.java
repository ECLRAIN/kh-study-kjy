package random;

import java.util.Random;
import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int life = 3;
		
		while(true) {
			int a = r.nextInt(8) + 2;
			int b = r.nextInt(9) + 1;
			
			System.out.print(a + " x " + b + " = ");
			
			int user = sc.nextInt();
			
			if(user == a * b) {
				//System.out.println("정답");
			}
			else {
				//System.out.println("오답");
				life--;
				System.out.println("남은 기회 : " +life+"번");
				
				if(life == 0) {//남은 라이프가 0이라면 탈출!
					break;
				}
			}
		}
		
		sc.close();
		
		System.out.println("게임 오버");
	}
}
