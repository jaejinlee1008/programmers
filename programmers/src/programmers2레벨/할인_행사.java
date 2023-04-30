package programmers2레벨;

import java.util.ArrayList;
import java.util.List;

public class 할인_행사 {
	public static void main(String[] args) {
		String[] want = {"banana", "apple", "rice", "pork", "pot"};
		int[] number = {3, 2, 2, 2, 1};
		String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i];j++) {
				list.add(want[i]);
			}
		}
		
		int count=0;
		int tmp=0;
		for(int i=0;i<=discount.length-10;i++) {
			tmp=0;
			List<String> tmplist = new ArrayList<>();
			tmplist.addAll(list);
			
			for(int j=i;j<i+10;j++) {
				if(tmplist.remove(discount[j])) {
					
					tmp++;
				}else {
					
					break;
				}
				
			}
			if(tmp==10) {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
