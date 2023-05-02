package programmers2레벨;

import java.util.LinkedList;
import java.util.Queue;

public class 스킬트리 {
	public static void main(String[] args) {
		String skill="CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int answer=0;
		Queue<Character> q = new LinkedList<>();
		for(int i=0;i<skill.length();i++) {
			q.add(skill.charAt(i));
		}
		
		for(String str : skill_trees) {
			int check=0;
			Queue<Character> tmp = new LinkedList<>();
			tmp.addAll(q);
			for(int i=0;i<str.length();i++) {
				if(tmp.contains(str.charAt(i))&&tmp.peek()!=str.charAt(i)) {
					check=1;
					break;
				}else if(tmp.contains(str.charAt(i))&&tmp.peek()==str.charAt(i)){
					tmp.poll();
				}
			}
			if(check==0) answer++;
		}
		System.out.println(answer);
	}
}
