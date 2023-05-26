package programmers2레벨;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 무인도_여행 {
	public static int sum=0;
	public static boolean[][] canvisit;
	public static void main(String[] args) {
		String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
		canvisit = new boolean[maps.length][maps[0].length()];
		for(int i=0;i<maps.length;i++) {
			for(int j=0;j<maps[i].length();j++) {
				if(maps[i].charAt(j)!='X') {
					canvisit[i][j] = true;
				}
				
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < maps.length; i++) {
        	for(int j = 0; j < maps[0].length(); j++) {
        		if(canvisit[i][j]) {
        			sum = 0;
        			BFS(canvisit, maps,i, j);
        			if(sum != 0) {
            			list.add(sum);
        			}
        		}
        	}
        }
		
		
		if(list.size()>=1) {
			Collections.sort(list);
//			return list;
		}else {
			list.add(-1);
//			return list;
		}
		for(Integer i : list) {
			System.out.println(i);
		}
	}
	public static int BFS(boolean[][] canvisit, String[] maps, int row, int col) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {row,col});
		sum=Character.getNumericValue(maps[row].charAt(col));
		canvisit[row][col]=false;
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			System.out.println("current" + tmp[0] + "," + tmp[1]);
			if(tmp[0]-1>=0&&canvisit[tmp[0]-1][tmp[1]]) {
				q.add(new int[] {tmp[0]-1,tmp[1]});
				canvisit[tmp[0]-1][tmp[1]]=false;
				sum+=Character.getNumericValue(maps[tmp[0]-1].charAt(tmp[1]));
			}
			if(tmp[1]-1>=0&&canvisit[tmp[0]][tmp[1]-1]) {
				q.add(new int[] {tmp[0],tmp[1]-1});
				canvisit[tmp[0]][tmp[1]-1]=false;
				sum+=Character.getNumericValue(maps[tmp[0]].charAt(tmp[1]-1));
			}
			if(tmp[1]+1<maps[0].length()&&canvisit[tmp[0]][tmp[1]+1]) {
				q.add(new int[] {tmp[0],tmp[1]+1});
				canvisit[tmp[0]][tmp[1]+1]=false;
				sum+=Character.getNumericValue(maps[tmp[0]].charAt(tmp[1]+1));
			}
			if(tmp[0]+1<maps.length&&canvisit[tmp[0]+1][tmp[1]]) {
				q.add(new int[] {tmp[0]+1,tmp[1]});
				canvisit[tmp[0]+1][tmp[1]]=false;
				sum+=Character.getNumericValue(maps[tmp[0]+1].charAt(tmp[1]));
			}
			
		}
		return sum;
	}

}
