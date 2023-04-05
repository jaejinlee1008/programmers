package programmers문제;

import java.util.HashMap;

public class 추억_점수 {
	public static void main(String[] args) {
		String[] name=new String[] {"may","kein","kain","radi"};
		int[] yearning = new int[] {5,10,1,3};
		String[][] photo = new String[][] {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int[] answer = new int[photo.length];
		for(int i=0; i<name.length;i++) {
			map.put(name[i], yearning[i]);
		}
		for(int i=0;i<photo.length;i++) {
			for(int j=0;j<photo[i].length;j++) {
				if(map.containsKey(photo[i][j])) {
					answer[i]+=map.get(photo[i][j]);
				}
			}
			System.out.println(answer[i]);
		}
	}
}
