package programmers2레벨;

import java.util.Stack;

public class 짝지어_제거하기 {
	public static void main(String[] args) {
		String s = "cdcd";
		Stack<Character> stack = new Stack<>();
		int answer=0;
		for(int i=0;i<s.length();i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}else {
				if(stack.peek()==s.charAt(i)) {
					stack.pop();
				}else {
					stack.push(s.charAt(i));
				}
			}
		}
		if(stack.isEmpty()) {
			answer=1;
		}
		System.out.println(answer);
	}
}
