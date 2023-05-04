package programmers2레벨;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 파일명_정렬 {
	public static void main(String[] args) {
		String[] files = {"img12png", "img10png", "img2png", "img1.png"};
		List<String> list = new ArrayList<>(Arrays.asList(files));
		list.sort(new Comparator<String>() {


			@Override
			public int compare(String o1, String o2) {
				o1=o1.toLowerCase();
				o2=o2.toLowerCase();
				int start1=0;
				int start2=0;
				int end1=0;
				int end2=0;
				boolean isstart=false;
				for(int i=0;i<o1.length();i++) {
					System.out.println(o1.charAt(i));
					if(!isstart&&o1.charAt(i)>='0'&&o1.charAt(i)<='9') {
						start1=i;
						System.out.println("start"+i);
						isstart=true;
					}
					if(isstart&&(o1.charAt(i)<'0'||o1.charAt(i)>'9')) {
						end1=i;
						System.out.println("end"+i);
						break;
					}
					
				}
				if(end1==0) {
					end1=o1.length()-1;
				}
				boolean isstart2=false;
				for(int i=0;i<o2.length();i++) {
					if(!isstart2&&o2.charAt(i)>='0'&&o2.charAt(i)<='9') {
						start2=i;
						isstart2=true;
					}
					if(isstart2&&(o2.charAt(i)<'0'||o2.charAt(i)>'9')) {
						end2=i;
						break;
					}
				}
				if(end2==0) {
					end2=o2.length()-1;
				}
				System.out.println(start2+","+end2);
				String head1=o1.substring(0,start1);
				String head2=o2.substring(0,start2);
				int num1=0;
				int num2=0;
				if(end1+1==o1.length()) {
					num1=Integer.parseInt(o1.substring(start1));
				}else {
					num1=Integer.parseInt(o1.substring(start1, end1));
				}
				if(end2+1==o2.length()) {
					num2=Integer.parseInt(o2.substring(start2));
				}else {
					num2=Integer.parseInt(o2.substring(start2, end2));
				}
				
//				System.out.println(head1);
//				System.out.println(head2);
//				System.out.println(num1);
//				System.out.println(num2);
				if(head1.compareTo(head2)>0) {
					return 1;
				}else if(head1.compareTo(head2)==0) {
					if(num1>num2) {
						return 1;
					}else if(num1==num2) {
						return 0;
					}else {
						return -1;
					}
				}else {
					return -1;
				}
			}
		});
//		for(String s : list) {
//			System.out.println(s);
//		}
	}
}
