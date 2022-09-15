package condition2;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//(1) 윤년 판정
		
		//준비
		int year = 2022;
		
		//계산
		//System.out.println("4로 나눈 나머지 = " + year % 4);
		//System.out.println("100으로 나눈 나머지 = " + year % 100);
		//System.out.println("400으로 나눈 나머지 = " + year % 400);
		
		//boolean leap = true or false;
		boolean leap;
		if(year % 4 != 0) {//year가 4의 배수가 아니면
			leap = false;
		}
		//여기서부터는 4의 배수인 경우
		else if(year % 100 == 0 && year % 400 != 0) {//year가 100의 배수지만 400의 배수는 아니라면
			leap = false;
		}
		else if(year % 400 == 0) {//400의 배수라면
			leap = true;
		}
		else {//나머지 4의 배수
			leap = true;
		}
		
		
		if(leap == true) {
			System.out.println("윤년입니다");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
		
	}
}
