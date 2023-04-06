package programmers문제;

import java.util.Stack;

public class 햄버거_만들기 {
	public static void main(String[] args) {
		int[] ingredient=new int[] {1, 3, 2, 1, 2, 1, 3, 1, 2};
		Stack<Integer> stack = new Stack<>();
		int tmp=0;
		int count=0;
		for(int n : ingredient) {
			stack.push(n);
			if(stack.size()>=4&&n==1) {
				stack.pop();
				tmp = stack.pop();
				if(tmp==3) {
					tmp=stack.pop();
					if(tmp==2) {
						tmp=stack.pop();
						if(tmp==1) {
							count++;
						}else {
							stack.push(tmp);
							stack.push(2);
							stack.push(3);
							stack.push(1);
						}
					}else{
						stack.push(tmp);
						stack.push(3);
						stack.push(1);
					}
				}else {
					stack.push(tmp);
					stack.push(1);
				}
			}
			
		}
		for(int i : stack) {
			System.out.print(stack.pop());
		}
		System.out.println(count);
	}
}
