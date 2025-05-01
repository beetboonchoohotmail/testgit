package javaoop;

class Shape {
    private String name;

    public Shape(String aName){ name = aName; }
    public String getName() { return name; }
    public double calculateArea() { return 0.00; }
}

class Circle extends Shape {

    private double radius;

    public Circle(String aName){
        super(aName);
        radius = 1.0;
    }

    public Circle(String aName, double radius) {
        super(aName);
        this.radius = radius;
    }

    public String getName() {
        return super.getName() + " with rauis =  " + radius;
    }

    public double calculateArea() {
        return (double)3.14 * radius*radius;
    }
}

public class Run52 {
    public static void main(String[] args) {
        Shape s1 = new Shape("Shape s1");
        Circle c1 = new Circle("Circle c1", 3.0);

        System.out.println("The area of " + s1.getName() + " is " + s1.calculateArea() + " sq.cm");
        System.out.println("the area of " + c1.getName() + " is " + c1.calculateArea() + " sq.cm");
    }
}
