package programmers문제;

public class 시저_암호 {
	public static void main(String[] args) {
		String s = "z";
		int n = 1;
		StringBuffer sb = new StringBuffer();
		int[] sarr = new int[26];
		int[] barr = new int[26];
		for(int i=0;i<26;i++) {
			barr[i] = i+65;
			sarr[i] = i+97;
		}
		
		for(int j=0;j<s.length();j++) {
			int num = (int)s.charAt(j);
			if(num>=65&&num<=90) {
				num-=65;
				num = (num+n)%26;
				sb.append((char)barr[num]);
			}else if(num>=97&&num<=122) {
				System.out.println(num);
				num-=97;
				num = (num+n)%26;
				System.out.println(num);
				sb.append((char)sarr[num]);
			}else {
				sb.append(s.charAt(j));
			}
		}
		String news = sb.toString();
		System.out.println(news);
	}
}
