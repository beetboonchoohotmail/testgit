package javaoop;

class InnerRun49 {
    private int watts;
    
    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public double buibPrice() {

        double price = 0;
        switch (watts) {
            case 40: price = 22.50; break;
            case 50: price = 35.50; break;
            case 60: price = 55.50; break;
            default: System.out.println("Invalid watts");
        }
        return price;
    }
}

public class Run49 {
    public static void main(String[] args) {
        InnerRun49 t = new InnerRun49();
        t.setWatts(50);
        System.out.println("getShow >> " + t.getWatts());
        System.out.println("Price Show >> " +  t.buibPrice());
    }
}
