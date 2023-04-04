package programmers;


public class ¼ýÀÚ_Â¦²á {
	public static int i=0;
	public static void main(String[] args) {
		String X="100";
		String Y="100";
		long[] xlen = new long[10];
		long[] ylen = new long[10];
		long[] result = new long[10];
		StringBuilder sb = new StringBuilder();
		for(i=0;i<10;i++) {
			xlen[i] = X.chars().filter(c->c==Character.forDigit(i, 10)).count();
			if(xlen[i]==0) continue;
			ylen[i] = Y.chars().filter(c->c==Character.forDigit(i, 10)).count();
			if(ylen[i]==0) continue;
			result[i] = Math.min(xlen[i], ylen[i]);
		}
		for(i=9;i>=0;i--) {
			for(int j=0;j<result[i];j++) {
				sb.append(i);
			}
		}
		String answer=sb.toString();
		if(answer.equals("")) {
			answer="-1";
		}
		else if(answer.charAt(0)=='0') {
			answer="0";
		}
		System.out.println(answer);
	}
}
