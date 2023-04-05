package programmers문제;

public class 옹알이 {
	public static void main(String[] args) {
		String[] babbling = new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		String[] sound = new String[] {"aya", "ye", "woo", "ma"};
		int count=0;
		for(int i=0;i<babbling.length;i++) {
			for(int j=0;j<sound.length;j++) {
				babbling[i] = babbling[i].replace(sound[j]+sound[j], "!");
				babbling[i] = babbling[i].replace(sound[j], ",");
			}			
			
			babbling[i] = babbling[i].replace(",", "");
			if(babbling[i].equals("")) {
				count++;
			}
		}
		for(int i=0;i<babbling.length;i++) {
			System.out.println(babbling[i]);
		}
		System.out.println(count);
	}
}
