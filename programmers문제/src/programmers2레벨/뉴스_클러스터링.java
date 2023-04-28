package programmers2레벨;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class 뉴스_클러스터링 {
	public static void main(String[] args) {
		String str1 = "aa1+aa2";
		String str2 = "AAAA12";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		List<String> set1 = new LinkedList<>();
		List<String> set2 = new LinkedList<>();
		List<String> total = new LinkedList<>();
		HashMap<String,Integer> map1 = new HashMap<>();
		HashMap<String,Integer> map2 = new HashMap<>();
		List<String> min = new LinkedList<>();
		Set<String> totalset = new HashSet<>();

		for(int i=0;i<str1.length()-1;i++) {
			if((str1.charAt(i)>='a'&&str1.charAt(i)<='z')&&(str1.charAt(i+1)>='a'&&str1.charAt(i+1)<='z')) {
				set1.add(str1.substring(i,i+2));
				totalset.add(str1.substring(i,i+2));
				map1.put(str1.substring(i, i+2), map1.getOrDefault(str1.substring(i, i+2), 0)+1);
			}
		}
		for(int i=0;i<str2.length()-1;i++) {
			if((str2.charAt(i)>='a'&&str2.charAt(i)<='z')&&(str2.charAt(i+1)>='a'&&str2.charAt(i+1)<='z')) {
				set2.add(str2.substring(i,i+2));
				totalset.add(str2.substring(i,i+2));
				map2.put(str2.substring(i, i+2), map2.getOrDefault(str2.substring(i, i+2), 0)+1);
			}
		}
		for(String s : totalset) {
			for(int i=0;i<Math.max(map1.getOrDefault(s, 0), map2.getOrDefault(s, 0));i++) {
				total.add(s);
			}
			for(int i=0;i<Math.min(map1.getOrDefault(s, 0), map2.getOrDefault(s, 0));i++) {
				min.add(s);
			}
		}
//		for(String s : totalset) {
//			for(int i=0;i<Math.min(map1.getOrDefault(s, 0), map2.getOrDefault(s, 0));i++) {
//				min.add(s);
//			}
//		}
//		for(String s : set1) {
//			if(set2.contains(s)) {
//				min.add(s);
//			}
//		}
		
		if(min.size()==0&&total.size()==0) {
			System.out.println(65536);
		}
		double num = min.size()/(double)total.size();
		int answer = (int)(num*65536);
		System.out.println(answer);
	}
}
