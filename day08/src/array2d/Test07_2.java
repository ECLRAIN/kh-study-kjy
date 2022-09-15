package array2d;

import java.util.Random;

public class Test07_2 {
	public static void main(String[] args) {
		//지뢰찾기(기본문제)
		int row = 9;
		int col = 9;
		int[][] map = new int[row][col];
		
		//계산
		//1. 지뢰 무작위로 20개 배치
		Random r = new Random();
		int bomb = 20;
		for(int i=0; i < bomb; i++) {
			int x = r.nextInt(row);
			int y = r.nextInt(col);
			if(map[x][y] == 0) {//배치된 적 없는 칸이면
				map[x][y] = 9;//폭탄 배치
			}
			else {//배치된 적 있는 칸이면
				i--;//현재턴 무효화
			}
		}
		
		//출력 (폭탄을 ㉬으로 치환해서 출력)
		System.out.println("<폭탄 배치 결과>");
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				if(map[i][k] == 9) {
					System.out.print("㉬");
				}
				else {
					System.out.print(map[i][k]);
				}
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
		
		//2. 지뢰 제외한 나머지칸의 숫자 계산
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				if(map[i][k] == 9) {//폭탄인 경우 주변 8칸의 숫자를 증가시킨다
					//System.out.println("("+i+", "+k+") 숫자 계산 시작");//확인용 출력코드
					int xmin, xmax, ymin, ymax;
					//x 최소값 처리 : 최상단 행(x == 0)인 경우는 최소값(xmin)은 현재행
					if(i == 0) 	xmin = i;
					else 			xmin = i-1;
					//x 최대값 처리 : 최하단 행(x == row-1)인 경우는 최대값(xmax)은 현재행
					if(i == row-1) 	xmax = i;
					else					xmax = i+1;
					//y 최소값 처리 : 가장 좌측 열(y == 0)인 경우 최소값(ymin)은 현재행
					if(k == 0)	ymin = k;
					else			ymin = k-1;
					//y 최대값 처리 : 가장 우측 열(y == col-1)인 경우 최대값(ymax)은 현재행
					if(k == col-1) ymax = k;
					else			ymax = k+1;
					//System.out.println("("+xmin+", "+ymin+") 부터 ("+xmax+", "+ymax+") 까지 검사");//확인용 출력코드
					
					for(int x=xmin; x <= xmax; x++) {
						for(int y=ymin; y <= ymax; y++) {
							if(x != i || y != k) {//자기자신칸 제외
								if(map[x][y] != 9) {
									map[x][y]++;
								}
							}
						}
					}
				}
			}
		}
		
		//출력 (폭탄을 ㉬으로 치환해서 출력)
		System.out.println("<숫자 계산 결과>");
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				if(map[i][k] == 9) {
					System.out.print("㉬");
				}
				else {
					System.out.print(map[i][k]);
				}
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
