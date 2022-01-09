package baitapthem.youtube.timSoNgayThang;

import java.util.Scanner;

public class Timsongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int thang, nam;
        System.out.println(" nhap vao nam can tim: ");
        nam = scanner.nextInt();
        System.out.println(" nhap vao thang can tim: ");
        thang = scanner.nextInt();
        switch (thang) {
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
                break;
            case 2:
                if (nam % 4 ==0 && nam % 100 !=0 || nam % 400 ==0) {
                    System.out.println(" có 29 ngày ");
                } else {
                    System.out.println(" có 28 ngày ");
                }
                break;
        }
    }
}
