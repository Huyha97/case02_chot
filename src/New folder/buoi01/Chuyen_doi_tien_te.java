package buoi01;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd*23000;
        System.out.print(" gia tri VND " + quydoi);
    }
}
