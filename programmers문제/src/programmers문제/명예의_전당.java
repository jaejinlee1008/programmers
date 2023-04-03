package programmers문제;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의_전당 {
	public static void main(String[] args) {
		int k=3;
		int[] score = new int[] {10,100,20,150,1,100,200};
		PriorityQueue<Integer> pq;
		int[] answer = new int[score.length];
		for(int i=0;i<score.length;i++) {
			Arrays.sort(score,0,i+1);
			pq=new PriorityQueue<>();
			if(i<k) {
				for(int j=0;j<=i;j++) {
					pq.add(score[j]);
//					System.out.println(j);
				}
			}else {
				for(int j=i-k+1;j<=i;j++) {
					pq.add(score[j]);
//					System.out.println(j);
				}
			}
			
			answer[i]=pq.poll();
//			System.out.println();
			System.out.println(answer[i]);
		}
	}
}
