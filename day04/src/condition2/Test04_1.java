package condition2;
import java.lang.*;
public class Test04_1 {
	public static void main(String[] args) {
		//(1) 윤년 판정
		
		//준비
		int year = 2022;
		
		//계산
		//System.out.println("4로 나눈 나머지 = " + year % 4);
		//System.out.println("100으로 나눈 나머지 = " + year % 100);
		//System.out.println("400으로 나눈 나머지 = " + year % 400);
		boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		
		if(leap == true) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
		
	}
}
