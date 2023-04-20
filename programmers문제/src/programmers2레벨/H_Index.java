package programmers2레벨;

import java.util.Arrays;

public class H_Index {
	public static void main(String[] args) {
		int[] citations= {3,0,6,1,5};
		Arrays.sort(citations);
		int max=0;
		for(int i=0;i<citations.length;i++) {
			if(citations[i]>=citations.length-i) {
				max=Math.max(max, citations.length-i);
			}
		}
		System.out.println(max);
	}
}
