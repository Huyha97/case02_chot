package buoi03;

import java.util.Arrays;
import java.util.Scanner;

public class them {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int length = array.length;
        int number;
        System.out.println(Arrays.toString(array));
        int [] newArray = new int[length+1];
        int j = 0;
        System.out.println("Nhập giá trị muốn thêm vào");
        number = input.nextInt();
        System.out.println("Nhập vị trí  muốn thêm vào");
        int index = input.nextInt();
        for (int i = 0; i < newArray.length; i++) {
            if(i == index){
                newArray[i] = number;
            }else {
                newArray[i] = array[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
