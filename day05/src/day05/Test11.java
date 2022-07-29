package day05;

import java.lang.*;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("구구단 첫단을 입력하세요");
		int first = user.nextInt();

		int count = 0;
		int count2 = 0;
		for (int i = 1; i <= 9; i += 1) {

			System.out.println(first + "x" + i);
			int num2 = user.nextInt(); // 사용자 입력한 정답

			if (first * i == num2) {
				count++;
			} else if (first * i != num2)
				count2++;
			else {
			}
		}

		// if가 참일경우
		// 예 5*1=5일경우 참이다
		// ELES
		user.close();
		System.out.println("정답: " + count);
		System.out.println("오답: " + count2);
	}
}
