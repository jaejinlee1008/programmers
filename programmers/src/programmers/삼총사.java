package programmers;

import java.util.Arrays;

public class ªÔ√—ªÁ {
	public static void main(String[] args) {
		int[] number = new int[] {-1,1,-1,1};
		Arrays.sort(number);
		int count=0;
		int sum=0;
		for(int i=0;i<number.length-2;i++) {
			sum=0;
			sum+=number[i];
			for(int j=i+1;j<number.length-1;j++) {
				sum+=number[j];
				for(int k=j+1;k<number.length;k++) {
					sum+=number[k];
					if(sum==0) {
						count++;
					}
					sum-=number[k];
				}
				sum-=number[j];
			}
		}
		System.out.println(count);
	}
}
