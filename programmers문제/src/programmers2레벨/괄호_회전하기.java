package programmers2레벨;

import java.util.HashMap;
import java.util.Stack;

public class 괄호_회전하기 {
	public static void main(String[] args) {
		String s = "";
		int len = s.length();
		HashMap<Character,Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		int count=0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len+i;j++) {
				if(map.containsKey(s.charAt(j%len))){
					stack.add(s.charAt(j%len));
				}else if(stack.isEmpty()) {
					stack.add(s.charAt(j%len));
					break;
				}else {
					if(map.get(stack.peek())==s.charAt(j%len)) {
						stack.pop();
					}else {
						break;
					}
				}
			}
			if(stack.isEmpty()) {
				count++;
			}else {
				stack.clear();
			}
		}
		System.out.println(count);
		
	}
}
