package modifier2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Score a = new Score();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		a.setName(sc.next());
		
		System.out.print("학년 : ");
		a.setLevel(sc.nextInt());
		
		System.out.print("국어 : ");
		a.setKorean(sc.nextInt());
		
		System.out.print("영어 : ");
		a.setEnglish(sc.nextInt());
		
		System.out.print("수학 : ");
		a.setMath(sc.nextInt());
		
		sc.close();
		
		
		a.print();
	}
}