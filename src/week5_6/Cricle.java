package week5_6;



/**
 *class cricle ke thua tu shape
 *@see Shape
 *@author Vân Anh*/
public class Cricle extends Shape {
    private static final double PI=3.14;
    private double radius=1.0;
    /**
    *contructor cricle voi 1 tham so
    * @param radius ban kinh hinh tron
    */

    public Cricle(double radius) {
        this.radius = radius;
    }
    /**
    *contructor cricle voi 3 tham so
    * @param radius ban kinh 
    * @param color mau sac
    * @param  filled day hay khong
    */
    public Cricle(double radius, String color, boolean filled, Point x){
        super(color,filled,x);
        this.radius=radius;
    }
    /**
    *contructor cricle voi 2 tham so  
    */
    public Cricle(){
    }
    /**
     *phuong thuc getter ban kinh
     *@return radius ban kinh */
    public double getRadius() {
        return radius;
    }
     /**
     *phuong thuc setter ban kinh
     *@param radius ban kinh */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     *phuong thuc tinh dien tich
     *@return dien tich hinh tron 
     */
    public double getArea(){
        return 2*PI*radius;
    }
    /**
     *phuong thuc tinh chu vi
     *@return chu vi hinh tron 
     */
    public  double getPerimeter(){
        return PI*Math.pow(radius,2);
    }
    public boolean issameCricle(Shape a){
        Cricle b = (Cricle) a;
        if(b.getRadius()==this.radius&&this.getX().isSamepoint(b.getX()))
            return true;
        return false;
    }
     /**
     *phuong thuc soString 
     *@return  String chua cac du lieu cua hinh tron*/
    @Override
    public String toString() {
        return "Cricle{ "+"radius: "+this.radius
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()
                + "," +   "Point: "+this.getX().toString() +" }";
    }
}
