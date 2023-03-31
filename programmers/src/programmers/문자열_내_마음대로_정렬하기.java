package programmers;


public class 문자열_내_마음대로_정렬하기 {
	public static void main(String[] args) {
		String[] strings = new String[] {"sun","bed","car"};
		int n = 1;
		for(int i=0;i<strings.length-1;i++) {
			for(int j=i+1;j<strings.length;j++) {
				if(strings[i].charAt(n)>strings[j].charAt(n)) {
					String tmp = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp;
				}else if(strings[i].charAt(n)==strings[j].charAt(n)) {
					if(strings[i].compareTo(strings[j])>0) {
						String tmp = strings[i];
						strings[i] = strings[j];
						strings[j] = tmp;
					}
				}
			}
		}
		for(int i=0;i<strings.length;i++) {
			System.out.println(strings[i]);
		}
	}
}
