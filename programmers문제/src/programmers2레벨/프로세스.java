package programmers2레벨;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class 프로세스 {
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2;
		int count=0;
		Queue<Map.Entry<Integer,Integer>> mq = new LinkedList<>();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<priorities.length;i++) {
			map.put(i, priorities[i]);
			mq.add(Map.entry(i, priorities[i]));
		}
		Arrays.sort(priorities);
		Queue<Integer> queue = new LinkedList<>();
		for(int i=priorities.length-1;i>=0;i--) {
			queue.add(priorities[i]);
		}
		while(!mq.isEmpty()) {
			if(queue.peek()==mq.peek().getValue()) {
				count++;
				if(mq.peek().getKey()==location) {
					break;
				}
				queue.poll();
				mq.poll();
			}else {
				mq.add(mq.poll());
			}
		}
		System.out.println(count);
	}
}
