package buoi04;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return this.b*this.b - 4*this.a*this.c;
    }
    public double getRoot1() {
        return (- this.b - Math.sqrt(getDiscriminant()))/(2*this.a);
    }
    public double getRoot2() {
        return (- this.b + Math.sqrt(getDiscriminant()))/(2*this.a);
    }
}
class GiaiPhuongTrinhBac_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        double a = scanner.nextDouble();
        System.out.println("input b: ");
        double b = scanner.nextDouble();
        System.out.println("input c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println(" phuong trinh co hai nghiem: " + "x1=" + quadraticEquation.getRoot1() + "x2=" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phuong trinh co nghiem kep" + "x= " + quadraticEquation.getRoot1());
        } else {
            System.out.println(" phuong trinh vo nghiem");
        }
    }
}
