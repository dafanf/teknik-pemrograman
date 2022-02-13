package comment;

import java.util.Scanner;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-13
 */
public class Strings {
    public static void main(String[] args){
        String firstString, secondString;
        int stringLength, compareResult;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please input first string : ");
        firstString = in.next().toLowerCase();
        System.out.print("Please input second string : ");
        secondString = in.next().toLowerCase();
        
        stringLength = firstString.length()+secondString.length();
        System.out.println("\n"+stringLength);
        
        compareResult = firstString.compareTo(secondString);
        if (compareResult > 0) {
            System.out.println("Yes");
        }
        else if(compareResult <  0){
            System.out.println("No");
        }
        else{
            System.out.println("Equal");
        }
        
        firstString = firstString.substring(0,1).toUpperCase() + firstString.substring(1).toLowerCase();
        secondString = secondString.substring(0,1).toUpperCase() + secondString.substring(1).toLowerCase();
        System.out.println( firstString + " " + secondString);
    }
}
