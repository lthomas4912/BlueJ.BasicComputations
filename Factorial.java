 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger num = new BigInteger("1");
        for(int i = 2; i <= value; i++){
        num = num.multiply(BigInteger.valueOf(i));
        }
        
        
        
        return num;
    }

}
