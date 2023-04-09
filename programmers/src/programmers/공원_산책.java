package programmers;

public class 공원_산책 {
	public static void main(String[] args) {
		String[] park = {"OSO","OOO","OXO","OOO"};
		String[] routes = {"E 2","S 3","W 1"};
		int[] point = new int[2];
		
		for(int i=0;i<park.length;i++) {
			if(park[i].contains("S")) {
				point[0] = i;
				point[1] = park[i].indexOf("S");
			}
		}
		
		
		for(int i=0;i<routes.length;i++) {
			if(routes[i].startsWith("E")&&canGoE(park[point[0]],routes[i],point)) {
				point[1] += Integer.parseInt(routes[i].substring(2));
			}else if(routes[i].startsWith("S")&&canGoS(park,routes[i],point)) {
				point[0] += Integer.parseInt(routes[i].substring(2));
			}else if(routes[i].startsWith("W")&&canGoW(park[point[0]],routes[i],point)) {
				point[1] -= Integer.parseInt(routes[i].substring(2));
			}else if(routes[i].startsWith("N")&&canGoN(park,routes[i],point)) {
				point[0] -= Integer.parseInt(routes[i].substring(2));
			}
			
		}
		
		
		
	}
	
	public static boolean canGoE(String load, String route, int[] point) {
		if(load.length()<=point[1]+Integer.parseInt(route.substring(2))) {
			return false;
		}
		if(load.contains("X")) {
			for(int i=point[1];i<=point[1]+Integer.parseInt(route.substring(2));i++) {
				if(load.charAt(i)=='X') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean canGoS(String[] park, String route, int[] point) {
		if(park.length<=point[0]+Integer.parseInt(route.substring(2))) {
			return false;
		}
		for(int i=point[0];i<=point[0]+Integer.parseInt(route.substring(2));i++) {
			if(park[i].charAt(point[1])=='X') {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean canGoW(String load, String route, int[] point) {
		if(point[1]-Integer.parseInt(route.substring(2))<0) {
			return false;
		}
		if(load.contains("X")) {
			for(int i=point[1];i>=point[1]-Integer.parseInt(route.substring(2));i--) {
				if(load.charAt(i)=='X') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean canGoN(String[] park, String route, int[] point) {
		if(point[0]-Integer.parseInt(route.substring(2))<0) {
			return false;
		}
		for(int i=point[0];i>=point[0]-Integer.parseInt(route.substring(2));i--) {
			if(park[i].charAt(point[1])=='X') {
				return false;
			}
		}
		
		return true;
	}
}
