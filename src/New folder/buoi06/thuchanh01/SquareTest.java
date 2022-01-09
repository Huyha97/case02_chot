package buoi06.thuchanh01;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(5.0);
        System.out.println(square);

        square = new Square(5.0,"green", true);
        System.out.println(square);
    }
}
