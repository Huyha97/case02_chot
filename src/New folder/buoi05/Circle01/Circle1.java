package buoi05.Circle01;

public class Circle1 {
    private static double radius= 1.0;
    private static String color = "red";

    public Circle1() {
    }
    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public static void setRadius(double radius) {
        Circle1.radius = radius;
    }

    public static void setColor(String color) {
        Circle1.color = color;
    }

    public static String getColor() {
        return color;
    }

}
