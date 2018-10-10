package week4.task1;
/**
 * Class CamThanhPhong ke thua class Cam
 * @see Cam
 * @author Vân Anh
 */
public class CamThanhPhong extends Cam {
    /**
     contructor voi 2 tham so
     *@param n gia ban
     *@param g so luong cam thanh phong nhap
     */
    public CamThanhPhong(int n ,int g){
        super(n,g);
    }
    /**
     * contructor khong tham so
     */
    public CamThanhPhong(){

    }
    /**
     * phuong thuc lay thong tin so cam thanh phong trong kho
     */
    @Override
    public void laythongtin(){
        System.out.println("Cam Thanh Phong trong kho co "+getSoluong()+" qua");
    }
    /**
     phuong thuc nhap so luong cam thanh phong
     *@param n so luong cam thanh phong nhap
     */
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Da nhap "+n+" qua cam thanh phong");
    }
}
