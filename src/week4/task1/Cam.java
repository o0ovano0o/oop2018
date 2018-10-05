package week4.task1;

public class Cam extends HoaQua {
    public Cam(int n ,int g){
        super(n,g);
    }
    public Cam(){

    }
    @Override
    public void laythongtin(){
        System.out.println("Cam trong kho có "+getSoluong()+" quả");
    }
    @Override
    public void nhapHoaQua(int n){
        setSoluong(getSoluong()+ n);
        System.out.println("Đã nhập "+n+" các loại cam");
    }
}
