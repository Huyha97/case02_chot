package buoi06.thietKeTrienKhai_Triangle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao do dai canh thu nhat");
        double a = scanner.nextDouble();
        System.out.println(" nhap vao do dai canh thu hai");
        double b = scanner.nextDouble();
        System.out.println(" nhap vao do dai canh thu ba");
        double c = scanner.nextDouble();
        System.out.println(" nhap vao mau cua tam giac");
        String color = scanner.next();

        Triangle triangle = new Triangle(color,a,b,c);
        System.out.println(triangle);
        System.out.println(triangle.getPiremeter());
        System.out.println(triangle.getArea());

    }
}
