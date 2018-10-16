package week5_6;

public class Hexagon extends Shape {
    private double canh=1.0;
    // get thuoc tinh canh

    public Hexagon(String color, boolean filled, Point x, double canh) {
        super(color, filled, x);
        this.canh = canh;
    }

    public Hexagon(double canh) {
        this.canh = canh;
    }
    public Hexagon() {
    }

    public double getCanh() {
        return canh;
    }
    // set thuoc tinh canh;
    public void setCanh(double canh) {
        this.canh = canh;
    }
    public boolean isSameHexagon(Hexagon a) {
        if(a instanceof Hexagon)
            return a.getX().isSamepoint(this.getX())&&a.getCanh()==this.canh;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "canh=" + canh +
                '}';
    }
}

