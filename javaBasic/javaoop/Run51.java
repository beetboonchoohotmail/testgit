package javaoop;

class Account { // Create class
    private double balance;

    public Account() {
        balance = 0 ; 
    }

    public Account(double amt) {
        this.balance = amt;
    }

    public void deposit(double amount ) {
        balance = balance + amount;
    }

    public void widdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Run51 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(100);
        System.out.println("Deposit >> " + a.getBalance());
        
        a.widdraw(30);
        System.out.println("Widdraw >> " + a.getBalance());
    }
}
