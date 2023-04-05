package programmers문제;

import java.util.HashMap;

public class 성격_유형_검사하기 {
	public static void main(String[] args) {
		HashMap<Character,Integer> map = new HashMap<>();
		map.put('R', 0);
		map.put('T', 0);
		map.put('C', 0);
		map.put('F', 0);
		map.put('J', 0);
		map.put('M', 0);
		map.put('A', 0);
		map.put('N', 0);
		StringBuilder sb = new StringBuilder();
		String answer="";
		String[] survey = new String[]{"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = new int[] {5,3,2,7,5};
		for(int i=0;i<survey.length;i++) {
			if(choices[i]==4) {
				continue;
			}else if(choices[i]<4) {
				map.put(survey[i].charAt(0),map.get(survey[i].charAt(0))+(4-choices[i]));
			}else {
				map.put(survey[i].charAt(1),map.get(survey[i].charAt(1))+(choices[i]-4));
			}
		}
		if(map.get('T')>map.get('R')) {
			sb.append('T');
		}else {
			sb.append('R');
		}
		if(map.get('F')>map.get('C')) {
			sb.append('F');
		}else {
			sb.append('C');
		}
		if(map.get('M')>map.get('J')) {
			sb.append('M');
		}else {
			sb.append('J');
		}
		if(map.get('N')>map.get('A')) {
			sb.append('N');
		}else {
			sb.append('A');
		}
		answer=sb.toString();
		System.out.println(answer);
	}
}
