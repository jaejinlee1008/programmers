package programmers2레벨;

public class 뒤에_있는_큰_수_찾기 {
	public static void main(String[] args) {
		int[] numbers = {2,3,3,5};
		int[] answer = new int[numbers.length];
		for(int i=0;i<answer.length;i++) {
			answer[i]=-1;
		}
		for(int i=numbers.length-2;i>=0;i--) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]<numbers[j]) {
					answer[i]=numbers[j];
					break;
				}else {
					if(answer[j]==-1) {
						answer[i]=-1;
						break;
					}else if(numbers[i]<answer[j]) {
						answer[i]=answer[j];
						break;
					}
				}
			}
		}
		
	}
}
