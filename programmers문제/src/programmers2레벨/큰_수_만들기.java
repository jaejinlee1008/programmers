package programmers2레벨;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class 큰_수_만들기 {
	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		Stack<Character> stack = new Stack<>();
		char[] arr = number.toCharArray();
		int count = 0;
		for (char c : arr) {
			if (count == k) {
				stack.push(c);
			} else if (stack.isEmpty()) {
				stack.push(c);
//				System.out.println("처음" + c);
			} else {
				while(!stack.isEmpty()&&stack.peek()<c&&count<k) {
					stack.pop();
					count++;
//					System.out.println("삭제");
				}
				if(stack.size()<number.length()-k){
					stack.push(c);
				}
				
				
			}
		}
		

		List<Character> list = new LinkedList<>();
		for(char c : stack) {
			list.add(c);
		}
		int tmp=count;
		for(int i=0;i<k-tmp;i++) {
			for(int j=0;j<list.size()-1;j++) {
//				System.out.println("check");
				if(list.get(j)<=list.get(j+1)) {
					list.remove(j);
					count++;
					System.out.println(count);
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char c : list) {
			sb.append(c);
		}
		String answer = sb.toString();
		System.out.println(answer);
	}
}
