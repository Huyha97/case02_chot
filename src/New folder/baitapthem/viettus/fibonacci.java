package baitapthem.viettus;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int count;
        int num1 =0;
        int num2 =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập vào độ dài chuỗi fibonacci: ");
        count = scanner.nextInt();
        scanner.close();
        System.out.println(" chuoi fibonacci la: ");
        int i =1;
        while (i <= count ){
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
        System.out.println("--------------------");

    }
}
