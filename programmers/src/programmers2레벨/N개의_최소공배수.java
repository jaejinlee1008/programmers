package programmers2레벨;

public class N개의_최소공배수 {
	public static void main(String[] args) {
		int[] arr = {3,4,9,16};
		int lcm=0;
		if(arr.length==1) {
			System.out.println(arr[0]);
		}
		int gcm=GCM(Math.max(arr[0],arr[1]),Math.min(arr[0], arr[1]));
		lcm = (arr[0]*arr[1])/gcm;
		for(int i=2;i<arr.length;i++) {
			gcm=GCM(Math.max(lcm,arr[i]),Math.min(lcm, arr[i]));
			lcm=LCM(lcm,arr[i],gcm);
			System.out.println(lcm);
		}
		System.out.println(gcm);
		System.out.println(lcm);
	}
	public static int GCM(int a,int b) {
		if(a%b==0) {
			return b;
		}
		
		return GCM(b,a%b);
	}
	public static int LCM(int a, int b, int gcm) {
		return (a*b)/gcm;
	}
}
