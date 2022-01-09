package baitapthem.viettus;

import java.util.Scanner;

public class TimPhanNguyenPhanDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap so thu nhat: ");
        int n1 = scanner.nextInt();
        System.out.println(" nhap so thu hai: ");
        int n2 = scanner.nextInt();
        System.out.println("phan nguyen la" + n1/n2);
        System.out.println("phan du la" + n1%n2);
    }
}
