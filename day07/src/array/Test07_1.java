package array;

public class Test07_1 {
	public static void main(String[] args) {

		// 데이터 준비
		double[] data = new double[] { 150.5, 185.2, 177.9, 175.4, 163.6 };

		// 출력
		for (int i = 0; i < data.length; i++) {
			System.out.println("신장 = " + data[i] + "cm");
		}

		// 평균
		double total = 0.0;
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}
		// System.out.println("합계 = " + total);
		double average = total / data.length;
		System.out.println("평균 = " + average + "cm");

		// 최소값의 위치와 데이터
		int index = 0;

		for (int i = 1; i < data.length; i++) {
			// if(index 위치의 값보다 i 위치의 값이 더 작다면) {
			if (data[index] > data[i]) {
				// index를 i로 변경
				index = i;
			}
		}

		System.out.println("작은값은 " + index + " 위치에 있습니다");
		System.out.println("데이터는 " + data[index] + " 입니다");
		
		//평균에 가장 가까운 데이터
		//1. 새로운 배열을 같은 크기로 준비한다
		//2. 모든 데이터를 평균에서 뺀 다음 저장한다
		//3. 비교를 통해 가장 작은 값을 찾는다
	
		
		//gap에서 최소값 위치를 찾으면 평균에 가장 가까운 데이터의 위치를 알 수 있다
		index = 0;
		for(int i=1; i < data.length; i++) {
			//알고있는 위치(index) 값과 평균의 절대차
			double gap1;
			if(data[index] > average) {
				gap1 = data[index] - average;
			}
			else {
				gap1 = average - data[index];
			}
			//현재 위치(i) 값과 평균의 절대차
			double gap2;
			if(data[i] > average) {
				gap2 = data[i] - average;
			}
			else {
				gap2 = average - data[i];
			}
			
			if(gap1 > gap2) {
				index = i;
			}
		}
		System.out.println("평균과 가장 가까운 데이터는 "+index+" 위치에 있습니다");
		System.out.println("데이터 : " + data[index]+"cm");
		
	}
}
















