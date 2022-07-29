package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		//손님이 입력하는 정보
		//윤년 판정
		//준비
		
		int year=2022;
		//계산
		System.out.println(year%4);
		System.out.println(year%100);
		System.out.println(year%400);
		
		//boolean leap= true or false;
		boolean leap;
		if(year%4 !=0) {//year가 4의 배수가 아니면
			leap=false;
		}
	//	if() {
	//	System.out.println("윤년입니다");}
		//else {
		//System.out.println("평년입니다");}
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("연도를 입력하세요");
		//int year=sc.nextInt();
		
		//sc.close();
	}
}
