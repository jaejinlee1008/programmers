package programmers2레벨;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 기능개발 {
	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		Queue<Integer> pq = new LinkedList<>();
		Queue<Integer> sq = new LinkedList<>();
		for(int i=0;i<progresses.length;i++) {
			pq.add(progresses[i]);
			sq.add(speeds[i]);
		}
		Stack<Integer> stack = new Stack<>();
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		int percent=0;
		int speed=0;
		while(!pq.isEmpty()) {
			percent = pq.poll();
			speed=sq.poll();
			int day = ((100-percent)+speed-1)/speed;
			if(stack.isEmpty()) {
				stack.push(day);
				map.put(day, 1);
			}else {
				if(stack.peek()<day) {
					stack.push(day);
					map.put(day, 1);
				}else {
					map.put(stack.peek(), map.getOrDefault(stack.peek(), 0)+1);
				}
			}
		}
		int[] answer = new int[map.size()];
		int i=0;
		for(Integer key : map.keySet()) {
			answer[i] = map.get(key);
			i++;
		}
	}
}
