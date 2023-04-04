package programmers문제;

import java.util.LinkedList;
import java.util.Queue;

public class 덧칠하기 {
	public static void main(String[] args) {
		int n=5;
		int m=4;
		int[] section = new int[] {1,3};
		int num=0;
		int count=0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<section.length;i++) {
			queue.add(section[i]);
		}
		while(!queue.isEmpty()) {
			num=queue.poll();
			count++;
			
			while (!queue.isEmpty() && queue.peek() <= num + m - 1) {
				queue.poll();
			}
			
		}
		System.out.println(count);
	}
}
