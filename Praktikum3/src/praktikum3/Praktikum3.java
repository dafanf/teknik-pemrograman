package praktikum3;
import java.util.Scanner;
/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-17
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String testString;
        String[] splitedStrings;
        int counter;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the test string : ");
        testString = in.nextLine();
        splitedStrings = testString.split("[-+*/=,.;:'\\s@]");
        System.out.println(splitedStrings.length);
        for(counter = 0; counter < splitedStrings.length;counter++){
            System.out.println(splitedStrings[counter]);
        }
    }
    
}
