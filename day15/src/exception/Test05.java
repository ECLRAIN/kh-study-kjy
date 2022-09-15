package exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		//이름, 국어점수, 영어점수, 수학점수를 입력받아 총점과 평균을 계산하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();

		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		sc.close();
		
		int total = korean + english + math;
		float average = total / 3f;
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + average + "점");
		
	}
}






