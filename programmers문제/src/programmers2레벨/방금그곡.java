package programmers2레벨;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class 방금그곡 {
	public static void main(String[] args) {
		String m = "A#";
		String[] musicinfos = {"12:00,12:01,HELLO,A#"};
		
		Map<Integer,String> map = new HashMap<>();
		for(int i=0;i<musicinfos.length;i++) {
			System.out.println("i = " + i);
			String[] info = musicinfos[i].split(",");
			String[] start = info[0].split(":");
			String[] end = info[1].split(":");
			int len = info[3].length();
			int hour = Integer.parseInt(end[0])-Integer.parseInt(start[0]);
			int minute = Integer.parseInt(end[1])-Integer.parseInt(start[1]);
			int total = 60*hour + minute;
			System.out.println("time : " + total);
			char[] music = info[3].toCharArray();
			Queue<Character> q = new LinkedList<>();
			for(int j=0;j<total;j++) {
				
				q.add(music[j%len]);
				if(music[(j+1)%len]=='#') {
					total++;
				}
			}
			System.out.println("-----------------------");
			int count=0;
			while(!q.isEmpty()) {
				System.out.println(count);
				if(q.peek()==m.charAt(count)) {
					System.out.println(q.peek());
					q.poll();
					count++;
					if(count==m.length()) {
						System.out.println("여기");
						if(!q.isEmpty()&&q.peek()=='#') {
							count=0;
						}else {
//							list.add(info[2]);
							if(!map.containsKey(total)) {
								map.put(total, info[2]);
							}
							
							break;
						}
					}
				}else {
					System.out.println(q.peek());
					count=0;
					if(q.peek()!=m.charAt(count)) {
						q.poll();
					}
					
					
				}
			}
//			System.out.println("---------------------");
		}
//		System.out.println(list.size());
//		for(String s : list) {
//			System.out.println(s);
//		}
		List<Integer> list = new ArrayList<>(map.keySet());
		if(list.size()>=2) {
			list.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					
					return o2-o1;
				}
			});
			System.out.println(map.get(list.get(0)));
		}else if(list.size()==0) {
			System.out.println("(None)");
		}
		
		
		
	}
}
