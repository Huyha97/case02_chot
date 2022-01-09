package bai15.thuchanh02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println(" danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner= new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ:");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5" + x + "la" + arr[x] );
        } catch (IndexOutOfBoundsException e) {
            System.err.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
