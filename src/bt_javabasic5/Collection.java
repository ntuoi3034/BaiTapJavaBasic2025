package bt_javabasic5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Collection {
        public void soChan () {
            // Tạo ArrayList để lưu trữ các số chẵn
            ArrayList<Integer> DanhSachSoChan = new ArrayList<>();
            for (int i = 0; i <= 50; i++) {
                if (i % 2 == 0) {
                    DanhSachSoChan.add(i); // Thêm số chẵn vào danh sách
                }
            }
            // In ra các số chẵn bằng vòng lặp for cơ bản
            System.out.println("Các số chẵn từ 0 đến 50 là:");
            for (int i = 0; i < DanhSachSoChan.size(); i++) {
                System.out.print(DanhSachSoChan.get(i) + " ");
            }
        }
        // Hàm riêng thêm thông tin nhân viên
        public static ArrayList<String> themNhanVien(String maNhanVien, String tenNhanVien, LocalDate ngaySinh, String gioiTinh, double luong, String phongBan) {
            // Tạo ArrayList để lưu thông tin nhân viên
            ArrayList<String> DSNhanVien = new ArrayList<>();

            // Thêm thông tin nhân viên vào danh sách
            DSNhanVien.add("Mã nhân viên: " + maNhanVien);
            DSNhanVien.add("Tên nhân viên: " + tenNhanVien);
            DSNhanVien.add("Ngày sinh: " + ngaySinh);
            DSNhanVien.add("Giới tính: " + gioiTinh);
            DSNhanVien.add("Lương: " + luong);
            DSNhanVien.add("Phòng ban: " + phongBan);
            //Trả về danh sách để in ở hàm main
            return DSNhanVien;
        }
    public static void main(String[] args) {
            Collection collection = new Collection();
            collection.soChan();
            // Gọi hàm thêm và lưu kết quả trả về
            ArrayList<String> DSNhanVien = themNhanVien("ND01","Nguyễn Thị Hoa Mai Lan",LocalDate.of(2002, 1, 6), "Nữ", 32457, "Tester");
                    System.out.println("\n===== Thông tin nhân viên =====");
            for (int i = 0; i < DSNhanVien.size(); i++) {
                System.out.println(DSNhanVien.get(i));
            }
        }
}
