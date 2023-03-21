package programmers문제;

import java.util.Scanner;

public class 나머지가_1이_되는_수_찾기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x=0;
		for(int i=1;i<=n-1;i++) {
			if((n%i)==1) {
				x=i;
				break;
			}
		}
		System.out.println(x);
	}
}
