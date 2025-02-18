import java.util.Set;
import java.util.*;

public class collections {


    static  void MapExample(){
        Map<Integer , Object> map = new HashMap<Integer ,Object>();

        map.put(1 , "prasanna");
        map.put(3 , "jaagdesh");

        System.out.println(map.get(1));


        System.out.println(map);

    }

    static void ListExample(){
        LinkedList<String> list = new LinkedList<String>();

        list.addLast("kumar");
        list.add("Prasanna");
        list.add("jaagdesh");
        list.addFirst("Nirmala");

//        list.stream().reduce(x -> {
//            return x;
//        });

        System.out.println(list.get(3));
    }

    static void SetExample(){

        Set<String> set = new HashSet<String>();

        set.add("Prasanna");
        set.add("jagadesh");
        set.add("nirmala");
        set.add("kamal");
        set.add("kamal");

//        set.stream().

//        set.removeIf(x -> x.length() > 5);

        System.out.println(set.contains("kamal"));

    }

    public static void main(String[] args) {
        MapExample();

    }


}
