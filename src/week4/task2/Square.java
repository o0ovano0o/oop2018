package week4.task2;

public class Square extends Rectange {
    private double side=1.0;
    private Shape A;
    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side,String color,boolean filled){
       super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth() {
        super.setWidth(side);
    }
    public void setLength(){
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Square{ "+"side: "+this.side
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()+" }";
    }
}
