package javaoop;

class PhoneBill{
    private double bill;
    private int usage;

    public PhoneBill(int usage) { this.usage = usage; }     // set ค่า
    public int getUsage() { return this.usage; } // get ค่า

    public double calculateBill() {
        if(usage > 100) {
            if (usage <= 200) { bill = 80 + (usage - 100) * 1;}
            else { bill = 130 + (usage - 200) * 0.5; }
        } else {
            bill = 80.00;
        }
        return bill;
    }
    
}

public class Run6 {
    public static void main(String[] args) {
        PhoneBill time = new PhoneBill(101);
        System.out.println("Usage time = " + time.getUsage());
        System.out.println("Bill expense = " + time.calculateBill());
    }
}
