package programmers문제;

public class 서울에서_김서방_찾기 {
	public static void main(String[] args) {
		String[] seoul = new String[] {"Jane","Kim"};
		String answer="";
		int x=0;
		for(int i=0;i<seoul.length;i++) {
			if(seoul[i].equals("Kim")) {
				x=i;
			}
		}
		answer="김서방은 "+x+"에 있다";
		System.out.println(answer);
	}
}
