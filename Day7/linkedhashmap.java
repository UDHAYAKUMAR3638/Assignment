import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
   public static void main(String[] args) {
    
   LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
    map.put(1,2);
    map.put(2,4);
    map.put(5,10);
    map.put(9,18);
    map.put(6,12);
    map.put(6,30);
    System.out.println(map);
    System.out.println(map.size());
    System.out.println(map.get(5));
    System.out.println(map.containsKey(2));
    System.out.println(map.containsValue(8));
    map.remove(9);
    System.out.println(map.containsKey(9));
    for(Map.Entry<Integer,Integer> m:map.entrySet())
    {
        System.out.println(m.getKey()+" : "+m.getValue());
    }
    
}

}
