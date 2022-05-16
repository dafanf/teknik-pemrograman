package praktikum3;
import java.util.Scanner;
/**
 * @author  DAFA N.F
 * @version 1.1
 * @since   2022-02-18
 */
public class Barricade {
    public static void main(String[] args){
        String platNum;
        final int modNum = 5;
        final long subtractingNum = 9999999;
        long modulusResult;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 4 car number plates : ");
        platNum = in.nextLine();
        platNum = platNum.replaceAll("\\s", "");
        modulusResult = Long.parseLong(platNum);
        modulusResult = modulusResult - subtractingNum;
        modulusResult = modulusResult % modNum;
        if(modulusResult == 0){
            System.out.println("Stop");
        }
        else{
            System.out.println("Go");
        }
    }
}
