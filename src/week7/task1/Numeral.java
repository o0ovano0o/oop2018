package week7.task1;

public class Numeral extends Expression {
    int value;

    public Numeral(int value) {
        this.value = value;
    }

    public Numeral(){

    }

    @Override
    public String toString() {
        Integer a=value;
        return a.toString();
    }

    @Override
    public int evaluate() {
        return value;
    }
}
