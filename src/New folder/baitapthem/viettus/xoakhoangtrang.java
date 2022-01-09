package baitapthem.viettus;

import java.util.Scanner;

public class xoakhoangtrang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chuoi can xoa khoang trang");
        String chuoi = scanner.nextLine();
        System.out.println("chuoi ban dau la: " + chuoi);

        chuoi = chuoi.replaceAll(" ","");
        System.out.println("chuoi sau khi xoa khoang trang la: " + chuoi);

    }
}
