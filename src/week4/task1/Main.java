package week4.task1;

public class Main {
    public static void main(String[] args) {
        CamThanhPhong ctp = new CamThanhPhong(3500,100);
        CamSanh cs= new CamSanh(3000,150);
        Cam cam = new Cam();
        Tao tao = new Tao(4000,200);
        HoaQua hoaqua = new HoaQua();
        int ban =5,nhap=10;
        // Cam Thanh Phong
        ctp.laythongtin();
        System.out.println("Bán " +ban+" quả Cam Thanh Phong thu được: "+ctp.banHoaQua(ban)+"đồng");
        ctp.laythongtin();
        ctp.nhapHoaQua(nhap);
        ctp.laythongtin();
        //Cam Sành
        cs.laythongtin();
        System.out.println("Bán " +ban+" quả Cam Sành thu được: "+cs.banHoaQua(ban)+"đồng");
        cs.laythongtin();
        cs.nhapHoaQua(nhap);
        cs.laythongtin();
        //Cam
        cam.setSoluong(ctp.getSoluong()+cs.getSoluong());
        cam.laythongtin();
        //Tao
        tao.laythongtin();
        System.out.println("Bán " +ban+" quả Táo thu được: "+tao.banHoaQua(ban)+"đồng");
        tao.laythongtin();
        tao.nhapHoaQua(nhap);
        tao.laythongtin();
        //HoaQua
         hoaqua.TongsoluongHoaQua(cam.getSoluong(),tao.getSoluong());
         hoaqua.laythongtin();
         hoaqua.nhapHoaQua(100);
         hoaqua.laythongtin();
    }
}
