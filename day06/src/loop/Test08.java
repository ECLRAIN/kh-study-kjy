package loop;

import java.util.Random;
import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
//랜덤으로 구구단 문제를 하나 출제하고 사용자가 정답을 입력하면 
//정답과 오답을 판정하는 프로그램을 구현하세요
//단, 문제는 2x1부터 9x9의 범위 내에서 출제해야 합니다
//일단 구구단을 기본으로 깔아
// ? x ? = 참 거짓
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		

		int dan = r.nextInt(8)+2;
		int dan2=r.nextInt(9)+1;
	
		System.out.print(dan+"x"+dan2+"= "); 
		int ok=sc.nextInt();
		if(dan*dan2==ok) {
			System.out.println("정답");
		}
		else {System.out.println("오답");}
		
sc.close();
}
}