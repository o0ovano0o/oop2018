package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator, denominator;
    public  void setNumerator(int n){
        this.numerator=n;
    }
    public int getNumerator(){
        return numerator;
    }
    public  void setDenominator(int d){
        this.denominator=d;
    }
    public int getDenominator(){
        return denominator;
    }
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.denominator==other.denominator)
            return new Fraction(this.numerator+other.numerator,other.denominator);
        else{
            return new Fraction(this.numerator*other.denominator+this.denominator*other.numerator,this.denominator*other.denominator);
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if(this.denominator==other.denominator)
            return new Fraction(this.numerator-other.numerator,other.denominator);
        else{
            return new Fraction(this.numerator*other.denominator-this.denominator*other.numerator,this.denominator*other.denominator);
        }
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator*other.numerator,this.denominator*other.denominator);
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator*other.denominator,this.denominator*other.numerator);
    }
    public String format(){
        return numerator+"/"+denominator;
    }
    public  static  void main(String[] args){
        Fraction a= new Fraction(4,5);
        Fraction b = new Fraction(3,2);
        System.out.println(a.format()+" + "+b.format()+" = "+a.add(b).format());
        System.out.println(a.format()+" + "+b.format()+" = "+a.subtract(b).format());
        System.out.println(a.format()+" + "+b.format()+" = "+a.multiply(b).format());
        System.out.println(a.format()+" + "+b.format()+" = "+a.divide(b).format());
    }
}
