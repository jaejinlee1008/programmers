package programmers2����;

import java.util.Arrays;

public class ��ȭ��ȣ_��� {
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
