package programmers2레벨;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 메뉴_리뉴얼 {
	public static Map<String,Integer> map = new HashMap<>();
	public static void main(String[] args) {
		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2,3,5};
		
		for(int i=0;i<orders.length;i++) {
			boolean[] visited = new boolean[orders[i].length()];
			char[] tmp = orders[i].toCharArray();
			Arrays.sort(tmp);
			for(int j=0;j<course.length;j++) {
				if(orders[i].length()>=course[j]) {
					combination(tmp,visited,0,orders[i].length(),course[j]);
				}
				
			}
			
		}
		Map<Integer,Integer> maxmap = new HashMap<>();
		for(String key : map.keySet()) {
//			System.out.println(key + "," + map.get(key));
			if(maxmap.containsKey(key.length())) {
				if(maxmap.get(key.length())<map.get(key)) {
					maxmap.put(key.length(), map.get(key));
				}
			}else {
				maxmap.put(key.length(), map.get(key));
			}
		}
//		for(int key : maxmap.keySet()) {
//			System.out.println(key + "," + maxmap.get(key));
//		}
		List<String> answer = new ArrayList<>();
		for(String key : map.keySet()) {
			if(maxmap.get(key.length())==map.get(key)&&map.get(key)>=2) {
				answer.add(key);
			}
		}
		Collections.sort(answer);
//		for(String s : answer) {
//			System.out.println(s);
//		}
	}
	public static void combination(char[] order,boolean[] visited,int start,int n,int r) {
		if(r==0) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<visited.length;i++) {
				if(visited[i]) {
//					System.out.print(order[i] + " ");
					sb.append(order[i]);
				}
			}
//			System.out.println();
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
			return;
		}
		for(int i=start;i<n;i++) {
			if(!visited[i]) {
				visited[i]=true;
				combination(order,visited,i+1,n,r-1);
				visited[i]=false;
			}
		}
	}
	
	
}
