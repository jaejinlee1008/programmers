package programmers2레벨;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 수식_최대화 {
	public static List<char[]> list = new ArrayList<>();
	public static long max = Long.MIN_VALUE;
	public static void main(String[] args) {
		String expression = "50*6-3*2";
		List<Character> sign = new ArrayList<>();
		if(expression.contains("-")) {
			sign.add('-');
		}
		if(expression.contains("+")) {
			sign.add('+');
		}
		if(expression.contains("*")) {
			sign.add('*');
		}
		char[] arr = new char[sign.size()];
		for(int i=0;i<sign.size();i++) {
			arr[i] = sign.get(i);
		}
//		System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
		char[] output = new char[sign.size()];
		boolean[] visited = new boolean[sign.size()];
		perm(arr,output,visited,0,sign.size());
		for(int i=0;i<list.size();i++) {
			List<String> tmp = new LinkedList<>();
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<expression.length();j++) {
				if(expression.charAt(j)=='-'||expression.charAt(j)=='+'||expression.charAt(j)=='*') {
					tmp.add(sb.toString());
					tmp.add(Character.toString(expression.charAt(j)));
					sb.setLength(0);
				}else {
					sb.append(expression.charAt(j));
				}
			}
			tmp.add(sb.toString());
//			for(String str : tmp) {
//				System.out.println(str);
//			}
			int idx=0;
			while(tmp.size()!=1) {
				
//				System.out.println(tmp.size()+"----------------");
				for(int k=0;k<tmp.size();k++) {
//					System.out.println(tmp.get(k));
					if(tmp.get(k).equals(Character.toString(list.get(i)[idx]))) {
//						System.out.println(k+"kkkk");
						tmp.set(k-1, Long.toString(calc(Long.parseLong(tmp.get(k-1)),Long.parseLong(tmp.get(k+1)),tmp.get(k).charAt(0))));
						tmp.remove(k);
						tmp.remove(k);
						k-=2;
					}
				}
				idx++;
			}
//			System.out.println(tmp.get(0));
			max = Math.max(Math.abs(Long.parseLong(tmp.get(0))), max);
		}
		System.out.println(max);
	}
	
	public static void perm(char[] arr, char[] output, boolean[] visited, int dept, int r) {
		if(dept==r) {
			list.add(output.clone());
			return;
		}
		for(int i=0;i<r;i++) {
			if(!visited[i]) {
				visited[i]=true;
				output[dept] = arr[i];
				perm(arr,output,visited,dept+1,r);
				visited[i]=false;
			}
		}
		
	}
	public static long calc(long num1,long num2,char sign) {
		if(sign=='-') {
			return num1-num2;
		}else if(sign=='+') {
			return num1+num2;
		}else {
			return num1*num2;
		}
	}
}
