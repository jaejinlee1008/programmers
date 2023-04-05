package programmers문제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 크레인_인형뽑기_게임 {
	public static void main(String[] args) {
		int[] moves = new int[] {1,5,3,5,1,2,1,4};
		int[][] board = new int[][] {{0,0,0,0,0},
									 {0,0,1,0,3},
									 {0,2,5,0,1},
									 {4,2,4,4,2},
									 {3,5,1,3,1}};							 
		ArrayList<Queue<Integer>> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		int count=0;
		Queue<Integer> q;
		for(int i=0;i<board.length;i++) {
			q = new LinkedList<>();
			for(int j=0;j<board[i].length;j++) {
				if(board[j][i]!=0) {
					q.add(board[j][i]);
				}
			}
			list.add(q);
		}
		for(int i=0;i<moves.length;i++) {
			
			if(!list.get(moves[i]-1).isEmpty()&&stack.peek()!=list.get(moves[i]-1).peek()) {
				
				stack.push(list.get(moves[i]-1).poll());
			}else if(stack.peek()==list.get(moves[i]-1).peek()) {
				
				count+=2;
				stack.pop();
				list.get(moves[i]-1).poll();
			}
			
		}
		System.out.println(count);
	}
}
