package programmers2레벨;

import java.util.PriorityQueue;

public class 더_맵게 {
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		int count=0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i : scoville) {
			pq.add(i);
		}
		while(pq.peek()<K&&!pq.isEmpty()) {
			int tmp = pq.poll();
			if(pq.isEmpty()) {
//				return -1;
			}else {
				tmp+=pq.poll()*2;
				pq.add(tmp);
				count++;
			}
		}
		System.out.println(count);
	}
}
