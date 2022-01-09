package buoi03;

import java.util.Arrays;
import java.util.Scanner;

public class gopmang_c2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// tao mang arr1
        System.out.println("enter a size: ");
        int size = scanner.nextInt();
        int [] arr1 = new int[size];
        int i = 0;
        while (i < arr1.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            arr1[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(arr1));
// toa mang arr2
        System.out.println("enter a size: ");
        int size2 = scanner.nextInt();
        int [] arr2 = new int[size2];
        int j = 0;
        while (j < arr2.length) {
            System.out.print("Enter element" + (j + 1) + " : ");
            arr2[j] = scanner.nextInt();
            j++;
        }
        System.out.println(Arrays.toString(arr2));

// nhap thu cong ar1      int [] arr1 = {1,2,3};
// nhap thu cong ar1       int [] arr2 = {4,5,6};
        int length = arr1.length + arr2.length;

        // khai báo thêm một mảng mới
        int [] tong = new int[length];
        int pos =0;
        //sử dụng vòng lặp for để lưu các phần tử trong mảng array1 vào mảng tong
        for (int element: arr1) {
            tong[pos] = element;
            pos++;
        }
        //sử dụng vòng lặp for để lưu các phần tử trong mảng array1 vào mảng tong
        for (int element: arr2) {
            tong[pos] = element;
            pos++;
        }
        System.out.println(" mang sau khi nhap la: ");
        System.out.println(Arrays.toString(tong));

        }
    }
