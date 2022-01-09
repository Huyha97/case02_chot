package buoi01;

import jdk.nashorn.internal.ir.Symbol;

import java.util.Scanner;

public class operator_expression {
    public static void main(String[] args) {
        float height;
        float width ;

        Scanner scanner = new Scanner(System.in); // decleare scanner

        System.out.println("enter width: ");
        width = scanner.nextFloat();// input width;

        System.out.println("enter height: ");
        height = scanner.nextFloat(); // input heigth;

        float area = width*height;
        System.out.println("Area is " + area);







    }
}
