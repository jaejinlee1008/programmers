package programmers문제;

import java.util.Scanner;

public class 문자열_내_p와_y의_개수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String newstr = str.toLowerCase();
		int pcount=0;
		int ycount=0;
		for(int i=0;i<newstr.length();i++) {
			if(newstr.charAt(i)=='p') {
				pcount++;
			}else if(newstr.charAt(i)=='y') {
				ycount++;
			}
		}
		if(pcount==ycount) {
//			return true;
		}else {
//			return false;
		}
	}
}
