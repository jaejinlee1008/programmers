package programmers2레벨;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class 전력망을_둘로_나누기 {
	public static void main(String[] args) {
		int n = 9;
		int[][] wires = { { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 4, 6 }, { 4, 7 }, { 7, 8 }, { 7, 9 } };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(i + 1);
		}
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < wires.length; i++) {
			if (!map.containsKey(wires[i][0])) {
				List<Integer> list = new ArrayList<>();
				list.add(wires[i][1]);
				map.put(wires[i][0], list);
			} else {
				map.get(wires[i][0]).add(wires[i][1]);
			}

			if (!map.containsKey(wires[i][1])) {
				List<Integer> list = new ArrayList<>();
				list.add(wires[i][0]);
				map.put(wires[i][1], list);
			} else {
				map.get(wires[i][1]).add(wires[i][0]);
			}
		}
//		for (int key : map.keySet()) {
//			System.out.println(key + "," + map.get(key));
//		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			for (int value : map.get(i)) {
				Queue<List<Integer>> q = new LinkedList<>();
				q.add(map.get(value));
				Set<Integer> settmp = new HashSet<>();
				settmp.addAll(set);
//				System.out.println(settmp.size() + "초기 사이즈");

				while (!q.isEmpty()) {
					List<Integer> tmp = new ArrayList<>();
					for (int j : q.poll()) {
						if(j==i) {
							continue;
						}
						settmp.remove(j);
//						System.out.println(j+"삭제");
						for (int k : map.get(j)) {
							if (k != i && settmp.contains(k)) {
								tmp.add(k);
//								System.out.println(k + "추가");
								settmp.remove(k);
							}
						}
					}
					if (tmp.size() >= 1) {
						q.add(tmp);
//						System.out.println("리스트 추가");
					}
				}
//				System.out.println(i + "제외 시" + (n - settmp.size()) + "," + settmp.size());
				min = Math.min(Math.abs(n-settmp.size()-settmp.size()), min);
			}

		}
		System.out.println("최종" + min);
	}
}
