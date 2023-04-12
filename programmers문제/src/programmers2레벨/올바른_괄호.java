package programmers2레벨;

public class 올바른_괄호 {
	public static void main(String[] args) {
		String s = "())))))))))(((((((()";
		boolean answer = true;
		int open=0;
		int close=0;
		if(s.length()==1) {
//			return false;
		}
		if(s.startsWith(")")) {
			answer = false;
//			rutrun false;
		}else if(s.endsWith("(")){
			answer=false;
//			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				open++;
			}else {
				close++;
			}
			if(close>open) {
				answer=false;
			}
		}
		if(open!=close) {
			answer=false;
		}
		System.out.println(answer);
	}
}
