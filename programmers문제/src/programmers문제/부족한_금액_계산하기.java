package programmers문제;

public class 부족한_금액_계산하기 {
	public static void main(String[] args) {
		int money=20;
		int price=3;
		int count=4;
		long sum=0;
		for(int i=1;i<=count;i++) {
			sum+=price*i;
		}
		long answer=sum-money;
		if(answer<=0) {
			answer=0;
		}
	}
}
