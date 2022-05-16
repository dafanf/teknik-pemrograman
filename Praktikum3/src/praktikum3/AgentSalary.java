package praktikum3;

import java.util.Scanner;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-18
 */
public class AgentSalary {
    public static void main(String[] args){
        final int basicSalary = 500000, itemPrice = 50000;
        int totalSalary, itemSold;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter the number of items sold this month : ");
        itemSold = in.nextInt();
        
        if(itemSold < 15){
            totalSalary = basicSalary - (15-itemSold) * itemPrice * 15/100;
        }
        else if(itemSold >= 40 && itemSold <= 80){
            totalSalary = basicSalary + (itemSold*itemPrice*25/100);
        }
        else if(itemSold > 80){
            totalSalary = basicSalary + (itemSold*itemPrice*35/100);
        }
        else{
            totalSalary = basicSalary + (itemSold*itemPrice*10/100);
        }
        System.out.println("Total agent salary = "+totalSalary);
    }
}
