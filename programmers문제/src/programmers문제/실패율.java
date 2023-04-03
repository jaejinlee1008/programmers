package programmers문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class 실패율 {
	public static void main(String[] args) {
		int N = 8;
		int[] stages = new int[] {2,1,2,6,2,4,3,3};
		Arrays.sort(stages);
		int len = stages.length;
		int count=0;
		int beforecount=0;
		int[] result = new int[N];
		HashMap<Integer,Double> map = new HashMap<>();
		
		for(int i=0;i<N;i++) {
			for(int j=count;j<len;j++) {
				if(i+1==stages[j]) {
					count++;
				}else {
					break;
				}
			}
			result[i] = count-beforecount;
			if((double)(len-beforecount)!=0) {
				map.put(i+1, (result[i]/(double)(len-beforecount)));
			}else {
				map.put(i+1, 0.0);
			}
			

			beforecount=count;
		}
		ArrayList<Entry<Integer,Double>> list = new ArrayList<Entry<Integer,Double>>(map.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,Double>>() {
			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		int[] answer=new int[N];
		int i=0;
		for(Entry<Integer,Double> entry:list) {
			answer[i]=entry.getKey();
			i++;
		}
		
	}
}
