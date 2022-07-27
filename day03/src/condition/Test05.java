package condition;
import java.lang.*;
public class Test05 {
	public static void main(String [] args) {
		//준비 - 자장면 금액/수량, 짬뽕 금액/수량
				int jjajang = 5000;
				int jjajangCount = 2;
				int champon = 6000;
				int champonCount = 1;

				//계산
				int totalCount = jjajangCount + champonCount;
				int jjajangTotal = jjajang * jjajangCount;
				int champonTotal = champon * champonCount;
				int total = jjajangTotal + champonTotal;

				//출력
				//if(3그릇 이상이면) {
				if(totalCount >= 3) {
					System.out.println("할인 적용!");
					System.out.println("결제 금액 : "+total*0.9+"원");
				}
				else {
					System.out.println("할인 미적용");
					System.out.println("결제 금액 : "+total+"원");
				}
			}
		}