package baitapthem.viettus;

import java.util.Scanner;

public class maytinhdongian {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số thứ nhất");
        num1 = scanner.nextDouble();
        System.out.println("nhập số thứ hai");
        num2 = scanner.nextDouble();
        System.out.println(" chọn phép tính (+,-, *, /): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println(" bạn chọn sai phép tính");
                return;
        }
        System.out.println(" kết quả phép tính là: ");
        System.out.println(num1 + " " + operator +" " + num2 + " = " + output);
        System.out.println("--------------------------");

    }

}
