package programmers문제;

public class 소수_찾기 {
	public static boolean[] prime;
	public static void main(String[] args) {
		int n=10;
		int count=0;
		solve(n);
		for(int i = 0; i <= n; i++){
            if(prime[i] == false){
                count++;
            }
        }
		
	}
	
	public static void solve(int num) {
		prime = new boolean[num+1];
		if(num<2) return;
		prime[0]=prime[1]=true;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(prime[i]==true) {
				continue;
			}
			for(int j=i*i;j<prime.length;j=j+i) {
				prime[j]=true;
			}
		}
	}
}
