package programmers문제;

public class 콜라_문제 {
	public static void main(String[] args) {
		int a=3;
		int b=1;
		int n=20;
		
		int coke = 0;
		while(n>=a) {
			coke += (n/a)*b;
			System.out.println("얻은 병" + coke);
			n=(n/a)*b+n%a;
			System.out.println("남은 병" + n);
		}
		
	}
}
