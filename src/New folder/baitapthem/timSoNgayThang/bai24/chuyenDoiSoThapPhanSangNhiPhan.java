package baitapthem.timSoNgayThang.bai24;

import java.util.Scanner;

public class chuyenDoiSoThapPhanSangNhiPhan {
    public static void main(String[] args) {
        int n=0;
       Scanner scanner = new Scanner(System.in) ;
        System.out.println(" nhap vao so nguyen n >0: ");
        n = scanner.nextInt();
        String nhiPhan = "";
        while (n>0) {
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println(" so he nhi phan la" + nhiPhan);


    }
}
