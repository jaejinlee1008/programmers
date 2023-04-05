package programmers문제;

public class 신규_아이디_추천 {
	public static void main(String[] args) {
		String new_id = "=.=";
		String answer="";
		StringBuilder sb = new StringBuilder();
		answer=new_id.toLowerCase();
		for(int i=0;i<answer.length();i++) {
			if((answer.charAt(i)>='a'&&answer.charAt(i)<='z')||
					(answer.charAt(i)>='0'&&answer.charAt(i)<='9')||
					answer.charAt(i)=='-'||answer.charAt(i)=='_'||answer.charAt(i)=='.') {
				sb.append(answer.charAt(i));
			}
		}
		answer=sb.toString();
		while(answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		
		if(answer.startsWith(".")) {
			answer=answer.substring(1);
		}
		if(answer.endsWith(".")) {
			answer=answer.substring(0, answer.length()-1);
		}
		if(answer.length()==0) {
			answer="a";
		}else if(answer.length()>=16) {
			answer=answer.substring(0, 15);
		}
		if(answer.charAt(answer.length()-1)=='.') {
			answer=answer.substring(0, answer.length()-1);
		}
		while(answer.length()<3) {
			answer+=answer.charAt(answer.length()-1);
		}
		System.out.println(answer);
	}
}
