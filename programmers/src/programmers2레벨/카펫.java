package programmers2·¹º§;

public class Ä«Æê {
	public static void main(String[] args) {
		int brown=24;
		int yellow=24;
		int[] answer = new int[2];
		for(int i=1;i<=Math.pow(yellow, 0.5);i++) {
			if(yellow%i==0) {
				if((((yellow/i)+2)*2)+(i*2)==brown) {
					answer[0]=yellow/i+2;
					answer[1]=i+2;
					break;
				}
			}
		}
		System.out.println(answer[0]+", "+answer[1]);
	}
}
