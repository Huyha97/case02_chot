package buoi06.thuchanh01;


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("Indigo",false, 3.5);
        System.out.println(circle);
    }
}
