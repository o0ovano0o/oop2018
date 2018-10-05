package week4.task1;

public class Tao extends HoaQua {
    public Tao(int i,int n){
        super(i,n);
    }
    @Override
    public void laythongtin(){
        System.out.println("Táo trong kho có "+getSoluong()+" quả");
    }
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Đã nhập "+n+" quả táo");
    }
}
