package buoi06.Point2D3D;

public class Point2D {
    private double x = 0;
    private double y = 0;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double[] getXY() {
        double[] array = new double[] {getX(), getY()};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
