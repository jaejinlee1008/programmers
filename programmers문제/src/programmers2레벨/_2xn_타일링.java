package programmers2레벨;

public class _2xn_타일링 {
	
	public static void main(String[] args) {
		int n=4;
		int a=1;
		int b=2;
		int c=0;
		if(n==1) {
//			return a;
		}
		if(n==2) {
//			return b;
		}
		
		for(int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		
//		DFS(n,0,1);
//		DFS(n,0,2);
		
	}
//	public static void DFS(int n, int current, int next) {
//		current+=next;
//		if(current>n) {
//			return;
//		}else if(current==n) {
//			count++;
//			return;
//		}
//		
//		DFS(n,current,1);
//		DFS(n,current,2);
//	}
}
