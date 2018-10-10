package week4.task1;
/**
 * Class Tao ke thua class HoaQua
 * @see HoaQua
 * @author Vân Anh
 */
public class Tao extends HoaQua {
    /**
     contructor voi 2 tham so
     *@param i gia ban
     *@param n so luong tao nhap
     */
    public Tao(int i,int n){
        super(i,n);
    }
    /**
     * contructor khong tham so
     */
    public Tao(){

    }
    /**
     * phuong thuc lay thong tin so tao trong kho
     */
    @Override
    public void laythongtin(){
        System.out.println("Tao trong kho co "+getSoluong()+" qua");
    }
    /**
     phuong thuc nhap so luong tao
     *@param n so luong tao nhap
     */
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Da nhap "+n+" qua tao");
    }
}
