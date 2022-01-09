package buoi06.ontap.thuchanhhedoituonghinhhoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double  getArea(){
            return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return radius*Math.PI*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
