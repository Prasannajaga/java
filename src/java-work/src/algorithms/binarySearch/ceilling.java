package algorithms.binarySearch;

public class ceilling {

    // since it's sorted array
    public static int ceillings(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return arr[mid];
            }


        }


        return arr[start];
    }

    public static void main(String[] args) {

        int[] arr = {1,8,10,15,16,19,20};
        int f  = ceillings(arr , 11);
        System.out.println(f);


    }
}
