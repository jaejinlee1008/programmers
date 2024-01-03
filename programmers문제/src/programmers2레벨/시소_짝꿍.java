package programmers2레벨;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 시소_짝꿍 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] {100,180,360,100,270}));
	}
	public static long solution(int[] weights) {
        long answer = 0;
        
        Map<Integer,Long> map = new HashMap<>();
        for(int i : weights){
            map.put(i,(map.getOrDefault(i,0l)+1l));
        }
        
        int[] newarr = new int[map.keySet().size()];
        int k=0;
        for(int key : map.keySet()){
            newarr[k++] = key;
        }
        Arrays.sort(newarr);
        // System.out.println(Arrays.toString(newarr));
        for(int key : newarr){
            long value = map.get(key);
            if(value==1) continue;
            answer+=(value*(value-1))/2;
        }
        for(int i=0;i<newarr.length;i++){
            for(int j=i+1;j<newarr.length;j++){
                if(newarr[j]>newarr[i]*2){
                    break;
                }else{
                    if(newarr[j]*3==newarr[i]*4||newarr[j]*2==newarr[i]*3||newarr[j]==newarr[i]*2){
                        System.out.println(newarr[i]+","+newarr[j]);
                        answer+=map.get(newarr[j])*map.get(newarr[i]);
                    }
                }
            }
        }
        return answer;
    }
}
