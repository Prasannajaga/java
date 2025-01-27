package algorithms.binarySearch;

public class binarySearch {

    // O(1) arrays has to sorted to perform binarySearch
    // as the input grows the complexity remains same
    // worst case scenario if the element is last index
    // more advanced than linear search
    // we start at the middle if our since it's sorted array we can check if the target is greater than middle element
    // then start searching from next index of the middle element if the target is lesser than middle element start element
    // remain the same we can minus the end = mid - 1
    static int findTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

             if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,9,10,14,20,40,60,70,90,100};

        int d = findTarget(arr, 90);
        System.out.println(d);

    }
}
