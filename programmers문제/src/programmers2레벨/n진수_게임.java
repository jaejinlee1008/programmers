package programmers2레벨;

public class n진수_게임 {
	public static void main(String[] args) {
		int n=2;
		int t=4;
		int m=2;
		int p=1;
		int current=0;
		int count=0;
		int num=0;
		String tmp="";
		StringBuilder sb = new StringBuilder();
		while(count<t) {
			tmp = Integer.toString(num,n);
			System.out.println(tmp);
			for(int j=0;j<tmp.length();j++) {
				if(current%m==p-1) {
					sb.append(tmp.charAt(j));
					count++;
					if(count==t) {
						break;
					}
				}
				current++;
			}
			num++;
		}
		String answer = sb.toString().toUpperCase();
		System.out.println(answer);
	}
}
