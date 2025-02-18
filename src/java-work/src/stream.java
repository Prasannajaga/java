import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class stream {

    public static void main(String[] args) {

        List<Employees> employees = new ArrayList<Employees>();

        Map<String , Employees>  map =  employees.stream().filter(x -> x.department.equalIgnoreCase("IT")).
                              sort(getAge::Employees).collect(Collectors.toMap((x , v) ->{
                                    Map<String, Employees> mapDataa = new HashMap<>();
                                    mapDataa.put(x.getId() , x);
                                    return  mapDataa;
                              }));

    }
}




class Depratment {

}



final class Employees{

    private String id;
    private String name;

    @OnetToMany()
    private Department department;


    Employees(){
    }

}
