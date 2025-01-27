public class scope {

    public static void main(String[] args){

        int a = 10;

        {
            a = 0;
            int c = 100;
            System.out.println(c);
        }

        System.out.println(a);
//      System.out.println(c); cannot be accessed outside only available inside the block we created
//      System.out.println(marks); // cannot be accessed outside
    }


    static void callme(int marks){
        System.out.println(marks); // only be accessed inside this method and this is method scope.
    }


}
