package week4.task1;

public class CamSanh extends Cam {
    public CamSanh(int n ,int g){
        super(n,g);
    }
    public CamSanh(){

    }
    @Override
    public void laythongtin(){
        System.out.println("Cam Sành trong kho có "+getSoluong()+" quả");
    }
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Đã nhập "+n+" quả cam sành");
    }
}
