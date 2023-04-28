package programmers2레벨;

import java.util.HashSet;
import java.util.Set;

public class 연속_부분_수열_합의_개수 {
	public static void main(String[] args) {
		int[] elements = {7,9,1,1,4};
		Set<Integer> set = new HashSet<>();
		int tmp=0;
		for(int i=0;i<elements.length;i++) {
			tmp = elements[i];
			set.add(tmp);
			
			for(int j=i+1;j<elements.length+i;j++) {
				tmp+=elements[j%elements.length];
				set.add(tmp);
				
			}
		}
		
		System.out.println(set.size());
	}
}
