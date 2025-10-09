package BT_JavaBasic1;

public class SinhVien {
    String TenBien2 = "Biến toàn cục";
    static String Tenbien3 = "Biến tĩnh";

    public void KhaiBaoBienLocal(){
        String TenBien1 = "Biến cục bộ";
        System.out.println("Biến local = " + TenBien1);
    }

    public static void main(String[] args) {
        System.out.println("Biến static = " + Tenbien3);
        SinhVien sv = new SinhVien();
        System.out.println("Biến instance = " + sv.TenBien2);
        sv.KhaiBaoBienLocal();//in ra tất cả các biến cục bộ bên trong hàm khaibao..
        System.out.println("In ra giá trị của biến static age được khai báo trong class ThongTin: " + ThongTin.age); //gọi và in ra giá trị biến age từ class Thông tin
        System.out.println("In ra giá trị của biến static name được khai báo trong class ThongTin: " + ThongTin.name);
    }
}
