package programmers문제;

import java.util.Arrays;

public class 과일_장수 {
	public static void main(String[] args) {
		int k=3;
		int m=4;
		int sum=0;
		int[] score = new int[] {1,2,3,1,2,3,1};
		Arrays.sort(score);
		for(int i=score.length-1;i>=0;i=i-m) {
			if(i-m+1>=0) {
				sum+=score[i-m+1]*m;
				System.out.println("i : "+i+"score[i] : " + score[i]);
			}else {
				break;
			}
			
		}
		System.out.println(sum);
	}
}
