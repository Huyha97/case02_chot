package buoi03;

import java.util.Arrays;
import java.util.Scanner;

public class them_pt_Vao_mang {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,2,3,4,5,6,7,8,9};

        int length = array.length;
        int number;
            System.out.println(Arrays.toString(array));
            int [] newArray = new int[length + 1];
            int j =0;
            System.out.println(" input gia tri add: ");
            number = scanner.nextInt();
            System.out.println(" input vi tri index");
            int index = scanner.nextInt();
            for (int i = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = number;
                } else {
                    newArray[i] = array[j];
                }

            }
            System.out.println(Arrays.toString(newArray));
        }
    }

