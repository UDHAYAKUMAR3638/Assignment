import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(23);
        ts.add(40);
        ts.add(10);
        ts.add(25);
        ts.add(5);
        ts.remove(23);
        Iterator<Integer>itr=ts.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }
}
