package programmers2레벨;

public class k진수에서_소수_개수_구하기 {
	public static void main(String[] args) {
		int n=11001;
		int k=10;
		String str = Integer.toString(n, k);
		String[] arr = str.split("0");
		int count=0;
		for(String s : arr) {
			if(s.length()>0&&!isPrime(Long.parseLong(s))) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean isPrime(long num) {
		System.out.println(num);
		if(num==1) {
			return true;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return true;
			}
		}
		return false;
	}
}
