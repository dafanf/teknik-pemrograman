package praktikum3;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-20
 */
public class BigNumber {
    public static void main(String[] args){
        int firstNum, secondNum;
        BigInteger sumResult, multiplicationResult;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the first number : ");
        firstNum = in.nextInt();
        System.out.print("Please enter the second number : ");
        secondNum = in.nextInt();
        
        sumResult = BigInteger.valueOf(firstNum+secondNum);
        multiplicationResult = BigInteger.valueOf(firstNum*secondNum);
        
        System.out.println(firstNum+" + "+secondNum+" = "+sumResult);
        System.out.println(firstNum+" * "+secondNum+" = "+multiplicationResult);
    }
}
