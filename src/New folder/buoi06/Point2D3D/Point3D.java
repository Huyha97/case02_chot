package buoi06.Point2D3D;

public class Point3D extends Point2D {
    private double z = 0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public void setXYZ(double x, double y, double z) {
        this.z=z;
        getX();
        getY();
    }

    public double[] getXYZ() {
          double[] array = new double[] { getX(),getY(),getZ()};
        return array;
    }

    @Override
    public String toString() {
        return " A Point3D has " +
                "z=" + z + ", x=" + getX() + ", y=" + getY() +
                ", which a subclass of Point2d";
    }
}
