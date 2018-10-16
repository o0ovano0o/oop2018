package week5_6;

public  class Shape {
    private String color="red";
    private boolean filled = true;
    private Point x = new Point();
    public Shape(String color, boolean filled, Point x) {
        this.color = color;
        this.filled = filled;
        this.x=x;
    }
    public Shape(){
    }
    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }
     public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
