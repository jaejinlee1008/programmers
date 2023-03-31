package programmers문제;

public class 푸드_파이트_대회 {
	public static void main(String[] args) {
		int[] food = new int[] {1,3,4,6};
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<food.length;i++) {
			for(int j=0;j<food[i]/2;j++) {
				sb.append(i);
			}
		}
		String str1 = sb.toString();
		String str2 = sb.reverse().toString();
		System.out.println(str1+str2);
	}
}
