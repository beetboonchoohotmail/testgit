package javaoop;

class CheckNumber {
    private int number;

    public CheckNumber(int n) {
        number = n;
    }

    public void checkEvenOrOdd() {
        if(number % 2 == 0) {
            System.out.println("หาร 2 ลง 0");
        } else {
            System.out.println("หาร 2 ไม่ลงตัว");
        }
    }
}

public class Run5 {
    public static void main(String[] args) {
        CheckNumber n = new CheckNumber(11);
        // แสดงค่า
        n.checkEvenOrOdd();
    }
}
