package programmers;



public class 비밀지도 {
	public static void main(String[] args) {
		int n=5;
		int[] arr1 = new int[] {9,20,28,18,11};
		int[] arr2 = new int[] {30,1,21,17,28};
		String[] strarr1=new String[n];
		String[] strarr2=new String[n];
		String[] answer = new String[n];
		for(int i=0;i<n;i++) {
			
			strarr1[i] = (Integer.toString(arr1[i]+(int)Math.pow(2, n), 2)).substring(1);

			strarr2[i] = (Integer.toString(arr2[i]+(int)Math.pow(2, n), 2)).substring(1);
			answer[i]="";
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(strarr1[i].charAt(j)=='1'||strarr2[i].charAt(j)=='1') {
					answer[i]+="#";
				}else {
					answer[i]+=" ";
				}
			}
		}
		System.out.println(answer[0]);
	}
}
