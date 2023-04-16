package programmers2레벨;

public class 예상_대진표 {
	public static void main(String[] args) {
		int n=8;
		int a=4;
		int b=7;
		int count=1;
		String s = Integer.toBinaryString(n);
		
		
		for(int i=1;i<s.length();i++) {
			if((Math.abs(a-b)==1)&&((Math.max(a, b)%2)==0)){
				break;
			}else {
				if(a%2==0) {
					a/=2;
				}else {
					a=(a/2)+1;
				}
				if(b%2==0) {
					b/=2;
				}else {
					b=(b/2)+1;
				}
				count++;
			}
		}
		System.out.println(count);
	}
}
