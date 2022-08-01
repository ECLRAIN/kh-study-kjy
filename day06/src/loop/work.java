package loop;

import java.util.Scanner;

public class work {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("단수 : ");
		int dan = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.print(dan + " X " + i + " = ");
			int user = sc.nextInt();
			if(dan * i == user) {
				System.out.println("정답");
			}
			else {
				System.out.println("오답");
			}
		}

		sc.close();
	}
}
