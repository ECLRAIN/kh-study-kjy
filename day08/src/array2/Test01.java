package array2;

public class Test01 {
	public static void main(String [] args) {
		int[] data= new int[] {30,50,20,10,40};
		for(int i=0; i<data.length-1; i++) {
			int min=i;
			for(int k=i+1; k<data.length;k++) {
				if(data[min]>data[k])
					min=k;
			}
		}
	}
}
