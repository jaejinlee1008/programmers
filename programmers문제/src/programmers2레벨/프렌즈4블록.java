package programmers2레벨;

import java.util.Stack;

public class 프렌즈4블록 {
	public static boolean[][] checkboard;
	public static int answer = 0;

	public static void main(String[] args) {
		String[] board = { "TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ" };
		int m = 6;
		int n = 6;

		char[][] charboard = new char[m][n];

		for (int i = 0; i < m; i++) {
			charboard[i] = board[i].toCharArray();
		}
		

		
		while (check22(charboard, m, n)>0) {
			

			for (int i = 0; i < n; i++) {
				Stack<Character> stack = new Stack<>();
				for (int j = 0; j < m; j++) {
					if (!checkboard[j][i]) {
						stack.push(charboard[j][i]);
						
					}
				}
				int len=m-1;
				while(!stack.isEmpty()) {
					charboard[len][i]=stack.pop();
					len--;
				}
				for (int k = 0; k <= len; k++) {
					charboard[k][i] = '#';
				}
			}

			
		}
		System.out.println(answer);
	}

	public static int check22(char[][] charboard, int m, int n) {
		checkboard = new boolean[m][n];
		
		int count = 0;
		
		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (charboard[i][j]!='#'&&charboard[i][j] == charboard[i + 1][j] && charboard[i][j] == charboard[i + 1][j]
						&& charboard[i][j] == charboard[i][j + 1] && charboard[i][j] == charboard[i + 1][j + 1]) {
					if (!checkboard[i][j]) {
						checkboard[i][j] = true;
						count++;
					}
					if (!checkboard[i + 1][j]) {
						checkboard[i + 1][j] = true;
						count++;
					}
					if (!checkboard[i][j + 1]) {
						checkboard[i][j + 1] = true;
						count++;
					}
					if (!checkboard[i + 1][j + 1]) {
						checkboard[i + 1][j + 1] = true;
						count++;
					}
				}
			}
		}
		answer += count;
		return count;
	}
}
