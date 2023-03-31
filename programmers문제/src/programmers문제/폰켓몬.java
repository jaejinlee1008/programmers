package programmers문제;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class 폰켓몬 {
	public static void main(String[] args) {
		int[] nums= new int[] {3,3,3,2,2,4};
		int n = nums.length/2;
		int answer=0;
		HashSet<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
		if(n>=set.size()) {
			answer=set.size();
		}else {
			answer = n;
		}
		System.out.println(answer);
	}
}
