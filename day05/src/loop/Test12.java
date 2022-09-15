package loop;
import java.lang.*;
public class Test12 {
	public static void main(String[] args) {
		
		//일자를 기준으로 반복문을 구현
		int pushup = 3;
		for(int day=1 ; day <= 30; day++) {
			//System.out.println(day+"일자 - "+day*3+"개");
			System.out.println(day+"일자 - "+pushup+"개");
			pushup += 3;
		}
		
		
	}
}
