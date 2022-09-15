package loop;
//import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		//준비
		int minute = 2;
		int second = 15;
		
		//계산
		int total = minute * 60 + second;
		//System.out.println("total = " + total);
		
		//출력
		for(int i=total; i >= 0; i--) {
			//System.out.println(i+"초 남았습니다");
			System.out.println(i/60 + "분 " + i%60 + "초 남았습니다");
		}
	}
}




