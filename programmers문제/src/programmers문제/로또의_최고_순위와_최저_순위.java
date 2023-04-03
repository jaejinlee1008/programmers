package programmers문제;

import java.util.stream.IntStream;

public class 로또의_최고_순위와_최저_순위 {
	public static int i=0;
	public static void main(String[] args) {
		int[] lottos = new int[] {2,3,4,5,7,8};
		int[] win_nums = new int[] {31,10,45,1,6,19};
		int zerocount=0;
		int count=0;
		for(i=0;i<6;i++) {
			if(lottos[i]==0) {
				zerocount++;
			}else {
				if(IntStream.of(win_nums).anyMatch(x->x==lottos[i])) {
					count++;
				}
			}
			
		}
		int max = zerocount+count;
		int min = count;
		int[] answer = new int[2];
		if(max<=1) {
			answer[0]=6;
		}else {
			answer[0] = 6-max+1;
		}
		if(min<=1) {
			answer[1] = 6;
		}else {
			answer[1] = 6-min+1;
		}
		
	}
}
