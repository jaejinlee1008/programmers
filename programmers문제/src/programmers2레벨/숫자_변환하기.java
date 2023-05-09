package programmers2레벨;

import java.util.LinkedList;
import java.util.Queue;

public class 숫자_변환하기 {
	public static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		int n=4;
		int answer=-1;
		Queue<int[]> q = new LinkedList<>();
		int count=0;
		q.add(new int[]{y,count});
		while(!q.isEmpty()) {
			int[] current = q.poll();
//			System.out.println(current[0]);
			if(current[0]==x) {
				answer=current[1];
				break;
			}
			if(current[0]-n>=x) {
				q.add(new int[] {current[0]-n,current[1]+1});
			}
			if(current[0]/2>=x&&current[0]%2==0) {
				q.add(new int[] {current[0]/2,current[1]+1});
			}
			if(current[0]/3>=x&&current[0]%3==0) {
				q.add(new int[] {current[0]/3,current[1]+1});
			}
			
		}
		System.out.println(answer);
	}
	
}
