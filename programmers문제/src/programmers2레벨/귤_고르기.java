package programmers2레벨;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class 귤_고르기 {
	public static void main(String[] args) {
		int k=2;
		int[] tangerine= {1, 1, 1, 1, 2, 2, 2, 3};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<tangerine.length;i++) {
			map.put(tangerine[i], map.getOrDefault(tangerine[i], 0)+1);
		}
		LinkedList<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());
		list.sort(new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o2.getValue()-o1.getValue();
			}
			
		});
		int i=0;
		while(k>0) {
			if(list.get(i)!=null&&k!=0) {
				k-=list.get(i).getValue();
				i++;
			}else {
				break;
			}
			
		}
		System.out.println(i);
	}
}
