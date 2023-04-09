package programmers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 달리기_경주 {
	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		HashMap<String, Integer> map = new HashMap<>();
		int tmp=0;
		String stmp="";
		for(int i=0;i<players.length;i++) {
			map.put(players[i], i+1);
		}
		
		
		for(int i=0;i<callings.length;i++) {
			tmp = map.get(callings[i])-2;
			stmp = players[tmp];
			System.out.println(tmp);
			map.put(callings[i], map.get(callings[i])-1);
			map.put(players[tmp], map.get(players[tmp])+1);
			players[tmp]= callings[i];
			players[tmp+1] = stmp;
		}
		
		
//		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
//		entryList.sort(Map.Entry.comparingByValue());
//		for(Map.Entry<String, Integer> entry : entryList){
//		    System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//		}
	}
}
