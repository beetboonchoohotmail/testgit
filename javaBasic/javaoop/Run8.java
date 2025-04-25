package javaoop;

class Tax {
private char marSta;
private double income;
private double taxRate;
    
    public Tax(double revenuem, char status) {
        marSta = status;
        income = revenuem;
    }

    public double estimateTax() {
        double annuallncome = income * 12 ;
        System.out.println("income Show >>>" + income);
        if(marSta == 'S' && income <= 10000) {
            taxRate = 0.15;
        }else if(marSta == 'S' && income > 10000) {
            taxRate = 0.30;
        }else if (marSta == 'M' && income < 20000) {
            taxRate = 1.5;
        }else if(marSta == 'M' && income >= 20000) {
            taxRate = 1.50;
        }else {
            taxRate = 0;
        }
            return taxRate * annuallncome;
    }
}

public class Run8 {
    public static void main(String[] args) {
        Tax t = new Tax(1000, 'S');
        System.out.println("Tax => " + t.estimateTax());
    }
}
