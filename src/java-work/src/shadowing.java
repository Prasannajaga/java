public class shadowing {

    static int a = 100;

    public static void main(String[] args){

        System.out.println(a);

        int a = 2001; // when it's accessed from here the above will be shadowed and this is known as shadowing

        System.out.println(a);

        String name = "jagadesh";
        System.out.println(name);
        change(name);
        System.out.println(name);
    }

    public static void change (String name) {
        name = "prasanna";
    }
}
