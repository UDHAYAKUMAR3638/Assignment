import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.remove("F");
        for(Map.Entry<String,Integer> m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
