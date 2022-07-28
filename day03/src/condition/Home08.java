package condition;
import java.lang.*;
public class Home08 {
	public static void main(String [] args) {
		//준비
		int people= 2;
		int day= 3;
		int month=7;
		//계산
		int price =people*day*100000;
		//출력
		if(5<month && month<9) {
			System.out.println("여름 할인 적용!");
			System.out.println("요금: "+price*75/100+"원");
		}
		else {
			System.out.println(price);
		}
	}
}
