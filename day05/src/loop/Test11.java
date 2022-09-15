package loop;
//import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
//		합계 구하기
//		ex : 1부터 10까지 더한 결과를 출력하세요
		
//		int total = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
//		System.out.println("합계 = " + total);
		
//		int total = 0;
//		total += 1;
//		total += 2;
//		total += 3;
//		total += 4;
//		total += 5;
//		total += 6;
//		total += 7;
//		total += 8;
//		total += 9;
//		total += 10;
//		System.out.println("합계 = " + total);
		
		int total = 0;
		for(int i=1; i <= 10; i++) {
			total += i;
		}
		System.out.println("합계 = " + total);
	}
}








