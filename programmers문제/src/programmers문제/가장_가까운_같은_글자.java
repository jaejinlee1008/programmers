package programmers문제;

public class 가장_가까운_같은_글자 {
	public static void main(String[] args) {
		String s = "foobar";
		int[] answer = new int[s.length()];
		answer[0]=-1;
		for(int i=s.length()-1;i>0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(s.charAt(j)==s.charAt(i)) {
					answer[i]=i-j;
					break;
				}else {
					answer[i]=-1;
				}
			}
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
}
