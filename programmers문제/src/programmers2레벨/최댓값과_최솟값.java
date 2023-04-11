package programmers2레벨;

public class 최댓값과_최솟값 {
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		String[] arr = s.split(" ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(String str : arr) {
			min = Math.min(min, Integer.parseInt(str));
			max = Math.max(max, Integer.parseInt(str));
		}
		String answer = Integer.toString(min)+" "+Integer.toString(max);
	}
}
