package programmers2레벨;

import java.util.Arrays;

public class 전화번호_목록 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		Arrays.sort(phone_book);
		boolean answer = true;
		for(int i=0;i<phone_book.length-1;i++) {
			if(phone_book[i+1].startsWith(phone_book[i])) {
				answer=false;
			}
		}
		System.out.println(answer);
	}
}
