package javaoop;

class Rectangle {
    private int wid;
    private int len;
    
    public void setLen(int len) { this.len = len; }
    public void setWid(int wid) { this.wid = wid; }

    public int getLen() { return len; }
    public int getWid() { return wid; }
    
    public Rectangle(int a, int b) {
        this.setLen(a);
        this.setWid(b);
    }
    public int calArea() { return this.getWid() * this.getLen(); }
}

public class Run4 {
    public static void main(String[] args) {
        int  unit = 0;
        Rectangle color = new Rectangle(6, 5);
        if(color.calArea() %35 != 0) {
            unit +=1;
        }
        System.out.println("Unit of can = " + (color.calArea()/35 + unit));
    }
}
