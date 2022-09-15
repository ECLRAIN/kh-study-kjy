package array2d;

public class Test05 {
	public static void main(String[] args) {
		//준비
		int row = 3;
		int col = 4;
		
		int[][] arr = new int[row][col];
		
		//계산
		//- x위치와 y위치의 합계가 0부터 5까지인 경우를 찾아서 대입(벗어나는 경우 빼고)
		int n = 1;
		for(int i=0; i <= (row-1) + (col-1); i++) {
			//System.out.println("합계 : " + i); 
			for(int k=i; k >= 0; k--) {
				//if(줄이 범위를 벗어나지 않으면서 칸이 범위를 벗어나지 않는다면) {
				if(k < row && (i-k) < col) {
					//System.out.println("("+k+", "+(i-k)+")");
					arr[k][i-k] = n++;
				}
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
