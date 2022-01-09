package buoi03;

import java.util.Arrays;

public class gop_mang {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2= {4,5,6};

        int length = arr1.length + arr2.length;
        int [] result = new int[length];
        int pos = 0;
        for (int a: arr1) {
            result [pos] = a;
            pos++;
        }
        for (int a: arr2) {
            result [pos] = a;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
