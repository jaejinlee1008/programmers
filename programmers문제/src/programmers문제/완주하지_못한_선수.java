package programmers문제;

import java.util.Arrays;

public class 완주하지_못한_선수 {
	public static void main(String[] args) {
		String[] participant = new String[] {"mislav","mislav","mislav","mislav", "stanko", "mislav", "ana"};
		String[] completion = new String[] {"mislav","mislav","mislav","stanko", "ana", "mislav"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i=0;
		for(i=0;i<completion.length;i++) {
			if(!completion[i].equals(participant[i])) {
//				return participant[i];
			}
		}
		
	}
}
