package day03;
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		//kh찜질방에서는 장시간 머무르는 손님들을 없에기 위해
		//최초 입장 후 5시간이 지나면 10분당 천원의 추가요금을 부과합니다
		//어떤 손님이 9시 50분에 들어와서 16시 22분에 나가려고 할 때
		//이 손님이 추가요금 대상인지 판정하여 출력하고 추가요금을 출력
		//준비
		int inHour = 9; int inMinute = 50;
		int outHour = 16; int outMinute = 22;
		int pricePerHour = 1000;
		//계산
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int time= outTime - inTime;
		
		System.out.println(time);
		System.out.println("time="+time);
		//boolean over=이용시간이 5시간 이상;
		//boolean over=이용시간이 300분 이상;
		boolean over= time>=300;
		//추가요금
		int overtimeprice = (time-300)/10*1000;
		
		//출력
		System.out.println("overtimeprice="+overtimeprice);
		
		System.out.println("over="+over);
	}
}
