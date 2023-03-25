package programmers문제;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 나누어_떨어지는_숫자_배열 {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int arr[] = new int[] {5,9,7,10};
		int divisor=5;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		for(int j=0;j<arr.length;j++) {
			int n=pq.poll();
			if(n%divisor==0) {
				list.add(n);
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
		}
	}
}
