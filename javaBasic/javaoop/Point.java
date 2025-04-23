package javaoop;

class Point_Oop {
    private int x;
    private int y;
    
    public Point_Oop() { x = 0; y = 0;}
    
    public int getX() { return x;}
    public int getY() { return y;}

    public Point_Oop(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }
    
} 

public class Point {
    public static void main(String[] args) {
        Point_Oop p = new Point_Oop();
        System.out.println("Value of p.x = " + p.getX() + " Value of p.y = " + p.getY());
        
        Point_Oop q = new Point_Oop(10,500);
        System.out.println("Value of p.x = " + q.getX() + " Value of p.y = " + q.getY());
    }
}
