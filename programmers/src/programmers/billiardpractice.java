package programmers;

public class billiardpractice {
	public static void main(String[] args) {
		
		int m=10;
		int n=10;
		int startX=3;
		int startY=7;
		int[][] balls = {{7,7},{2,7},{7,3}};
		int[] answer= new int[balls.length];
		int result=0;
		int min=0;
		for(int i=0;i<balls.length;i++)
		{
			int endX=balls[i][0];
			int endY=balls[i][1];
			if(startY==endY) {
				if(startX<endX) {
					min = (int)Math.pow(startX+endX,2);
				}else {
					min = (int)Math.pow(m-startX+m-endX, 2);
				}
				
				
				if(startY>n/2) {
					endY=n+(n-endY);
					result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
					
				}else {
					endY=-endY;
					result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
					
				}
				if(min>result) {
					min=result;
				}
				
				answer[i]=min;
			}else if(startX==endX) {
				if(startY<endY) {
					min = (int)Math.pow(startY+endY,2);
				}else {
					min = (int)Math.pow(n-startY+n-endY, 2);
				}
				if(startX>m/2) {
					endX=m+(m-endX);
					result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
					
				}else {
					endX=-endX;
					result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
				
				}
				if(min>result) {
					min=result;
				}
				answer[i]=min;
			}else {
				
				endY=-endY;
				result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
				min=result;
				endY=-endY;
				
				endX=-endX;
				result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
				if(min>result) {
					min=result;
				}
				endX=-endX;
				
				endX=m+(m-endX);
				result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
				if(min>result) {
					min=result;
				}
				endX=m-(endX-m);
				
				endY=n+(n-endY);
				result=(int) (Math.pow(endX-startX,2)+Math.pow(endY-startY,2));
				if(min>result) {
					min=result;
				}
				
				answer[i]=min;
			}
			System.out.println(min);
		}
		

	}
}
