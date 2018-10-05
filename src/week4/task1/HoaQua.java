package week4.task1;

/**
 * Class Hoa Qua
 * @author Vân Anh
 */
public class HoaQua {
    private int gia,soluong;
    /**
    *phương thức getter
    *@return gia gia ban trai cay
     */
    public int getGia() {
        return gia;
    }
    /**
    *phương thức setter
    *@param gia gia ban trai cay
     */
    public void setGia(int gia) {
        this.gia = gia;
    }
    /**
    *phương thức getter
    *@return soluong so luong trai cay
     */
    public int getSoluong() {
        return soluong;
    }
    /**
    * phương thức setter
     * @param soluong so luong trai cay
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    /**
    *constructor
     * @param gia gia ban trai cay
     * @param  soluong so luong trai cay
     */
    public HoaQua(int gia, int soluong){
        this.gia=gia;
        this.soluong=soluong;
    }
    public HoaQua(){
    }
    /**
    *phương thức bán hoa quả
     * @param n so luong hoa qua ban ra
     * @return so tien ban duoc
     */
    public int banHoaQua(int n){
        soluong-=n;
        return gia*n;
    }
    /**
     *phương thức lấy thông tin
     *in ra số lượng hoa quả còn trong kho
     */
    public void laythongtin(){
        System.out.println("Hoa Quả trong kho có "+ soluong+ " quả");
    }
    /**
     * in thông báo
     * @param  n so luong hoa qua nhap vao
     */
    public void nhapHoaQua(int n){
        this.soluong+=n;
        System.out.println("Đã nhập "+n+" các loại quả");
    }
    public int TongsoluongHoaQua(int...qua){
        int tong=0;
        for (int i: qua) {
            tong+=i;
        }
        return soluong=tong;
    }
}
