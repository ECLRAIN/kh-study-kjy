package condition;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		//준비 - 인원수, 기간, 월
		int people = 1;
		int day = 1;
		
		//계산
		int price = people * day * 100000;
		
		//출력
		System.out.println("요금 : "+price+"원");
	}
}
