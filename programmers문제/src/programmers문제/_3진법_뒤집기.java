package programmers문제;

public class _3진법_뒤집기 {
	public static void main(String[] args) {
		int n=125;
		String three = Integer.toString(n, 3);
		System.out.println(three);
		StringBuffer sb = new StringBuffer(three);
		String reverse = sb.reverse().toString();
		System.out.println(reverse);
		int newnum = Integer.parseInt(reverse,3);
		System.out.println(newnum);
	}
}
