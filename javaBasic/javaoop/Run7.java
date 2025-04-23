package javaoop;

class FindMin {
    private int f;
    private int s;

    public FindMin(int a, int b) {
        this.f = a;
        this.s = b;
    }
    //cal
    public int fValue() {
        return (f < s)? f:s;
    }
}

public class Run7 {
    public static void main(String[] args) {
        FindMin t = new FindMin(50,60);
        System.out.println("Min And Max = " + t.fValue());
    }
}


