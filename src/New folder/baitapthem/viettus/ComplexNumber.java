package baitapthem.viettus;

public class ComplexNumber {
    double real, img;

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static ComplexNumber sum (ComplexNumber c1, ComplexNumber c2){
        ComplexNumber temp = new ComplexNumber(0,0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5.2, 4.4);
        ComplexNumber c2 = new ComplexNumber(2.0, 7.3);
        ComplexNumber temp =    sum(c1,c2);
        System.out.println(" ket qua la: " + temp.real + " + " + temp.img + "i");

    }

}
