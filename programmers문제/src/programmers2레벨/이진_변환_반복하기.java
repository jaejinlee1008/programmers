package programmers2레벨;

public class 이진_변환_반복하기 {
	public static void main(String[] args) {
		String s = "110010101001";
		int c=0;
		int[] answer=new int[2];
		
		while(!s.equals("1")) {
			c=s.replace("0", "").length();
			answer[1] +=s.length()-c;
			s=Integer.toBinaryString(c);
			answer[0]++;
			System.out.println(s);
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}
}
