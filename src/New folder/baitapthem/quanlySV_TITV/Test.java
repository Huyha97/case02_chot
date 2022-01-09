package baitapthem.quanlySV_TITV;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choice =0;
        do {
            System.out.println("_________Menu________");
            System.out.println("1. Thêm sv vào danh sách"); // ok
            System.out.println("2. In dssv"); // ok
            System.out.println("3. kiểm tra dssv có rỗng hay ko"); //ok
            System.out.println("4. lấy ra số lượng sv trong ds");  //OK
            System.out.println("5. làm rỗng dssv"); // OK
            System.out.println("6. kiểm tra sv có tồn tại trong ds hay ko, dựa vào msv");
            System.out.println("7. xóa sv khỏi ds dựa trên mã sv");
            System.out.println("8. tìm kiếm tất cả sv dựa trên tên được nhập từ bàn phím "); //OK
            System.out.println("9. xuất ra màn hình dssv có điểm từ cao đến thấp "); // OK
            System.out.println("0. thoát khỏi chương trình");
            System.out.println(" nhập lựa chọn của bạn @>@");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(" nhap ma sinh vien");
                    String maSinhVien = scanner.next();
                    System.out.println(" nhap ho va ten");
                    String hovaTen = scanner.next();
                    System.out.println("nhap nam sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.println(" nhap diem trung binh ");
                    float diemTrungBinh = scanner.nextFloat();
                    SinhVien sv = new SinhVien(maSinhVien,hovaTen,namSinh,diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    dssv.inDssv();
                    break;
                case 3:
                    System.out.println("danh sach rong " + dssv.checkEmpty());
                     break;
                case 4:
                    System.out.println(" so luong hien tai: " + dssv.laySoLuongsv());
                   break;
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("nhập mã sinh viên ");
                    String maSinhVien1 = scanner.nextLine();
                    SinhVien sv1 = new SinhVien(maSinhVien1);
                    System.out.println("kiểm tra sinh viên có trong danh sách: " + dssv.KiemTraTonTaiSv(sv1));
                    break;
                case 7:
                    System.out.println("nhập mã sinh viên ");
                    String maSinhVien2 = scanner.nextLine();
                    SinhVien sv2 = new SinhVien(maSinhVien2);
                    System.out.println(" xóa sinh viên " + dssv.XoaSinhVien(sv2));
                    break;
                case 8:
                    System.out.println(" nhap ho va ten");
                    String hovaTen1 = scanner.nextLine();
                    System.out.println(" kết quả tìm kiếm :");
                    dssv.timSinhVien(hovaTen1);
                    break;
                case 9:
                    dssv.sapXepSinhVienGiamDanTheoDiem();
                    dssv.inDssv();

            }
        } while (choice!=0);
    }
}
