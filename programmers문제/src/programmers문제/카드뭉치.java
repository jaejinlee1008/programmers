package programmers문제;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class 카드뭉치 {
	public static void main(String[] args) {
		String[] cards1 = new String[] {"i","drink","water"};
		String[] cards2 = new String[] {"want","to"};
		String[] goal = new String[] {"i","want","to","drink","water"};
		
		Deque<String> q1 = new LinkedList<String>(Arrays.asList(cards1));
		Deque<String> q2 = new LinkedList<String>(Arrays.asList(cards2));
		String str1="";
		String str2="";
		String answer = "No";
		for(int i=0;i<goal.length;i++) {
			if(q1.isEmpty()&&q2.isEmpty()) break;
			if(!q1.isEmpty()) {
				str1 = q1.poll();
			}
			if(!q2.isEmpty()) {
				str2 = q2.poll();
			}
			
			if(goal[i].equals(str1)) {
				q2.addFirst(str2);
				answer="Yes";
			}else if(goal[i].equals(str2)) {
				q1.addFirst(str1);
				answer="Yes";
			}else {
				answer = "No";
				break;
			}
			str1="";
			str2="";
		}
		System.out.println(answer);
	}
}
