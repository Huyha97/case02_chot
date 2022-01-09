package buoi09.main.phanLoaiTamGiac;

import java.util.Scanner;

public class TriangleClassifier {
    public static void TamGiac() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh a:");
        double a = scanner.nextDouble();
        System.out.println("nhap canh b:");
        double b = scanner.nextDouble();
        System.out.println("nhap canh c:");
        double c = scanner.nextDouble();
        if ( a == b && b ==c ) {
            System.out.println("a,b,c la do dai 3 canh tam giac deu");
        } else if (a ==b || b ==c || c == a) {
                System.out.println("a,b,c la do dai 3 canh tam giac can");

        } else if (a != b && b!=c && c!= a && a + b > c && b+c > a && c + a > b) {
            System.out.println(" a,b,c la do dai 3 canh tam giac");
        } else  if ( a==0 || b == 0 || c ==0) {
            System.out.println("a,b,c khong la do dai 3 canh tama giac");
        } else {
            System.out.println("a,b,c khong la do dai 3 canh tama giac");
        }
    }
}
