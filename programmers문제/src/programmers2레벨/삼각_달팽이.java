package programmers2레벨;

import java.util.ArrayList;
import java.util.List;

public class 삼각_달팽이 {

	public static void main(String[] args) {
		int n = 6;
		
		int[][] arr = new int[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
		}
		fill(arr,0,0,0,n);
		List<Integer> answer = new ArrayList<>();
		for(int i=0;i<n;i++) {
			for(int h : arr[i]) {
				answer.add(h);
			}
		}
		System.out.println(answer.toString());
	}

	public static void fill(int[][] arr, int row, int col, int start, int len) {
		if (len == 1) {
			arr[row][col]=++start;
			return;
		}else if(len<1) {
			return;
		}
		else {
			for (int i = 0; i < len; i++) {
				arr[row++][col] = ++start;
			}
			row--;
			for(int i=1;i<len;i++) {
				arr[row][col+i]=++start;
			}
			for(int i=col+len-2;i>col;i--) {
//				System.out.println(row);
				arr[--row][i]=++start;
				
			}
//			System.out.println(row+","+col+","+start);
			fill(arr,row+1,col+1,start,len-3);
		}
	}
}
