package loop;
import java.lang.*;
public class Test12_1 {
	public static void main(String[] args) {
		
		//일자를 기준으로 반복문을 구현
		int pushup = 3;
		int total = 0;
		for(int day=1 ; day <= 30; day++) {
			//System.out.println(day+"일자 - "+day*3+"개");
			System.out.println(day+"일자 - "+pushup+"개");
			total += pushup;//total을 pushup 개수만큼 증가시키세요
			pushup += 3;
		}
		
		System.out.println("총 개수 = " + total);
		
	}
}
