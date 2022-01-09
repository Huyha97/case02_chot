package buoi06.Point2D3D;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5.0,10.0);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
    }
}
