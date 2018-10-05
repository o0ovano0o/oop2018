package week4.task1;

public class CamThanhPhong extends Cam {
    public CamThanhPhong(int n ,int g){
        super(n,g);
    }
    public CamThanhPhong(){

    }
    @Override
    public void laythongtin(){
        System.out.println("Cam Thành Phong trong kho có "+getSoluong()+" quả");
    }
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Đã nhập "+n+" quả cam thanh phong");
    }
}
