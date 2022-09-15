package condition;
import java.lang.*;
public class Test06_1 {
	public static void main(String[] args) {
		//준비
		int speed = 55;
		int limit = 50;
		
		//계산
		//boolean over = 주행속도 > 제한속도;
		boolean over = speed > limit;
		
		int fine;
		//if(over == true) {
		if(over) {
			//fine = 30000원 + 10km당 10000원;
			fine = 30000 + (speed - limit) / 10 * 10000;
		}
		else {
			fine = 0;
		}
		
		//출력
		System.out.println("예상 벌금 : " + fine + "원");
	}
}
