package programmers;

public class 최소직사각형 {
	public static void main(String[] args) {
		int [][] sizes = new int[][] {{10,7},{12,3},{8,15},{14,7},{5,15}};
		int rowmax=0;
		int colmax=0;
		int result = 0;
		for(int i=0;i<sizes.length;i++) {
			if(sizes[i][1]>=sizes[i][0])
			{
				int tmp=sizes[i][1];
				sizes[i][1]=sizes[i][0];
				sizes[i][0]=tmp;
			}
			if(sizes[i][0]>rowmax) {
				rowmax = sizes[i][0];
			}
			if(sizes[i][1]>colmax) {
				colmax = sizes[i][1];
			}
		}
		result = rowmax*colmax;
		
	}
}
