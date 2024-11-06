package Task9.Problem3;

import java.util.Arrays;

public class SwapArray {
    public static <T> void swap(T[] arr, int index1, int index2){
        T temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr={1,2,3};
        String[] strArr={"hi","hello","welcome"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1,2);
        swap(strArr, 0,1);

    }
}
