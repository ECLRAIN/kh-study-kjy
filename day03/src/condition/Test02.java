package condition;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		
		//준비
		int exam1 = 85;
		int exam2 = 52;
		
		//계산
		int total = exam1 + exam2;
		double average = (double)total / 2;
		
		//출력
		System.out.println("평균 점수 = " + average + "점");
		
		if(average >= 60){
			System.out.println("통과입니다");
		}
		if(average < 60){
			System.out.println("재시험을 보셔야 합니다");
		}
		
	}
}



