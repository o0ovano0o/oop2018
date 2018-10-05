package week4.task2;

public class Rectange extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectange(){

    }

    public Rectange(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectange(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return 2*(width+length);
    }
    public  double getPerimeter(){
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectange{ "+"width: "+this.width
                + ", "+   "length: "+this.length
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()+" }";
    }
}
