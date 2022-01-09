package buoi06.CircleAndCylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0,"green",10.0);
        System.out.println(cylinder);
    }
}
