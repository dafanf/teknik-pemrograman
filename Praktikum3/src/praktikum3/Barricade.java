package praktikum3;
import java.util.Scanner;
/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-18
 */
public class Barricade {
    public static void main(String[] args){
        String platNum;
        int modNum = 5;
        long subtractingNum = 9999999;
        long modulusResult;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 4 car number plates : ");
        platNum = in.nextLine();
        platNum = platNum.replaceAll("\\s", "");
        modulusResult = Long.parseLong(platNum);
        modulusResult = modulusResult - subtractingNum;
        modulusResult = modulusResult % modNum;
        System.out.println(modulusResult);
        if(modulusResult == 0){
            System.out.println("Stop");
        }
        else{
            System.out.println("Go");
        }
    }
}
