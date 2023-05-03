package programmers2레벨;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
//	public static int min = Integer.MAX_VALUE;
//	public static int rowmax = Integer.MIN_VALUE;
//	public static int colmax = Integer.MIN_VALUE;
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		
		int[][] visited = new int[maps.length][maps[0].length];
		visited[0][0]=1;
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {0,0});
		
		while(!q.isEmpty()) {
			int[] current = q.poll();
			if(current[0]==maps.length-1&&current[1]==maps[0].length-1) {
//				return visited[current[0]][current[1]];
				System.out.println(visited[current[0]][current[1]]);
			}
			
			if(current[0]-1>=0&&maps[current[0]-1][current[1]]==1&&visited[current[0]-1][current[1]]==0) {
				q.add(new int[] {current[0]-1,current[1]});
				visited[current[0]-1][current[1]]+=visited[current[0]][current[1]]+1;
			}
			if(current[0]+1<maps.length&&maps[current[0]+1][current[1]]==1&&visited[current[0]+1][current[1]]==0) {
				q.add(new int[] {current[0]+1,current[1]});
				visited[current[0]+1][current[1]]+=visited[current[0]][current[1]]+1;
			}
			if(current[1]-1>=0&&maps[current[0]][current[1]-1]==1&&visited[current[0]][current[1]-1]==0) {
				q.add(new int[] {current[0],current[1]-1});
				visited[current[0]][current[1]-1]+=visited[current[0]][current[1]]+1;
			}
			if(current[1]+1<maps[current[0]].length&&maps[current[0]][current[1]+1]==1&&visited[current[0]][current[1]+1]==0) {
				q.add(new int[] {current[0],current[1]+1});
				visited[current[0]][current[1]+1]+=visited[current[0]][current[1]]+1;
			}
		}
		System.out.println(-1);
//		DFS(maps,0,0,1);
//		if(rowmax==maps.length-1&&colmax==maps[0].length-1) {
//			System.out.println(min);
//		}else {
//			System.out.println(-1);
//		}
		
		
	}
	
	// DFS로 푸니 효율성 통과 x
//	public static void DFS(int[][] maps,int row, int col, int count) {
//		if(row==maps.length-1&&col==maps[row].length-1) {
//			min = Math.min(min, count);
//			rowmax=row;
//			colmax=col;
//			return;
//		}
//		
//		if(row-1>=0&&maps[row-1][col]==1) {
//			maps[row][col]=0;
//			count++;
//			DFS(maps,row-1,col,count);
//			count--;
//			maps[row][col]=1;
//		}
//		if(row+1<maps.length&&maps[row+1][col]==1) {
//			maps[row][col]=0;
//			count++;
//			DFS(maps,row+1,col,count);
//			count--;
//			maps[row][col]=1;
//		}
//		if(col-1>=0&&maps[row][col-1]==1) {
//			maps[row][col]=0;
//			count++;
//			DFS(maps,row,col-1,count);
//			count--;
//			maps[row][col]=1;
//		}
//		if(col+1<maps[row].length&&maps[row][col+1]==1) {
//			maps[row][col]=0;
//			count++;
//			DFS(maps,row,col+1,count);
//			count--;
//			maps[row][col]=1;
//		}
//	}
}
