package programmers2레벨;

public class 다음_큰_숫자 {
	public static void main(String[] args) {
		int n = 1000000;
		int answer=0;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		int count = Integer.bitCount(n);
		if(count==1) {
			answer = n*2;
		}else {
			for(int i=n+1;i<Math.pow(2, binary.length()+1);i++) {
				if(Integer.bitCount(i)==count) {
					answer = i;
					break;
				}
			}
		}
		System.out.println(answer);
		
	}
}
