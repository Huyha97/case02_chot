package baitapthem.timSoNgayThang.bai24;



public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        display(circle1);

        Circle c2 = new Circle(2.0);
        display(c2);

        Circle c3 = new Circle(2.0,"blue");
        display(c3);

        Circle c4 = new Circle();
        c4.setColor("white");
        c4.setRadius(10.0);
        display(c4);
    }
    
    public static void display(Circle circle) {
        System.out.println(circle.toString());
        System.out.println("Area: " +circle.getArea() );
    }
}
