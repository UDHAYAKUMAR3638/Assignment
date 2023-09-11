import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String>h=new Hashtable<>();
        h.put(1,"one");
        h.put(2,"two");
        h.put(3,"three");
        h.put(4,"four");
        h.put(5,"five");
        h.remove(3);
        for(Map.Entry<Integer,String> m:h.entrySet())
        {
         System.out.println(m.getKey()+":"+m.getValue());
        }
    }
}
