package programmers;

public class Å¸°Ù_³Ñ¹ö {
	public static int count=0;
	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target=4;
		int sum=0;
		
		DFS(numbers,0,-1,sum,target);
		System.out.println(count);
	}
	
	public static void DFS(int[] numbers, int num,int i, int sum,int target) {
		sum+=num;
		if(i==numbers.length-1) {
			if(sum==target) {
				count++;
			}
			return;
		}
		
		i++;
		DFS(numbers,numbers[i],i,sum,target);
		DFS(numbers,-numbers[i],i,sum,target);
		
		
	}
}
