package condition;
import java.lang.*;
public class Test07_2 {
	public static void main(String[] args) {
		//준비 - 인원수, 기간, 월
		int people = 1;
		int day = 1;
		
		int month = 6;
		
		//계산
		int price = people * day * 100000;
		
		//int result = price 또는 25%할인된 price;
		int result;
		if(month == 6 || month == 7 || month == 8) {
			result = price * 75 / 100;
		}
		else {
			result = price;
		}
		
		//출력
		System.out.println("<KH여행사 영수증>");
		System.out.println("인원 수 : "+people+"명");
		System.out.println("여행기간 : "+day+"일");
		System.out.println("1인 1박에 100000원");
		System.out.println("할인 전 : "+price+"원");
		System.out.println("할인 후  : "+result+"원");
	}
}
