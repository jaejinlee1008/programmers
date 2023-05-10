package programmers2레벨;

import java.util.HashMap;
import java.util.Map;

public class 롤케이크_자르기 {
	public static void main(String[] args) {
		int[] topping = {1,2,1,3,1,4,1,2};
		
		Map<Integer,Integer> map1 = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();
		
		int count=0;
		for(int i=0;i<topping.length;i++) {
			map1.put(topping[i], map1.getOrDefault(topping[i], 0)+1);
		}
		for(int key : map1.keySet()) {
			System.out.println(key+","+map1.get(key));
		}
		for(int i=topping.length-1;i>0;i--) {
			map2.put(topping[i],map2.getOrDefault(topping[i], 0)+1);
			map1.put(topping[i],map1.get(topping[i])-1);
			if(map1.get(topping[i])==0) {
				map1.remove(topping[i]);
			}
			if(map1.size()==map2.size()) count++;
		}
		System.out.println(count);
	}
}
