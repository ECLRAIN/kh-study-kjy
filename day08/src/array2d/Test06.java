package array2d;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		
		//준비
		int size = 5;
		
		int[][] map = new int[size][size];
		//map.length와 map[?].length가 모두 size와 같다
		
		//계산
		Random r = new Random();
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {
				map[i][k] = r.nextInt(25) + 1;
			}
		}
		
		
		//출력
		for(int i=0; i < size; i++) {
			for(int k=0; k < size; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
}
