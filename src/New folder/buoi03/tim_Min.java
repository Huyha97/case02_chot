package buoi03;

public class tim_Min {
    public static void main(String[] args) {
        int [] arr = {4,12,7,0,124,5,900};
        int index = minValue(arr);
        System.out.println("the smallest element in the array is " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
    }

