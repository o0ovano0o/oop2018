package week4.task1;

/**
 * Class Hoa Qua
 * @author Vân Anh
 */
public class HoaQua {
    private int gia,soluong;
    /**
    *phuong thuc getter cho gia ban
    *@return gia gia ban trai cay
     */
    public int getGia() {
        return gia;
    }
    /**
    *phuong thuc setter cho gia ban
    *@param gia gia ban trai cay
     */
    public void setGia(int gia) {
        this.gia = gia;
    }
    /**
    *phuong thuc getter so luong
    *@return soluong so luong trai cay
     */
    public int getSoluong() {
        return soluong;
    }
    /**
    * phuong thuc  setter so luong
     * @param soluong so luong trai cay
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    /**
    *constructor cua HoaQua voi 2 tham so
     * @param gia gia ban trai cay
     * @param  soluong so luong trai cay
     */
    public HoaQua(int gia, int soluong){
        this.gia=gia;
        this.soluong=soluong;
    }
   /**
    * contructor khong tham so
    */
    public HoaQua(){
    }
    /**
    *phuong thuc  ban hoa qua
     * @param n so luong hoa qua ban ra
     * @return so tien ban duoc
     */
    public int banHoaQua(int n){
        soluong-=n;
        return gia*n;
    }
    /**
     *phuong thuc lay thong tin
     *in ra so luong hoa qua con trong kho
     */
    public void laythongtin(){
        System.out.println("Hoa Qua trong kho co "+ soluong+ " qua");
    }
    /**
     * in thong bao nhap hoa qua
     * @param  n so luong hoa qua nhap vao
     */
    public void nhapHoaQua(int n){
        this.soluong+=n;
        System.out.println("Da nhap "+n+" cac loai qua");
    }
    /**
     * tinh tong so luong hoa qua
     * @param qua so luong cac loai hoa qua
     * @return soluong so luong
     */
    public int TongsoluongHoaQua(int...qua){
        int tong=0;
        for (int i: qua) {
            tong+=i;
        }
        return soluong=tong;
    }
}
