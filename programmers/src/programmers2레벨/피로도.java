package programmers2레벨;

public class 피로도 {
	public static int max = Integer.MIN_VALUE;
	public static void main(String[] args) {
		int k=80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		boolean[] visited = new boolean[dungeons.length];
		DFS(k,dungeons,visited);
		System.out.println(max);
	}
	
	public static void DFS(int k, int[][] dungeons, boolean[] visited) {
		int count=0;
		for(int i=0;i<visited.length;i++) {
			if(visited[i]) count++;
		}
		max = Math.max(max, count);
		
		for(int i=0;i<dungeons.length;i++) {
			if(!visited[i]) {
				if(k>=dungeons[i][0]) {
					visited[i]=true;
					k-=dungeons[i][1];
					DFS(k,dungeons,visited);
					k+=dungeons[i][1];
					visited[i]=false;
				}
			}
		}
	}
}
