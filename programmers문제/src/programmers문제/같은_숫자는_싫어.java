package programmers문제;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
//		int[] resultArr = Arrays.stream(arr).distinct().toArray();
//		for(int i=0;i<resultArr.length;i++) {
//			System.out.println(resultArr[i]);
//		}
		List<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				result.add(arr[i]);
			}
		}
		int[] resultArr = result.stream().mapToInt(i->i).toArray();
	}
}
