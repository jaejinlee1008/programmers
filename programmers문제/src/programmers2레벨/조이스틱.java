package programmers2레벨;

import java.util.HashSet;
import java.util.Set;

public class 조이스틱 {
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		String name = "JEROEN";

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				set.add(i);
			}
		}

		DFS(name, set, 0, 0);

		System.out.println(min + "끝");
	}

	public static void DFS(String name, Set<Integer> set, int currentidx, int currentcount) {
//		System.out.println(set.size() + "시작할 때 set 검사");
		if (set.isEmpty()) {
			min = Math.min(min, currentcount);
			return;
		}
//		for(int i : set) {
//			System.out.print(i +",");
//		}
//		System.out.println();
//		System.out.println(currentidx+","+currentcount);
		Set<Integer> copyset = new HashSet<>();
		copyset.addAll(set);
		int num = currentidx;
//			System.out.println(num);
		if (name.charAt(num) != 'A') {
			currentcount += Math.min(name.charAt(num) - 'A', 26 - (name.charAt(num) - 'A'));
			copyset.remove(num);
			if (copyset.size() == 0) {
				min = Math.min(min, currentcount);
//					System.out.println("종료종료");
				return;
			}

		}
//			System.out.println(copyset.size() + "아직 남아있음");
		int idx1 = 0;
		int num1 = 0;
		while (true) {
			idx1++;
			if (copyset.contains((num + idx1) % name.length())) {
				num1 = (num + idx1) % name.length();
				break;
			}
		}
//			System.out.println("체크 1");
		Set<Integer> tmp1 = new HashSet<>();
		tmp1.addAll(copyset);
		currentcount += idx1;
		DFS(name, tmp1, num1, currentcount);
		currentcount -= idx1;
		int idx2 = 0;
		int num2 = 0;
		while (true) {
			idx2++;
			if (num - idx2 >= 0) {
				if (copyset.contains(num - idx2)) {
					num2 = num - idx2;
					break;
				}
			} else {
				if (copyset.contains(name.length() + (num - idx2))) {
					num2 = name.length() + (num - idx2);
					break;
				}
			}

		}
//			System.out.println("체크 2 " + idx2);
		Set<Integer> tmp2 = new HashSet<>();
		tmp2.addAll(copyset);
		currentcount += idx2;
		DFS(name, tmp2, num2, currentcount);
	}
}
