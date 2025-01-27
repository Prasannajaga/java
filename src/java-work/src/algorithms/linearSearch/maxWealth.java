package algorithms.linearSearch;

public class maxWealth {
    public static void main(String[] args) {

        int[][] arr = {
                {4,6,9} ,
                {90,85,55} ,
                {100,50,5}
        };

        int f = maxWealth(arr);
        System.out.println(f);

    }

    static int maxWealth(int[][] arr){
        int rich = 0;
        for(int[] i : arr){

            int d= 0;
            // iterating through every number in the array to calculate the value
            for(int a : i){
                d += a;
            }

            // checking if the calculate value is greater if so assigning it to max val
            if(d > rich){
                rich = d;
            }
        }

        return rich;
    }

}
