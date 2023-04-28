package programmers2레벨;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<clothes.length;i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
			
		}
		System.out.println(map.get("eyewear"));
		System.out.println(map.get("headgear"));
		int[] arr = new int[map.size()];
		int i=0;
		for(String key : map.keySet()) {
			arr[i] = map.get(key);
			System.out.println(arr[i]);
			i++;
		}
		int count=0;
		int tmp=1;
		for(int j=0;j<arr.length;j++) {
			tmp*=arr[j]+1;
		}
		count = tmp-1;
		System.out.println(count);
	}
}
