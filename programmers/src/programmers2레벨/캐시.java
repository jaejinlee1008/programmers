package programmers2레벨;

import java.util.LinkedList;



public class 캐시 {
	
	static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;
	
	public static void main(String[] args) {
		int cacheSize = 3;
		String[] cities= {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		LinkedList<String> cache = new LinkedList<String>();
		int answer=0;
		if(cacheSize==0) {
			answer=cities.length*5;
		}
		for(int i=0;i<cities.length;i++) {
			String city = cities[i].toUpperCase();
			if(cache.remove(city)) {
				cache.addFirst(city);
				answer+=CACHE_HIT;
			}else {
				if(cache.size()==cacheSize) {
					cache.pollLast();
				}
				cache.addFirst(city);
				answer+=CACHE_MISS;
			}
		}
		System.out.println(answer);
	}
}
