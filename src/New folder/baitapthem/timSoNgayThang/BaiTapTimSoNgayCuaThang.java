package baitapthem.timSoNgayThang;

import java.util.Scanner;

public class BaiTapTimSoNgayCuaThang {
    public static void main(String[] args) {
        int thang, nam;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao thang can tim so ngay");
        thang = scanner.nextInt();
        System.out.println("nhap vao nam can tim so ngay");
        nam = scanner.nextInt();

        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" có 30 ngày");
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 ==0)   {
                    System.out.println(" có 29 ngày ");
                } else {
                    System.out.println(" có 28 ngày");
                }
                break;
            default:
                System.out.println("nhập dữ liệu sai");
                break;
        }
    }
}
