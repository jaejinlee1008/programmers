package programmers2레벨;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class 쿼드압축_후_개수_세기 {
	public static void main(String[] args) {
		int[][] arr = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int n = arr.length;
		int[] answer = new int[2];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0, n });
		
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map.put(arr[i][j],map.getOrDefault(arr[i][j], 0)+1);
			}
		}
		if (map.size() == 1) {
			for (int num : map.keySet()) {
				answer[num]++;
//				return answer;
			}
		}
		
		
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			System.out.println(tmp[0]+","+tmp[1]+","+tmp[2]);
			if (tmp[2] > 2) {
				Set<Integer> set1 = new HashSet<>();
				for (int i = tmp[0]; i < tmp[0] + (tmp[2] / 2); i++) {
					for (int j = tmp[1]; j < tmp[1] + (tmp[2] / 2); j++) {
						set1.add(arr[i][j]);
//						System.out.println(i + "," + j + "," + arr[i][j]);
					}
				}
				if (set1.size() == 1) {
					for (int num : set1) {
						answer[num]++;
					}
				} else {
					q.add(new int[] { tmp[0], tmp[1], tmp[2] / 2 });
				}
//			for(Integer num : set1) {
//				System.out.println("set1 : " + num);
//			}

				Set<Integer> set2 = new HashSet<>();
				for (int i = tmp[0] + (tmp[2] / 2); i < tmp[0] + tmp[2]; i++) {
					for (int j = tmp[1]; j < tmp[1] + (tmp[2] / 2); j++) {
						set2.add(arr[i][j]);
//						System.out.println(i + "," + j + "," + arr[i][j]);
					}
				}
				if (set2.size() == 1) {
					for (int num : set2) {
						answer[num]++;
					}
				} else {
					q.add(new int[] { tmp[0]+(tmp[2]/2), tmp[1], tmp[2] / 2 });
				}
//			for(Integer num : set2) {
//				System.out.println("set2 : " + num);
//			}

				Set<Integer> set3 = new HashSet<>();
				for (int i = tmp[0]; i < tmp[0] + (tmp[2] / 2); i++) {
					for (int j = tmp[1] + (tmp[2] / 2); j < tmp[1] + tmp[2]; j++) {
						set3.add(arr[i][j]);
//						System.out.println(i + "," + j + "," + arr[i][j]);
					}
				}
				if (set3.size() == 1) {
					for (int num : set3) {
						answer[num]++;
					}
				} else {
					q.add(new int[] { tmp[0], tmp[1]+(tmp[2]/2), tmp[2] / 2 });
				}
//			for(Integer num : set3) {
//				System.out.println("set3 : " + num);
//			}

				Set<Integer> set4 = new HashSet<>();
				for (int i = tmp[0] + (tmp[2] / 2); i < tmp[0] + tmp[2]; i++) {
					for (int j = tmp[1] + (tmp[2] / 2); j < tmp[1] + tmp[2]; j++) {
						set4.add(arr[i][j]);
//						System.out.println(i + "," + j + "," + arr[i][j]);
					}
				}
				if (set4.size() == 1) {
					for (int num : set4) {
						answer[num]++;
					}
				} else {
					q.add(new int[] { tmp[0]+(tmp[2]/2), tmp[1]+(tmp[2]/2), tmp[2] / 2 });
				}
//			for(Integer num : set4) {
//				System.out.println("set4 : " + num);
//			}
			}else {
				Map<Integer,Integer> map1 = new HashMap<>();
				for (int i = tmp[0]; i < tmp[0] + (tmp[2] / 2); i++) {
					for (int j = tmp[1]; j < tmp[1] + (tmp[2] / 2); j++) {
						map1.put(arr[i][j],map1.getOrDefault(arr[i][j], 0)+1);
					}
				}

				for (int i = tmp[0] + (tmp[2] / 2); i < tmp[0] + tmp[2]; i++) {
					for (int j = tmp[1]; j < tmp[1] + (tmp[2] / 2); j++) {
						map1.put(arr[i][j],map1.getOrDefault(arr[i][j], 0)+1);
					}
				}

				for (int i = tmp[0]; i < tmp[0] + (tmp[2] / 2); i++) {
					for (int j = tmp[1] + (tmp[2] / 2); j < tmp[1] + tmp[2]; j++) {
						map1.put(arr[i][j],map1.getOrDefault(arr[i][j], 0)+1);
					}
				}

				for (int i = tmp[0] + (tmp[2] / 2); i < tmp[0] + tmp[2]; i++) {
					for (int j = tmp[1] + (tmp[2] / 2); j < tmp[1] + tmp[2]; j++) {
						map1.put(arr[i][j],map1.getOrDefault(arr[i][j], 0)+1);
					}
				}
				if (map1.size() == 1) {
					for (int num : map1.keySet()) {
						answer[num]++;
					}
				} else {
					for (int num : map1.keySet()) {
						answer[num]+=map1.get(num);
					}
				}
				
			}
		}
		System.out.println(answer[0]+","+answer[1]);
	}
}
