package bai15.baitap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        try {
            inputSide();
        } catch (TriangleException te) {
            System.out.println(te);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void inputSide() throws IOException, TriangleException {
        int aSide;
        int bSide;
        int cSide;
        Process process;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a size: ");
        aSide = Integer.parseInt(br.readLine());
        System.out.println("enter b size: ");
        bSide = Integer.parseInt(br.readLine());
        System.out.println("enter c size: ");
        cSide = Integer.parseInt(br.readLine());

        if (aSide <=0|| bSide <=0 || cSide <= 0)
            throw new TriangleException("side is not valid value");
        if (aSide + bSide <= cSide || aSide + cSide <= bSide || bSide + cSide <= aSide )
            throw new TriangleException(" not a triangle");

        Triangle triangle = new Triangle(aSide,bSide,cSide);
        System.out.println(triangle.getA() + " " + triangle.getB() + " " + triangle.getC());
    }
}
