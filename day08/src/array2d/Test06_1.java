package array2d;

import java.util.Random;

public class Test06_1 {
	public static void main(String[] args) {
		
		//준비
		int size = 7;
		
		int[][] map = new int[size][size];
		//map.length와 map[?].length가 모두 size와 같다
		
		//계산
		Random r = new Random();
		for(int i=1; i <= size*size; i++) {
			int x = r.nextInt(size);
			int y = r.nextInt(size);
			//System.out.println("i = " + i + " , x = " + x + " , y = " + y);
			
			//if(데이터가 들어간적이 없는 칸이라면) {
			if(map[x][y] == 0) {
				map[x][y] = i;
			}
			else {
				//다시 뽑아!
				i--;
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
