package programmers;

import java.util.Arrays;

public class K¹øÂ°¼ö {
	public static void main(String[] args) {
		int[] array = new int[] {1,5,2,60,3,7,4};
		int[][] commands = new int[][] {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = new int[commands.length];
		
		for(int i=0;i<commands.length;i++) {
			
			int[] subarr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(subarr);
			answer[i]=subarr[commands[i][2]-1];
			
		}
		
	}

}
