package programmers;

import java.util.HashSet;
import java.util.Set;

public class ∫ÒºÛ¿∏∑Œ∫Œ≈Õ_µµ∏¡√ƒ {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String[] bishops = {new String("D5")};
        for(int i=0;i<bishops.length;i++){
					char[] arr = bishops[i].toCharArray();

					int left = (arr[0]-'A');
					int right = 8-left-1;
					int num = Character.getNumericValue(arr[1]);
					
					for(int j=left;j>0;j--){
						if(num+j<=8){
							set.add(Character.toString((char) (arr[0]-j))+Integer.toString(num+j));
						}
						if(num-j>=1){
							set.add(Character.toString((char) (arr[0]-j))+Integer.toString(num-j));
							
						}
					}
					for(int j=right;j>0;j--){
						if(num+j<=8){
							set.add(Character.toString((char) (arr[0]+j))+Integer.toString(num+j));
						}
						if(num-j>=1){
							set.add(Character.toString((char) (arr[0]+j))+Integer.toString(num-j));
						}
					}
				}
				
				for(int i=0;i<bishops.length;i++){
					set.remove(bishops[i]);
				}
        int answer = 64-set.size()-bishops.length;
	}
}
