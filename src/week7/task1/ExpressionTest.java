package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Numeral a = new Numeral(10);
        Numeral b = new Numeral(2);
        Numeral c = new Numeral(3);
        Numeral d = new Numeral(1);
        Numeral e = new Numeral(0);
        Square s1 = new Square(a);
        Subtraction sub = new Subtraction(s1,d);
        Mutiplication mul = new Mutiplication(b,c);
        Addition add = new Addition(sub,mul);
        Square s2 = new Square(add);
        System.out.println(s2.toString()+" = "+s2.evaluate());
        Division div = new Division(d,e);
        System.out.println(div.toString());
        try{
            System.out.println(div.evaluate());
        }catch (ArithmeticException ev){
            System.out.println(ev.toString());
        }
    }
}
