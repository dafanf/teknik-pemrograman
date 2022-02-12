package comment;

import java.util.Scanner;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since 22-02-12
 */
public class DataTypes {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int totalCase, caseOrder, loopCounter;
        long testCase;
        
        System.out.print("Input total case : ");
        totalCase = in.nextInt();
        for(loopCounter = 0; loopCounter < totalCase; loopCounter++){
            try {
                caseOrder = loopCounter + 1;
                System.out.println("\nCase - "+caseOrder);
                System.out.print("Input number : ");
                testCase = in.nextLong();
                System.out.println(testCase+" can be fit in:");
                if(testCase >= Byte.MIN_VALUE && testCase <= Byte.MAX_VALUE){
                    System.out.println("* Byte");
                }
                if(testCase >= Short.MIN_VALUE && testCase <= Short.MAX_VALUE){
                    System.out.println("* Short");
                }
                if(testCase >= Integer.MIN_VALUE && testCase <= Integer.MAX_VALUE){
                    System.out.println("* Integer");
                }
                if(testCase >= Long.MIN_VALUE && testCase <= Long.MAX_VALUE){
                    System.out.println("* Long");
                }
            } catch (Exception caseError){ 
                System.out.println(" can't be fit in anywhere.");
                in.next();
            }
        }
    } 
}
