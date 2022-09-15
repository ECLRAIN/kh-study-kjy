package condition;
import java.lang.*;
public class Test05_1 {
	public static void main(String[] args) {
		
		//준비 - 자장면 금액/수량, 짬뽕 금액/수량
		int jjajang = 5000;
		int jjajangCount = 2;
		int champon = 6000;
		int champonCount = 1;
		
		int discount = 10;//할인율
		
		//계산
		int totalCount = jjajangCount + champonCount;
		int jjajangTotal = jjajang * jjajangCount;
		int champonTotal = champon * champonCount;
		int total = jjajangTotal + champonTotal;
		
		//출력
		//(문제점) 할인율이 10%로 주어졌는데 0.9를 곱하면 계산이 어려워진다
		
		//if(3그릇 이상이면) {
		if(totalCount >= 3) {
			System.out.println("할인 적용!");
			int discountPrice = total * (100-discount) / 100;
			System.out.println("결제 금액 : "+discountPrice+"원");
		}
		else {
			System.out.println("할인 미적용");
			System.out.println("결제 금액 : "+total+"원");
		}
	}
}
