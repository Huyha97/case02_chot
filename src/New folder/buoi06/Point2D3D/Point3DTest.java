package buoi06.Point2D3D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(5,6,7);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
