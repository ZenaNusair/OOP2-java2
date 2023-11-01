package test;

public class Circle {

    public static final double PI = 3.14;
    private int rad;
    private double Area;
    private double Round;

    public Circle(int rad) {
        this.rad = rad;
        setRad(rad);
    }
    public void setRad(double newRad) {
        
    }

    public Circle() {
    }

    public double getArea() {
        double Area = 2 * PI * rad;
        System.out.println("Area=");
        return Area;
    }

    public double getRound() {
        double Round = rad * rad * PI;
        System.out.println("Round=");
        return Round;
    }

    public void setArea(double newArea) {
        this.Area = newArea;
    }

    public void setRound(double newRound) {
        this.Round = newRound;
    }
}
