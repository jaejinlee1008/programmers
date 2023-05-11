package programmers2레벨;

import java.util.Stack;

public class 택배상자 {
	public static void main(String[] args) {
		int[] order = {4, 3, 1, 2, 5};
		Stack<Integer> belt = new Stack<>();
		Stack<Integer> sub = new Stack<>();
		int current=1;
		int count=0;
		int[] arr = new int[order.length];
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-order[i]] = i+1;
		}
		for(int i : arr) {
//			System.out.print(i);
			belt.push(i);
		}
		
		while(current<=order.length) {
			if(!belt.isEmpty()&&belt.peek()==current) {
				belt.pop();
				count++;
				current++;
//				System.out.println("메인에서 찾음");
			}else if(!belt.isEmpty()&&belt.peek()!=current) {
				if(sub.isEmpty()) {
					sub.push(belt.pop());
				}else if(sub.peek()==current) {
					sub.pop();
					count++;
					current++;
//					System.out.println("보조에서 찾음");
				}else {
					sub.push(belt.pop());
				}
			}else if(belt.isEmpty()) {
				if(sub.isEmpty()) {
					break;
				}else {
					if(sub.peek()!=current) {
						break;
					}else {
						sub.pop();
						count++;
						current++;
//						System.out.println("메인 비었고 보조에서 찾음");
					}
				}
			}
		}
		System.out.println(count);
	}
}
