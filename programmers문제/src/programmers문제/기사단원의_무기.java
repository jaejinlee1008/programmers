package programmers문제;

public class 기사단원의_무기 {
	
	public static void main(String[] args) {
		int number=10;
		int limit=3;
		int power=2;
		int sum=0;
		int count=0;
		
		for(int i=1;i<=number;i++) {

			for (int j = 1; j <= Math.pow(i, 0.5); j++) {
				if (j * j == i) {
					count++;
				}else if(i%j==0) {
					count=count+2;
				}
				if(count>limit) break;
			}
			if (count <= limit) {
				sum += count;
			} else {
				sum += power;
			}
			count = 0;
		}
		System.out.println(sum);
	}
	
}
