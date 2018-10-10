package week4.task1;
/**
 * Class CamSanh ke thua class Cam
 * @see Cam
 * @author Vân Anh
 */
public class CamSanh extends Cam {
    /**
     contructor voi 2 tham so
     *@param n gia ban
     *@param g so luong cam sanh nhap
     */
    public CamSanh(int n ,int g){
        super(n,g);
    }
    /**
     * contructor khong tham so
     */
    public CamSanh(){

    }
    /**
     * phuong thuc lay thong tin so cam sanh trong kho
     */
    @Override
    public void laythongtin(){
        System.out.println("Cam Sanh trong kho co "+getSoluong()+" qua");
    }
    /**
     phuong thuc nhap so luong cam sanh
     *@param n so luong cam sanh nhap
     */
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Da nhap "+n+" qua cam sanh");
    }
}
