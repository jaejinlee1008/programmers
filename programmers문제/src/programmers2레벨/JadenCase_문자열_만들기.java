package programmers2레벨;

public class JadenCase_문자열_만들기 {
	public static void main(String[] args) {
		String s = "3p s 1 x   sSS Eee ";
		String[] sarr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		String answer = "";
		for(String str : sarr) {
			if(str.length()==0) {
				sb.append(" ");
			}else {
				sb.append(str.substring(0,1).toUpperCase());
				sb.append(str.substring(1).toLowerCase());
				sb.append(" ");
			}
//			System.out.println(str + ", length : " + str.length());
		}
		sb = sb.deleteCharAt(sb.length()-1);
		answer = sb.toString();
		for(int i=0;i<s.length()-answer.length();i++) {
			answer+=" ";
		}
		
		System.out.println(s + ", length : " + s.length());
		System.out.println(answer + ", length : " + answer.length());
//		System.out.println(answer);
		
	}
}
