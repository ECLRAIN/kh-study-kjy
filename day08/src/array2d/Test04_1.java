package array2d;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 : ");
		int row = sc.nextInt();
		System.out.print("칸 수 : ");
		int col = sc.nextInt();
		sc.close();
		
		int[][] arr = new int[row][col];
		
		//계산
		//- (줄,칸) 기준
		//(0,0)→(1,0)→(2,0)→(0,1)→(1,1)→(2,1)→(0,2)→(1,2)→(2,2)→(0,3)→(1,3)→(2,3)
		int n = 1;
		for(int i=0; i < col; i++) {
			for(int k=0; k < row; k++) {
				arr[k][i] = n;
				n++;
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
