package programmers2레벨;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {
	public static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		String numbers = "777";
		char[] carr = numbers.toCharArray();
		boolean[] visited = new boolean[carr.length];
		perm(visited,carr,0,"");
		Set<Long> set2 = new HashSet<>();
		for(String s : set) {
			set2.add(Long.parseLong(s));
		}
		int count = set2.size();
		for(long n : set2) {
			System.out.println(n);
			if(n==0||n==1) {
				count--;
			}
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					count--;
					break;
				}
			}
		}
		
		
		System.out.println(count);
	}
	public static void perm(boolean[] visited, char[] carr, int depth, String current) {
		if(depth==carr.length) {
			return;
		}
		for(int i=0;i<carr.length;i++) {
			if(!visited[i]) {
				visited[i]=true;
				depth++;
				current+=carr[i];
				set.add(current);
				perm(visited,carr,depth,current);
				depth--;
				current=current.substring(0,current.length()-1);
				visited[i]=false;
			}
		}
	}
}
