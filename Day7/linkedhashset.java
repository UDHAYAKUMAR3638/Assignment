import java.util.*;
public class linkedhashset {
   public static void main(String[] args) {
    LinkedHashSet<String>hset=new LinkedHashSet<>();
    hset.add("one");
    hset.add("three");
    hset.add("two");
    hset.add("four");
    hset.add("five");
    hset.add("two");
    hset.remove("four");
    Iterator<String>itr=hset.iterator();
    while(itr.hasNext())
    System.out.println(itr.next()+" ");

   } 
}
