package programmers2레벨;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class 주차_요금_계산 {
	public static void main(String[] args) {
		int[] fees = {180, 5000, 10, 600}; // 기본시간, 기본요금, 단위시간, 단위요금
		String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		Map<String, Stack<String>> map = new HashMap<>();
		for(int i=0;i<records.length;i++) {
			String[] tmp = records[i].split(" ");
			if(!map.containsKey(tmp[1])) {
				Stack<String> stack = new Stack<>();
				stack.push(tmp[0]+tmp[2]);
				map.put(tmp[1], stack);
			}else {
				map.get(tmp[1]).push(tmp[0]+tmp[2]);
			}
		}
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		List<String> keyset = new ArrayList<>(map.keySet());
		Collections.sort(keyset);
		int[] answer = new int[map.size()];
		int i=0;
		for(String key : keyset) {
			int minute=0;
			while(!map.get(key).isEmpty()) {
				String str = map.get(key).pop();
				if(str.endsWith("IN")) {
					minute+=(23*60+59)-(60*Integer.parseInt(str.substring(0,2))+Integer.parseInt(str.substring(3, 5)));
				}else {
					String s = map.get(key).pop();
					minute+=(60*Integer.parseInt(str.substring(0,2))+Integer.parseInt(str.substring(3, 5)))-(60*Integer.parseInt(s.substring(0,2))+Integer.parseInt(s.substring(3, 5)));
				}
			}
			if(minute<=fees[0]) {
				answer[i]=fees[1];
			}else {
				answer[i] = fees[1] + ((minute-fees[0]+fees[2]-1)/fees[2])*fees[3];
			}
			i++;
		}
		for(int j : answer) {
			System.out.println(j);
		}
	}
}
