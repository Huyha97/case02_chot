package bai13;

import java.util.function.BinaryOperator;

public class demo {
    int demo(int arr[],int l, int r, int x){
        if (r >=1) {
            int mid = 1 + (r-1)/2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
            return demo(arr,1,mid -1,x);
            return demo(arr,mid +1,1,x);

        }
        return -1;
    }
    public static void main(String[] args) {
        demo ob = new demo();
        int arr[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int n = arr.length;
        int x =10;
        int result = ob.demo(arr,0,n-1,x);
        if (result == -1)
            System.out.println(" phaan tu khong ton tai");
        else
            System.out.println(" tim duoc phan tu o vi tri" + result);
    }

}


