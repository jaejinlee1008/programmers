package programmers2레벨;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 가장_큰_수 {
	public static void main(String[] args) {
		int[] numbers = { 1,10,100,1000 };
		List<String> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(Integer.toString(numbers[i]));
		}
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(0) != o2.charAt(0)) {
					return o2.compareTo(o1);
				} else {
					return (o2+o1).compareTo(o1+o2);
//					int min = Math.min(o1.length(), o2.length());
//					int i = 0;
//					for (i = 0; i < min; i++) {
//						if (o2.charAt(i) != o2.charAt(i)) {
//							return o2.compareTo(o1);
//						}
//					}
//					// System.out.println("index : " + i);
//					if (o1.length() > o2.length()) {
//						return o2.charAt(i - 1) - o1.charAt(i);
//					} else if (o2.length() > o1.length()) {
//						return o2.charAt(i) - o1.charAt(i - 1);
//					} else {
//						return o2.charAt(i - 1) - o1.charAt(i - 1);
//					}
				}
			}

		});
		StringBuilder sb = new StringBuilder();
		for (String n : list) {
			sb.append(n);
			// System.out.println(n);
		}
		if (sb.charAt(0) == '0') {
//			return "0";
		}
		System.out.println(sb.toString());

	}
}
