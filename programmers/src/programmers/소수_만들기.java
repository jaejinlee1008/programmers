package programmers;

import java.util.Arrays;


public class 소수_만들기 {
	public static boolean[] prime;
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,7,6,4};
		int len = nums.length;
		int count=0;
		Arrays.sort(nums);
		solve(nums[len-1]+nums[len-2]+nums[len-3]);
		for(int i=0;i<len-2;i++) {
			for(int j=i+1;j<len-1;j++) {
				for(int k=j+1;k<len;k++) {
					if(prime[nums[i]+nums[j]+nums[k]]==false) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
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
