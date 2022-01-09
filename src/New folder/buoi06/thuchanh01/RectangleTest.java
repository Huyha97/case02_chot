package buoi06.thuchanh01;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("greeen", false);
        System.out.println(rectangle);

        rectangle = new Rectangle("greeen", false,10,5);
        System.out.println(rectangle);
    }
}
