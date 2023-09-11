import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(10);
        set.add(12);
        set.add(14);
        set.add(16);
        set.add(18);
        set.add(20);
        set.remove(14);
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
}
