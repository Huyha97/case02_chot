package baitapthem.quanlySV_TITV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }
//1. them danh sach sinhvien
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }
    //2. in danh sach sinh vien
    public void inDssv(){
        for (SinhVien sinhvien : danhSach) {
            System.out.println(sinhvien);
        }
    }
    // 3.kiem tra danh sach sv co rong hay k
    public boolean checkEmpty(){return this.danhSach.isEmpty();
    }

    // 4.lay ra so luong sv trong danh sach
    public int laySoLuongsv(){
        return this.danhSach.size();
    }
    // 5.lam rong danh sach sv
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    //6. kiem tra ton tai
    public boolean KiemTraTonTaiSv (SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    // 7.xoa
    public boolean XoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }
    //8. tim kiem
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >=0) {
                System.out.println(sinhVien);
            }
        }
    }
    //9. xuat sinh vien diem, tu thap den cao

    public void sapXepSinhVienGiamDanTheoDiem() {
       Collections.sort(this.danhSach, new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien sv1, SinhVien sv2) {
               if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                   return 1;
               } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                   return -1;
               } else {
                   return 0;
               }

           }

       });

        }
    }




