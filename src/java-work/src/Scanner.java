
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

public class Scanner {



    public static int add(int a , int b) throws ArithmeticException , ArrayIndexOutOfBoundsException {
        return a + b;
    }


    public static void main(String[] args) {

//        java.util.Scanner scan = new java.util.Scanner(System.in);
//
//        System.out.println("enter value 1 : ");
//        int a = scan.nextInt();
//        System.out.println("enter value 2 :");
//        int b = scan.nextInt();
//        System.out.println("expression +-*/");
//        String type = scan.next();
//
//        int result = 0;
//
//        if(type.equals("+")){
//            result = a + b;
//        }
//        else if(type.equals("-")){
//            result = a - b;
//        }
//        else if(type.equals("*")){
//            result = a * b;
//        }
//        else if(type.equals("/")){
//            result = a/b;
//        }
//
//        System.out.println("result :" + result);

        List<String> list = Arrays.asList("Prasanna" , "Krishna" , "Johnny" , "Kumar");

        String sorted = list.stream().filter(x -> x.length() > 5).map(v -> {
            return v.toUpperCase();
        }).collect(Collectors.joining(","));

        System.out.println("Result :" + sorted);
        int[] arr1 = {1,1,2,22};
        int[] arr2 = {2,23,0,0,0};

    }
}
