package programmers2레벨;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {
	public static void main(String[] args) {
		int bridge_length=100;
		int weight=100;
		int[] truck_weights= {10};
		int current=0;
		int sec=0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<bridge_length;i++) {
			q.add(-1);
		}
		int idx=0;
		
		while(!q.isEmpty()) {
//			System.out.println(q.peek());
//			System.out.println(current+"현재 도로 무게");
			if(q.size()==bridge_length) {
				int now = q.poll();
				if(now>=0) {
					current-=truck_weights[now];
				}
				sec++;
				if(now==truck_weights.length-1) {
					break;
				}
			}
			if(idx==truck_weights.length||weight-current<truck_weights[idx]) {
				q.add(-1);
			}else {
				q.add(idx);
				current+=truck_weights[idx];
//				System.out.println(idx+"추가");
				idx++;
				
			}

		}
		System.out.println(sec);
	}
}
