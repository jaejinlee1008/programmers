package programmers2레벨;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _124_나라의_숫자 {
	public static void main(String[] args) {
		int n=6;
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(0, "4");
		map2.put(1, "1");
		map2.put(2, "2");
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		stack.push(n);
		while(n>3) {
			if(n%3==0) {
				stack.push((n/3)-1);
				n=n/3-1;
			}else {
				stack.push(n/3);
				n/=3;
			}
			
		}

		
		while(!stack.isEmpty())
		{
			System.out.println(stack.peek());

			sb.append(map2.get(stack.pop()%3));
		}
		System.out.println(sb.toString());
	}
}
