package week4.task2;

public class Cricle extends Shape {
    private final double PI=3.14;
    private double radius=1.0;
    public Cricle(double radius) {
        this.radius = radius;
    }
    public Cricle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public Cricle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 2*PI*radius;
    }
    public  double getPerimeter(){
        return PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Cricle{ "+"radius: "+this.radius
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()+" }";
    }
}
