package programmers문제;

import java.util.HashMap;

public class 대충_만든_자판 {
	public static void main(String[] args) {
		String[] keymap = new String[] {"ABCDE","ABBCE"};
		String[] targets = new String[] {"ABBEF"};
		int[] answer = new int[keymap.length];
		
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<targets.length;i++) {
			for(int j=0;j<keymap[i].length();j++) {
				map.put(keymap[i].charAt(j), Math.min(map.getOrDefault(keymap[i].charAt(j), j+1),j+1));
			}
		}

		
		for(int i=0;i<targets.length;i++) {
			for(int j=0;j<targets[i].length();j++) {
				if(!map.containsKey(targets[i].charAt(j)))
				{
					answer[i]=-1;
					break;
				}else {
					answer[i]+=map.get(targets[i].charAt(j));
				}
			}
			System.out.println(answer[i]);
		}
 		
	}
}
