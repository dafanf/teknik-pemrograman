package comment;
import java.io.*;
/**
 * <h1> Add Two Numbers</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 * the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as high quality code.
 * 
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-12
 */
public class Comment {
    /**
     * This method is used  to  add two  integers. This is
     * a simplest form of class method, just to 
     * show the usage of various javadoc Tags.
     * @param numA This is the first parameter to addNum method
     * @param numB This is the second parameter to addNum method
     * @return int This returns the sum of numA and numB.
     */
    public int addNum(int numA, int numB){
        return numA + numB;
    }
    
    /**
     * This is the main method which use of the addNum method.
     * @param args Unused.
     * @exception IOException On input error.
     * @see IOException
     */
    
    public static void main(String args[])throws IOException{
        Comment obj = new Comment();
        int sum = obj.addNum(10, 20);
        
        System.out.println("Sum of 10 and 20 is : "+ sum);
    }
}
