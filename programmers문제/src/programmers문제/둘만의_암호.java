package programmers문제;

public class 둘만의_암호 {
	public static void main(String[] args) {
		String s = "aukkz";
		String skip = "wbqd";
		int index = 5;
		String str = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for(char c : skip.toCharArray()) {
			str = str.replace(Character.toString(c), "");
		}
		
		
		for(int i=0;i<s.length();i++) {
			sb.append(str.charAt((str.indexOf(s.charAt(i))+index)%str.length())); 
		}
	}
}
