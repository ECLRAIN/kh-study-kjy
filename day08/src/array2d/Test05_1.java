package array2d;

public class Test05_1 {
	public static void main(String[] args) {
		//준비
		int row = 3;
		int col = 4;
		
		int[][] arr = new int[row][col];
		
		//계산
		//- 합계가 늘어나면서 합계를 기준으로 x 위치를 계산하고 합계 - x위치로 y위치를 계산
		int x = 0;//x위치
		int total = 0;//합계
		int n = 1;//대입할 숫자
		for(int i=1; i <= row * col; i++) {
			int y = total - x;//x+y=total이어야 하므로 y=total-x
			System.out.println(i + " → ("+x+", "+y+")");
			arr[x][y] = n++;
			
			x--;
			if(x < 0 || y >= col-1) {//위로 벗어나거나 마지막 칸이라면
				total ++;//합계를 증가시켜서 다음 대각선 라인으로 이동시키도록 처리
				if(total >= row) {
					x = row-1;//마지막줄로 고정
				}
				else {
					x = total;//줄을 증가
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
