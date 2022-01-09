package buoi06.thuchanh01;

public class Circle extends Shape  {
    private double radius =1.0;
//phuong thuc01: khong tham so;
    public Circle() {
    }
//phuong thuc02: 2 ke thua, 1 moi khoi tao
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
//phuong thuc03:
public Circle(double radius) {
    this.radius = radius;
}
// tao getter anh setter;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAera() {
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",which is a subclass of " + super.toString();
    }
}
