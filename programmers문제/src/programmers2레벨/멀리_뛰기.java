package programmers2레벨;

public class 멀리_뛰기 {
//	public static int count=0;
	public static void main(String[] args) {
		int n=3;
		int a=1;
		int b=2;
		int c=0;
		if(n==1) {
//			return a;
		}
		if(n==2) {
//			return b;
		}
		if(n>=3) {
			for(int i=3;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
		}
		System.out.println(c);
//		DFS(n,current,1);
//		DFS(n,current,2);
//		System.out.println(count);
	}
//	public static void DFS(int n,int current,int jump) {
//		if(n<current) {
//			return;
//		}else if(n==current) {
//			count++;
//			System.out.println("plus");
//			return;
//		}
//		System.out.print(jump);
//		DFS(n,current+jump,1);
//		DFS(n,current+jump,2);
//	}
}
