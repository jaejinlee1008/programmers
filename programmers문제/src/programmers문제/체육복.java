package programmers문제;

import java.util.Arrays;

public interface 체육복 {
	public static void main(String[] args) {
		int n=10;
		int[] lost = new int[] {2,3,6};
		int[] reserve = new int[] {1,2,4};
		int answer = n-lost.length;
		int count=0;
		int[] arr = new int[n+1];
		Arrays.fill(arr, 1);
		
		for(int i=0;i<lost.length;i++) {
			arr[lost[i]]--;
		}
		for(int i=0;i<reserve.length;i++) {
			arr[reserve[i]]++;
		}
		
		if(arr[1]==2&&arr[2]==0) {
//			answer++;
			arr[1]=1;
			arr[2]=1;
		}else if(arr[n]==2&&arr[n-1]==0) {
//			answer++;
			arr[n]=1;
			arr[n-1]=1;
		}
		
		for(int i=2;i<n;i++) {
//			System.out.println(arr[i]);
			
			if(arr[i]==2) {
				if(arr[i-1]==0) {
					arr[i]=1;
					arr[i-1]=1;
				}else if(arr[i+1]==0) {
					arr[i]=1;
					arr[i+1]=1;
					i++;
				}
			}
		}
		
		for(int i=1;i<=n;i++) {
			System.out.println(arr[i]);
			if(arr[i]==0) count++;
		}
		
	}
}
