package bai13.baitap01;

public class BinarySearch {
    int binarySearch(int array[], int x, int low, int high){
        if (high >=low) {
            int mid = ( high - low) /2 + low;

            if (array[mid] == x)
                return  mid;
            if (array[mid] > x)
            return binarySearch(array,x,low, mid -1);
            return binarySearch(array,x,low, mid +1);

        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int array[] = {3,4,5,6,7,8,9};
        int n = array.length;
        int x= 4;
        int result = ob.binarySearch(array,x,0,n-1);
        if (result == -1)
            System.out.println(" not found");
        else
            System.out.println("element found ar index " + result);
    }
}
