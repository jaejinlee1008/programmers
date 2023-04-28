package programmers2레벨;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 튜플 {
	public static void main(String[] args) {
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		String[] arr = s.split("},\\{");
		arr[0] = arr[0].substring(2);
		arr[arr.length-1] = arr[arr.length-1].replaceAll("}}", "");
		HashMap<String,Integer> map = new HashMap<>();
		for(String str : arr) {
			String[] tmp = str.split(",");
			for(int i=0;i<tmp.length;i++) {
				map.put(tmp[i], map.getOrDefault(tmp[i], 0)+1);
			}
		}
		List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
		list.sort(((o1,o2)->map.get(o2.getKey())-map.get(o1.getKey())));
		int[] answer = new int[map.size()];
		int i=0;
		for(Map.Entry<String, Integer> entry : list) {
			answer[i] = Integer.parseInt(entry.getKey());
			i++;
		}
	}
}
