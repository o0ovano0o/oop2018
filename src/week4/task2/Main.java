package week4.task2;

public class Main {
    public static void main(String[] args) {
        Cricle h1= new Cricle(2.3);
        System.out.println(h1.toString());
        Rectange h2 = new Rectange(4,6);
        System.out.println(h2.toString());
        Square h3 = new Square(4);
        System.out.println(h3.toString());
        Rectange h4 = new Square(5);
        System.out.println(h4.toString());
    }
}
