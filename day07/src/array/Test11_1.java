package array;

public class Test11_1 {
	public static void main(String[] args) {
		//배열 뒤집기
		int[] data = new int[] {30, 10, 20, 50, 40};
		
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		//뒤집기 코드
		int backup;
		
		backup = data[0];
		data[0] = data[4];
		data[4] = backup;
		
		backup = data[1];
		data[1] = data[3];
		data[3] = backup;
		
		
		System.out.println("----------");
		//출력
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
