/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeofemployees;

/**
 *
 * @author DAFA N.F
 */
public class Commision extends Hourly{
    private double totalSales;
    private double commissionRate;

    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double sales){
        totalSales += sales;
    }
    
    @Override
    public double pay(){
        double commision = totalSales * commissionRate/100;
        double payment = super.pay() + commision;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        
        return result;
    }
    
}
