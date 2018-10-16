package week5_6;


public class Square extends Rectange {
    private double side=1.0;
    public Square(){

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled,Point x){

        super(side,side,color,filled,x);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth() {

        super.setWidth(side);
    }
    public void setLength()
    {
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Square{ "+"side: "+this.side
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()
                + "," +   "Point: "+this.getX().toString() +" }";
    }
}
