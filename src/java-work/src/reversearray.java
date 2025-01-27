import java.util.Arrays;
public class reversearray {


    public static void reverse(int[] arrs){

        int start = 0;
        int end = arrs.length - 1;

        while(start < end){
            swap(arrs , start , end);
            start++;
            end--;
        }

    }

    public static void swap(int[] arr , int start , int end){
        // swap the start with end and end with start
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args){

        int[] arr = {1,99,33,54,90,199, 1000 , 2001};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
