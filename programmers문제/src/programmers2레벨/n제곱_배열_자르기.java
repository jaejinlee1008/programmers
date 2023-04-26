package programmers2레벨;

public class n제곱_배열_자르기 {
	public static void main(String[] args) {
		int n=3;
		int left=2;
		int right=5;
		int[] answer = new int[right-left+1];
		for(int i=left;i<=right;i++) {
			answer[i-left] = Math.max((i/n)+1, (i%n)+1);
		}
		for(int num : answer) {
			System.out.println(num);
		}
	}
}
