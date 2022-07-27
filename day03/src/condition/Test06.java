package condition;
import java.lang.*;
public class Test06 {
	public static void main(String [] args) {
	//준비
		int speed= 60;
		int limit = 50;
		
	//계산
		boolean over=speed>limit;
		int penalty;
		if(over) {
			penalty =30000 + (speed-limit) / 10*10000;
		}
		else {
			penalty =0;
		}
	//출력
		System.out.println("예상 벌금 : "+penalty+" 원");
		
		if(speed>50) {
			
		}
	}
}
