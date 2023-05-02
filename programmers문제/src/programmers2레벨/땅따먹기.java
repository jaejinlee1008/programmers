package programmers2레벨;

public class 땅따먹기 {
	
	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,10},{4,3,2,1}};
		for(int i=1;i<land.length;i++) {
			for(int j=0;j<land[i].length;j++) {
				land[i][j]+=findMax(land[i-1],j);
			}
		}
		System.out.println(findMax(land[land.length-1],-1));
	}
	public static int findMax(int[] arr,int col) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(i!=col) {
				max = Math.max(max, arr[i]);
			}
		}
		return max;
	}
}
