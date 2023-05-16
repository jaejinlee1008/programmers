package programmers2레벨;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 연속된_부분_수열의_합 {
	public static void main(String[] args) {
		int[] sequence = {2,2,2,2,2};
		int k=6;
		int left=0;
		int right=0;
		int sum = sequence[0];
		Map<Integer,int[]> map = new HashMap<>();
		while(left<sequence.length-1) {
			if(sum<k&&right<sequence.length-1) {
				right++;
				sum+=sequence[right];
			}else if(sum>k) {
				sum-=sequence[left];
				left++;
			}else if(sum==k) {
				if(!map.containsKey(right-left+1)) {
					map.put(right-left+1, new int[] {left,right});
//					System.out.println(left+","+right+"빙고1");
				}
				if(right<sequence.length-1) {
					right++;
					sum+=sequence[right];
				}else if(left<sequence.length-1) {
					sum-=sequence[left];
					left++;
				}
			}else {
				sum-=sequence[left];
				left++;
			}
//			System.out.println(left + "," + right + "," + sum);
		}
		if(sum==k) {
			if(!map.containsKey(right-left+1)) {
				map.put(right-left+1, new int[] {left,right});
//				System.out.println(left+","+right+"빙고2");
			}
		}
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		int[] answer = map.get(list.get(0));

	}
}
