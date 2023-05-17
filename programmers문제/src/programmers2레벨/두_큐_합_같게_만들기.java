package programmers2레벨;

import java.util.ArrayList;
import java.util.List;

public class 두_큐_합_같게_만들기 {
	
	public static void main(String[] args) {
		int[] queue1 = {3,2,7,2};
		int[] queue2 = {4,6,5,1};
		long sum1=0;
		long sum2=0;
		List<Integer> list = new ArrayList<>();
		for(int i : queue1) {
			list.add(i);
			sum1+=i;
		}
		for(int i : queue2) {
			list.add(i);
			sum2+=i;
		}
		if((sum1+sum2)%2!=0) {
			System.out.println("불가능");
		}
		long target = (sum1+sum2)/2;
		int left=0;
		int right=queue1.length-1;
		int count=0;
		while(sum1!=target&&left<list.size()-1) {
			System.out.println(left+","+right);
			if(sum1<target&&right==list.size()-1) {
				break;
			}
			if(sum1<target&&right<list.size()-1) {
				right++;
				sum1+=list.get(right);
				count++;
			}else if(sum1>target&&left<list.size()-1) {
				sum1-=list.get(left);
				left++;
				count++;
			}
		}
		if(sum1!=target)
		{
			System.out.println(-1);
		}else {
			System.out.println(count);
		}
		System.out.println(left+","+right);
	}
	
}
