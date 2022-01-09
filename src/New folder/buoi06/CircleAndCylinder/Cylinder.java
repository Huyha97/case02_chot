package buoi06.CircleAndCylinder;

public class Cylinder extends Circle {
    private double high;

    public Cylinder() {
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

public double getVolum(){
        return  Math.PI * high * getRadius()*getRadius();
}

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +
                ", which is a subclass of circle";
    }
}
