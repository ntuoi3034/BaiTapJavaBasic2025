package bt_javabasic1;

public class SinhVien {
    String HoTen = "Nguyễn Thị Hoa Mai Lan";
    static String TruongHoc = "Đại Học Thủy Lợi";

    public void lop(){
        String Lop  = "62TH1";
        System.out.println("Lớp = " + Lop);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.lop();
        System.out.println("Bạn " + sv.HoTen + " học tại trường " + TruongHoc + " ở Thành phố " + ThongTinTruong.ThanhPho + " - Quận " + ThongTinTruong.Quan);
    }
}
