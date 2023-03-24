package programmers문제;

import java.util.Arrays;

public class 예산 {
	public static void main(String[] args) {
		int[] d = new int[] {2,2,3,3};
		int budget=10;
		int sum=0;
		int answer=d.length;
		Arrays.sort(d);

		for(int i=0;i<d.length;i++) {

			sum+=d[i];
		}
		System.out.println(sum);
		while(sum>budget) {
			System.out.println("sum = " + sum + ", budget = " + budget);
			sum-=d[answer-1];
			answer--;	
			System.out.println("sum"+sum);
			System.out.println("answer"+answer);
		}

		System.out.println(answer);
	}
}
