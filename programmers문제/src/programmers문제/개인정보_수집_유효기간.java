package programmers문제;

import java.util.ArrayList;
import java.util.HashMap;

public class 개인정보_수집_유효기간 {
	public static void main(String[] args) {
		String today = "2022.12.08";
		String[] terms = new String[] {"A 6"};
		String[] privacies = new String[] {"2022.06.08 A"};
		int year=0;
		int month=0;
		int day=0;
		int tyear = Integer.parseInt(today.substring(0, 4));
		int tmonth = Integer.parseInt(today.substring(5, 7));
		int tday = Integer.parseInt(today.substring(8));
		
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Character,Integer> map = new HashMap<>();
		for(String s : terms) {
			map.put(s.charAt(0), Integer.parseInt(s.substring(2)));
		}
		for(int i=0;i<privacies.length;i++) {
			year = Integer.parseInt(privacies[i].substring(0, 4));
			month = Integer.parseInt(privacies[i].substring(5, 7));
			day = Integer.parseInt(privacies[i].substring(8, 10));
			year = year + (month+map.get(privacies[i].charAt(privacies[i].length()-1)))/12;
			month = (month+map.get(privacies[i].charAt(privacies[i].length()-1)))%12;
			if(month==0) {
				year--;
				month=12;
			}
			System.out.println(year+"."+month+"."+day);
			if(year<tyear) {
				list.add(i+1);
				continue;
			}else if(year>tyear) {
				continue;
			}else {
				if(month<tmonth) {
					list.add(i+1);
					continue;
				}else if(month>tmonth) {
					continue;
				}else {
					if(day<=tday) {
						list.add(i+1);
						continue;
					}else if(day>tday) {
						continue;
					}
				}
			}
			
		}
		for(int i : list) {
			System.out.println(i);
		}
		
	}
}
