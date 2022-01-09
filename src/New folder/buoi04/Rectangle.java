package buoi04;


import java.util.Scanner;

public class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }


    public String display() {
        return "rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width: ");
        double width = scanner.nextDouble();
        System.out.println("enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your rectangle \n " + rectangle.display());
        System.out.println("chu vi: " + rectangle.getPerimeter());
        System.out.println("area: " + rectangle.getArea());




    }

}
