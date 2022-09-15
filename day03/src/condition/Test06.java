package condition;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		//준비
		int speed = 55;
		int limit = 50;
		
		//계산
		//boolean over = 주행속도 > 제한속도;
		boolean over = speed > limit;
		System.out.println("over = " + over);
		
		//출력
		System.out.println("예상 벌금 : ?원");
	}
}
