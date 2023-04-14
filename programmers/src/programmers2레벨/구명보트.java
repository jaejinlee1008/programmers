package programmers2레벨;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 구명보트 {
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit=100;
		int current=limit;
		int count=0;
		Arrays.sort(people);
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=0;i<people.length;i++) {
			dq.add(people[i]);
		}
		
		while(!dq.isEmpty()) {
			count++;
			if(dq.peekLast()<=current) {
				current-=dq.peekLast();
				dq.pollLast();
				while(!dq.isEmpty()&&current>0) {
					if(dq.peek()<=current) {
						current-=dq.peek();
						dq.poll();
					}else {
						break;
					}
				}
			}
			current=limit;
		}
		System.out.println(count);
	}
}
