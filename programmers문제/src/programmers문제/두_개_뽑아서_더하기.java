package programmers문제;

import java.util.Arrays;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
	public static void main(String[] args) {
		int[] numbers= new int[] {2,1,3,4,1};
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
		System.out.println(set);
		Integer a[] = set.toArray(new Integer[0]);
		int[] answer = Arrays.stream(a).mapToInt(i->i).toArray();
		
	}
}
