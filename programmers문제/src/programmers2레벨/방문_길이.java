package programmers2레벨;

import java.util.HashSet;
import java.util.Set;

public class 방문_길이 {
	public static void main(String[] args) {
		String dirs = "LULLLLLLU";
		int[] current = {0,0};
		int[] next = new int[2];
		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<dirs.length();i++) {
			sb.setLength(0);
			sb2.setLength(0);
			sb.append(Integer.toString(current[0]));
			sb.append(Integer.toString(current[1]));
			if(dirs.charAt(i)=='U') {
				next[0]=current[0];
				if(current[1]==5) {
					next[1]=5;
				}else {
					next[1]=current[1]+1;
				}
			}else if(dirs.charAt(i)=='D') {
				next[0]=current[0];
				if(current[1]==-5) {
					next[1]=-5;
				}else {
					next[1]=current[1]-1;
				}
			}else if(dirs.charAt(i)=='L') {
				next[1]=current[1];
				if(current[0]==-5) {
					next[0]=-5;
				}else {
					next[0]=current[0]-1;
				}
			}else if(dirs.charAt(i)=='R') {
				next[1]=current[1];
				if(current[0]==5) {
					next[0]=5;
				}else {
					next[0]=current[0]+1;
				}
			}
			if(current[0]!=next[0]||current[1]!=next[1]) {
				sb.append(Integer.toString(next[0]));
				sb.append(Integer.toString(next[1]));
				set.add(sb.toString());
				sb2.append(Integer.toString(next[0]));
				sb2.append(Integer.toString(next[1]));
				sb2.append(Integer.toString(current[0]));
				sb2.append(Integer.toString(current[1]));
				set.add(sb2.toString());
			}
			current[0]=next[0];
			current[1]=next[1];
			
		}
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println(set.size()/2);
	}
}
