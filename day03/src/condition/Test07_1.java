package condition;
import java.lang.*;
public class Test07_1 {
	public static void main(String[] args) {
		//준비 - 인원수, 기간, 월
		int people = 1;
		int day = 1;
		
		int month = 6;
		
		//계산
		int price = people * day * 100000;
		
		//출력
		//if(여름이라면) {
		
		//if(month가 6, 7, 8중 하나) {
		if(month == 6 || month == 7 || month == 8) {
		
		//if(month가 6에서 8 사이) {
		//if(month >= 6 && month <= 8) {
		
		//if(month가 5보다 크고 9보다 작은 경우) {
		//if(month > 5 && month < 9) {
		
		//if(month / 3 == 2) {
			System.out.println("여름 특가 적용!");
			System.out.println("요금 : "+price*75/100+"원");
		}
		else {
			System.out.println("요금 : "+price+"원");
		}
	}
}
