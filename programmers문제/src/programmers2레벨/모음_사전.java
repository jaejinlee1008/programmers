package programmers2레벨;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 모음_사전 {
	public static void main(String[] args) {
		String word = "AAAAE";
		char[] alphabet = {'A','E','I','O','U'};
		Queue<String> q = new LinkedList<>();
		List<String> list = new ArrayList<>();
		for(char c : alphabet) {
			q.add(Character.toString(c));
			list.add(Character.toString(c));
		}

		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty()) {
			sb.setLength(0);
			if(q.peek().length()<5) {
				sb.append(q.poll());
				
				sb.append(alphabet[0]);
				q.add(sb.toString());
				
				list.add(sb.toString());
				sb.deleteCharAt(sb.length()-1);
				
				sb.append(alphabet[1]);
				q.add(sb.toString());
				
				list.add(sb.toString());
				sb.deleteCharAt(sb.length()-1);
				
				sb.append(alphabet[2]);
				q.add(sb.toString());
				
				list.add(sb.toString());
				sb.deleteCharAt(sb.length()-1);
				
				sb.append(alphabet[3]);
				q.add(sb.toString());
				
				list.add(sb.toString());
				sb.deleteCharAt(sb.length()-1);
				
				sb.append(alphabet[4]);
				q.add(sb.toString());
				list.add(sb.toString());
				if(sb.toString().equals("UUUUU")) {
					break;
				}
				sb.deleteCharAt(sb.length()-1);
				
				
			}
		}
//		for (String s : list) {
//			System.out.println(s);
//		}
		Collections.sort(list);
		System.out.println(list.indexOf(word));
	}
}
