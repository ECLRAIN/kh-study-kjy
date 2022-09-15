package condition2;
import java.lang.*;
public class Test04_2 {
	public static void main(String[] args) {
		//(1) 윤년 판정
		
		//준비
		int year = 2020;
		int month = 2;
		
		//계산
		//System.out.println("4로 나눈 나머지 = " + year % 4);
		//System.out.println("100으로 나눈 나머지 = " + year % 100);
		//System.out.println("400으로 나눈 나머지 = " + year % 400);
		boolean leap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		int day;
		switch(month) {
		case 2:
			//day = 28 or 29;
			if(leap == true) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default:
			day = 31;
			break;
		}
		
		
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다");
		
	}
}
