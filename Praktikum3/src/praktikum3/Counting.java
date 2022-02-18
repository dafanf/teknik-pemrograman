package praktikum3;

import java.util.Scanner;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-18
 */
public class Counting {
    public static void main(String[] args){
        int firstNum, secondNum, result;
        String operator;
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the counting statement (ex: 1 + 1) : ");
        firstNum = in.nextInt();
        operator = in.next();
        secondNum = in.nextInt();
//        firstNum = Integer.parseInt(splitedStrings[1]);
//        secondNum = Integer.parseInt(splitedStrings[3]);
        if(operator.equals("*")){
            result = firstNum * secondNum;
            System.out.println("The result of "+firstNum+" "+operator+" "+secondNum+" = "+result);
        }
        else if(operator.equals("/")){
            result = firstNum / secondNum;
            System.out.println("The result of "+firstNum+" "+operator+" "+secondNum+" = "+result);
        }
        else if(operator.equals("+")){
            result = firstNum + secondNum;
            System.out.println("The result of "+firstNum+" "+operator+" "+secondNum+" = "+result);
        }
        else if(operator.equals("-")){
            result = firstNum - secondNum;
            System.out.println("The result of "+firstNum+" "+operator+" "+secondNum+" = "+result);
        }
        else if(operator.equals("%")){
            result = firstNum % secondNum;
            System.out.println("The result of "+firstNum+" "+operator+" "+secondNum+" = "+result);
        }
        else{
            System.out.println("Your process is not defined please input +,-,*,/,%");
        }
    }
}
