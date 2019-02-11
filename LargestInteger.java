 

import java.lang.Math;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Integer num = 0;
        for(int i = 0; i < integers.length; i++){
            if(integers[i]> num) {
            num = integers[i];
            
            }
        
        
        }
        
        return num;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Integer num = 0;
        for(int i = 1; i < integers.length; i++){
            num = Math.max(integers[i-1],integers[i]);
        
        }
    return num;
    }
}
