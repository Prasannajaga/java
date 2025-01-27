package algorithms;

public class linearSearch {

    // O(n) complexity
    // as the input grows the iteration grows so does the complexity
    // it'll iterate through each element in array until it finds the target
    // as it iterates through every element to find my min value O(n)


    public static int linearSearch(int[] arr , int target){
        // if it's 0 return -1
        if(arr.length == 0){
            return -1;
        }

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target) return arr[i];  // using legacy for loop
        }


//        int i = 0;
//        for(int a : arr){
//            if(a == target) return a;  // using foreach
//            i++;
//        }

        // if it's not found return -1
        return -1;
    }

    // as it iterates through every element to find my max value O(n)
    public static int min(int[] arr){
        if(arr.length == 0) return 0;
        int min = arr[0];
        for(int i =1;i < arr.length;i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        if(arr.length == 0) return 0;
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,77,990,2001,7624,3901,-9};
        int f = linearSearch(arr , 2001);
        int min  = min(arr) , maxV = max(arr);
        System.out.println(min + " " + maxV);

    }
}
