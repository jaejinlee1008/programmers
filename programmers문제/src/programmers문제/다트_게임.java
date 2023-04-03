package programmers문제;

public class 다트_게임 {
	public static void main(String[] args) {
		String dartResult="1D2S#10S";
		int j=-1;
		int[] answer = new int[3];
		int sum=0;
		for(int i=0;i<dartResult.length();i++) {
			if(dartResult.charAt(i)>='0' && dartResult.charAt(i)<='9') {
				if(dartResult.charAt(i+1)=='0') {
					j++;
					answer[j] = 10;
					i++;
				}else {
					j++;
					answer[j] = Character.getNumericValue(dartResult.charAt(i));
				}
				
			}else if(dartResult.charAt(i)=='D') {
				answer[j] = (int)Math.pow(answer[j], 2);
			}else if(dartResult.charAt(i)=='T') {
				answer[j] = (int)Math.pow(answer[j], 3);
			}else if(dartResult.charAt(i)=='*') {
				if(j==0) {
					answer[j] *= 2;
				}else {
					answer[j-1] *=2;
					answer[j]*=2;
				}
				
			}else if(dartResult.charAt(i)=='#') {
				
				answer[j] *= -1;
				
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(answer[i]);
			sum+=answer[i];
		}
		System.out.println(sum);
	}
}
