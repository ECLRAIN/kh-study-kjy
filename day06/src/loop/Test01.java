package loop;

public class Test01 {
	public static void main(String[] args) {
		//중첩 반복문
		//1분간 시간을 출력
		
		for(int hour = 0; hour<24; hour++) {
			for(int min=0; min<60; min++) { //
				for(int sec=0; sec<60; sec++) {
					System.out.println(hour+"시"+min+"분"+sec+"초");
				}
			}
		}
		
		
		
		
		
	}
}
