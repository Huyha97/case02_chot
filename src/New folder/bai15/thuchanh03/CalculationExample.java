package bai15.thuchanh03;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println(" input x: ");
        int x = scanner.nextInt();
        System.out.println(" input y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("sum x + y = " + a);
            System.out.println("sub x + y = " + b);
            System.out.println("mul x + y = " + c);
            System.out.println("div x + y = " + d);
        } catch (Exception e) {
            System.err.println("xay ra ngoai le: " + e.getMessage());
        }
    }
}
