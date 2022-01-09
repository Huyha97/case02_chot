package baitapthem.viettus;

import java.util.Scanner;

public class namnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao nam can kiem tra");
        int n = scanner.nextInt();
        boolean isleap = false;
        boolean b = n % 4 == 0;
        if (b) {
            boolean b1 = n % 100 == 0;
            if (b1) {
                boolean b2 = n % 400 == 0;
                if (b2) {
                    isleap = true;
                } else
                    isleap = false;
            } else {
                isleap = true;
            }
        } else {
            isleap = false;
        }
        if (isleap == true)
            System.out.println(n + " la nam nhuan");
        else
            System.out.println(n + " ko la nam nhuan");
    }
}
