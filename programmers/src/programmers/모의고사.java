package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
	public static void main(String[] args) {
		int[] answers=new int[] {1,3,2,4,2};
		int[] A = new int[] {1,2,3,4,5};
		int[] B = new int[] {2,1,2,3,2,4,2,5};
		int[] C = new int[] {3,3,1,1,2,2,4,4,5,5};
		int[] count = new int[] {0,0,0};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<answers.length;i++) {
			if(A[i%5]==answers[i]) {
				count[0]++;
			}
			if(B[i%8]==answers[i]) {
				count[1]++;
			}
			if(C[i%10]==answers[i]) {
				count[2]++;
			}
		}
		int max=Math.max(count[0], Math.max(count[1], count[2]));
		for(int i=0;i<3;i++) {
			if(count[i]==max) {
				list.add(i+1);
			}
		}
		int[] answer = list.stream().mapToInt(i->i).toArray();
		Arrays.sort(answer);
	}
}
