 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String result = "";
        result = result + Integer.toBinaryString( value);
        
        return result;
        
    }

    public String printIntegerAsOctal(int value){
        String result = "";
        result = result + Integer.toOctalString(value);
         
        
      return result;
    } 

    public String printIntegerAsHexadecimal(int value){
        String result = "";
        result = result + Integer.toHexString(value);
        
        return result;
    }

    public static void main(String[] args){

    }
}
