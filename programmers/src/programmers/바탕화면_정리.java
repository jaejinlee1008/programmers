package programmers;

public class 바탕화면_정리 {
	public static void main(String[] args) {
		String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		int[] answer = new int[4];
		answer[1]=-1;
		for(int i=0;i<wallpaper.length;i++) {
			if(wallpaper[i].contains("#")) {
				answer[0] = i;
				break;
			}
		}
		
		for(int i=0;i<wallpaper[0].length();i++) {
			for(int j=0;j<wallpaper.length;j++) {
				if(wallpaper[j].charAt(i)=='#') {
					answer[1] = i;
					break;
				}
			}
			if(answer[1]!=-1) {
				break;
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		
		for(int i=wallpaper.length-1;i>=0;i--) {
			if(wallpaper[i].contains("#")) {
				answer[2] = i+1;
				break;
			}
		}
		
		for(int i=wallpaper[0].length()-1;i>=0;i--) {
			for(int j=0;j<wallpaper.length;j++) {
				if(wallpaper[j].charAt(i)=='#') {
					answer[3] = i+1;
					break;
				}
			}
			if(answer[3]!=0) {
				break;
			}
		}
		System.out.println(answer[2]);
		System.out.println(answer[3]);
	}
}
