package javaoop;

class interestCalculator {
    private int years;
    private double rate;
    private double principal;

    // เป็นการรับค่ามาจาก Oject
    public interestCalculator(int years, double rate, double principal) {
        this.years = years;
        this.rate = rate;
        this.principal = principal;
    }

    public double calInterst(){
        double interest;
        for(int i = 0; i < years; i++){
            interest = principal * (rate / 100.00);
            principal += interest;
        } 
        return principal;
    }
}
public class Run50 {
    public static void main(String[] args) {
        interestCalculator ic = new interestCalculator(5,3.5,100000);
        System.out.println("Now principal is " + ic.calInterst());
    }
}
