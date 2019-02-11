 
import java.lang.Math;
import java.util.Scanner;
public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
       
       Integer result ;
       
       result = (angle %= 360); 
       
        
      
        
        return result;
        
    }

    public int normalizeValueUsingFloorMod(int num){
       
        
        int result = Math.floorMod(num, 360);

        return result;

       
    }

   

    
}
