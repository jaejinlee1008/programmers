package programmers2레벨;

public class 숫자의_표현 {
	public static void main(String[] args) {
		int n = 15;
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				sum+=j;
				if(sum==n) {
					count++;
					sum=0;
					break;
				}else if(sum>n) {
					sum=0;
					break;
				}
			}
			
		}
		System.out.println(count);
	}
}
