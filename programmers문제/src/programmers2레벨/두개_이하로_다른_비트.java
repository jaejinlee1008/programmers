package programmers2레벨;

public class 두개_이하로_다른_비트 {
	public static void main(String[] args) {
		long[] numbers = {2,7};
		long[] result = new long[numbers.length];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				result[i]=numbers[i]+1;
			}else {
				String str = "0"+Long.toBinaryString(numbers[i]);
				
				int idx=0;
				for(int j=str.length()-1;j>=0;j--) {
					if(str.charAt(j)=='0') {
						break;
					}else {
						idx++;
					}
				}
				result[i] = (long)(numbers[i]+Math.pow(2, idx)-Math.pow(2, idx-1));
			}
			
		}
		
	}
	
}
