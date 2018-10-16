package week5_6;

public class Triangle extends Shape {
    Point a,b,c;


    public Triangle(String color, boolean filled, Point x, Point a, Point b, Point c) {
        super(color, filled, x);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public  boolean issameTriangle(Shape a){
        Triangle aa = (Triangle)a;
        if(aa.getA().isSamepoint(this.a)&&aa.getB()==this.b&&aa.getC()==this.getC())
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "Triagle{" + "(x1,y1) = " + a.toString() + " (x2,y2) = " + b.toString() + " (x3,y3) = " + c.toString()  + '}';
}


}
