package array;

public class Test14_2 {
	public static void main(String[] args) {
		//삽입 정렬(insertion sort)
		//- 모든 자리의 값을 순차적으로 백업 후 들어갈 자리를 만들어 삽입하는 정렬
		
		//준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//정렬
		for(int i=0; i <= 4; i++) {
			int backup = data[i];
			int index = i;
			
			for(int k=i-1; k >= 0; k--) {
				if(backup < data[k]) {
					data[k+1] = data[k];//한칸 우측으로 복사
					index--;//들어갈 위치를 한 칸 왼쪽으로 조정
				}
				else {
					break;
				}
			}
			//System.out.println("index = " + index);
			data[index] = backup;
		}
		
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}




