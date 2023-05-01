package programmers2레벨;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 압축 {
	public static void main(String[] args) {
		String msg = "KAKAO";
		Map<String,Integer> map = new HashMap<>();
		int current = 26;
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<26;i++) {
			map.put(Character.toString('A'+i), i+1);
		}
		int tmp=0;
		int j=0;
		String stmp="";
		for(int i=0;i<msg.length();i++) {
			sb.setLength(0);
			tmp=0;
			for(j=i;j<msg.length();j++) {
				sb.append(msg.charAt(j));
				stmp = sb.toString();
				if(map.containsKey(stmp)) {
					tmp = map.get(stmp);
				}else {

					current++;
					map.put(stmp,current);
					break;
				}
			}
			list.add(tmp);
			i=j-1;
		}
		for(int num : list) {
			System.out.println(num);
		}
	}
}
