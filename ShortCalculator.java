

import java.util.Scanner;
public class ShortCalculator {
    short num;
    short num1;
    short result;
    public short add(short num, short num1){
        return result = (short) (num + num1);
    }

    public short sub(short num, short num1){
        return result = (short) (num - num1);
    }

    public short mult(short num, short num1){
        return result = (short) (num * num1);
    }

    public short div(short num, short num1){
        return result = (short) (num / num1);
    }
    
    public short mod(short num, short num1) {
        return result = (short) (num % num1);
    }

    public  void main(String [] args){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        scanner.nextShort();
        System.out.println("Please enter a second number: ");
        scanner.nextShort();
        System.out.println("Please choose: " + "1 to Add, " +
                " 2 to Subtract, " + "3 to Multiply " + "4 to Divide");
        String operator = scanner.nextLine();

        switch(operator){
            case "1":
                result = (short) (num + num1);
                break;
            case "2":
                result = (short) (num - num1);
                break;
            case "3":
                result = (short) (num * num1);
            case "4":
                result = (short) (num / num1);
                break;
            case "5":
                result = (short) ( num % num1);
            default:
                System.out.println("Error");
        }

    }
}

