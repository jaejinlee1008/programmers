package programmers문제;

public class 약수의_개수와_덧셈 {
	public static void main(String[] args) {
		int left=13;
		int right=17;
		int count=0;
		int sum=0;
		for(int i=left;i<=right;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.println(i+"의 약수 " + j);
					count++;
				}
			}
			if(count%2==0) {
				System.out.println("약수개수 짝수");
				sum+=i;
			}else {
				System.out.println("약수개수 홀수");
				sum-=i;
			}
		}
		System.out.println(sum);
	}
	
}
