package programmers2레벨;

import java.util.Arrays;

public class 최솟값_만들기 {
	public static void main(String[] args) {
		int[] A = {1,2};
		int[] B = {3,4};
		Arrays.sort(A);
		Arrays.sort(B);
		int min=0;
		for(int i=0;i<A.length;i++) {
			min+=A[i]*B[B.length-i-1];
		}
		System.out.println(min);
	}
}
