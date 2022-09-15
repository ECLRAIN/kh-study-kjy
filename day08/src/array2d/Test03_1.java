package array2d;

public class Test03_1 {
	public static void main(String[] args) {
		//준비
		int row = 3;
		int col = 4;
		
		int[][] arr = new int[row][col];
		//arr.length는 row와 같다
		//arr[?].length는 col과 같다
		
		//계산
		int count = 1;
		for(int i=0; i < arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				//arr[i][k] = i * arr[i].length + k + 1;
				
				//arr[i][k] = count;
				//count++;
				
				arr[i][k] = count++;//넣고 증가
				//arr[i][k] = ++count;//증가하고 넣어라
			}
		}
		
		//출력
		for(int i=0; i < arr.length; i++) {
			for(int k=0; k < arr[i].length; k++) {
				System.out.print(arr[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
