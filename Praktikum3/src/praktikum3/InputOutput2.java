package praktikum3;
import java.util.Scanner;
/**
 * @author  DAFA N.F
 * @version 1.1
 * @since   2022-02-17
 */
public class InputOutput2 {
    public static void main(String[] args){
        String[] testString;
        int[] testValue;
        int counter, totalCase, nowCase;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please input total case : ");
        totalCase = in.nextInt();
        
        testString = new String[totalCase];
        testValue = new int[totalCase];
        for(counter = 0; counter < totalCase; counter++){
            nowCase = counter + 1;
            testString[counter] = in.next();
            testValue[counter] = in.nextInt();
        }
        System.out.println("\n=====================================");
        
        for(counter = 0; counter < testString.length;counter++){
            System.out.printf("%-15s%03d%n",testString[counter],testValue[counter]);
        }
        System.out.println("=====================================");
    }
}
