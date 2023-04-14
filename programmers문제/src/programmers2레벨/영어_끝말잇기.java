package programmers2레벨;

import java.util.Stack;

public class 영어_끝말잇기 {
	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int n=3;
		Stack<String> stack = new Stack<>();
		int[] answer = new int[2];
		for(int i=0;i<words.length;i++) {
			if(stack.isEmpty()) {
				stack.push(words[i]);
			}else {
				if(!stack.contains(words[i])&&stack.peek().charAt(stack.peek().length()-1)==words[i].charAt(0)) {
					stack.push(words[i]);
				}else {
					System.out.println(words[i]);
					answer[0]=i%n+1;
					answer[1]=(i/n)+1;
					break;
				}
			}
		}
		System.out.println(answer[0]+", "+answer[1]);
		
	}
}
