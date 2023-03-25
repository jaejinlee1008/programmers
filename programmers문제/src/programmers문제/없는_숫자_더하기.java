package programmers문제;

public class 없는_숫자_더하기 {
	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,3,4,6,7,8,0};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i];
		}
		int answer = 45-sum;
	}
}
