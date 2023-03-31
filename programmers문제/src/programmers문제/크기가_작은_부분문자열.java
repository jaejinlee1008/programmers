package programmers문제;

import java.util.ArrayList;

public class 크기가_작은_부분문자열 {
	public static void main(String[] args) {
		String t="3141592";
		String p="271";
		int len = p.length();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<=t.length()-len;i++) {
			System.out.println((t.substring(i, i+len)).compareTo(p));
			if((t.substring(i, i+len)).compareTo(p)<=0) {
				list.add((t.substring(i, i+len)));
			}
			
		}
		for(String n : list) {
			System.out.println(n);
		}
		int answer = list.size();
	}
}
