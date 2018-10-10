package week4.task1;
/**
 * Class Cam ke thua class HoaQua
 * @see HoaQua
 * @author Vân Anh
 */
public class Cam extends HoaQua {
    /**
     contructor voi 2 tham so
     *@param n gia ban
     *@param g so luong cam nhap
     */
    public Cam(int n ,int g){
        super(n,g);
    }
    /**
     * contructor khong tham so
     */
    public Cam(){

    }
    /**
     * phuong thuc lay thong tin so cam trong kho
     */
    @Override
    public void laythongtin(){
        System.out.println("Cam trong kho co "+getSoluong()+" qua");
    }
    /**
     phuong thuc nhap so luong cam
     *@param n so luong cam nhap
     */
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Da nhap "+n+" cac loai cam");
    }
}
