package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 신고_결과_받기 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k=2;
		int[] answer = new int[id_list.length];
		String[] arr;
		
		Set<String> set = new HashSet<String>();
		for(String s: report) {
			set.add(s);
		}
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		HashMap<String, Integer> count = new HashMap<>();
		for(String s : set) {
			arr=s.split(" ");
			map.put(arr[0], map.getOrDefault(arr[0], new ArrayList<String>()));
			map.get(arr[0]).add(arr[1]);
			count.put(arr[1],count.getOrDefault(arr[1], 0)+1);
			
		}
		
		
		
		for(int i=0;i<id_list.length;i++) {
			if(map.containsKey(id_list[i])) {
				for(int j=0;j<map.get(id_list[i]).size();j++) {
					if(count.containsKey(map.get(id_list[i]).get(j))&&count.get(map.get(id_list[i]).get(j))>=k) {
						answer[i]++;
					}
				}
			}
		}
		for(int i : answer) {
			System.out.println(i);
		}
	}
}
