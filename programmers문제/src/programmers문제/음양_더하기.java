package programmers문제;

public class 음양_더하기 {
	public static void main(String[] args) {
		int[] absolutes = new int[] {4,7,12};
		boolean[] signs = new boolean[] {true,false,true};
		int answer=0;
		for(int i=0;i<absolutes.length;i++) {
			if(signs[i]) {
				answer+=absolutes[i];
			}else {
				answer-=absolutes[i];
			}
		}
		System.out.println(answer);
	}
}
