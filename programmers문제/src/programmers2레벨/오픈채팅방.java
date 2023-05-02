package programmers2레벨;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		Map<String, String> map = new HashMap<>();
		for(int i=0;i<record.length;i++) {
			String[] tmp = record[i].split(" ");
			if(!tmp[0].equals("Leave")) {
				map.put(tmp[1], tmp[2]);
			}
		}
		List<String> answer = new ArrayList<>();
		for(int i=0;i<record.length;i++) {
			String[] tmp = record[i].split(" ");
			if(tmp[0].startsWith("Enter")) {
				answer.add(map.get(tmp[1])+"님이 들어왔습니다.");
			}else if(tmp[0].startsWith("Leave")) {
				answer.add(map.get(tmp[1])+"님이 나갔습니다.");
			}
		}
		for(String s : answer) {
			System.out.println(s);
		}
	}
}
