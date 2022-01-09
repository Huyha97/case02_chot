package buoi03;

import java.util.Scanner;

public class fing_max {
    public static void main(String[] args) {
        // khai bao bien, nhap kich thuoc mang
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a size: ");
            size = scanner.nextInt();
            if (size >20)
                System.out.println("size sound not exceed 20");
            } while (size >20);
// nhap cac phan tu vao mang
        array = new int[size];
        int i = 0;
        while ( i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        // tim max
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if ( array[j] > max) {
                max = array[j];
                index = j+1;
            }
        }
        System.out.println(" the largest of the array is" + max + " at position " + index);



    }
}
