package programmers문제;

public class 문자열_나누기 {
	public static void main(String[] args) {
		String s = "banana";
		char first=s.charAt(0);
		int yes=0;
		int no=0;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==first) {
				yes++;
			}else {
				no++;
			}
			if(yes==no) {
				s=s.substring(i+1);
				i=-1;
				yes=0;
				no=0;
				count++;
				if(s.length()==0) {
					break;
				}else {
					first = s.charAt(0);
				}
			}
		}
		if(s.length()!=0) {
			System.out.println(count+1);
		}
		System.out.println(count);
	}
}
