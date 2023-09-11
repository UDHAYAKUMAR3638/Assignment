import java.util.*;
public class Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer>q=new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Iterator<Integer> itr=q.iterator();
        while(itr.hasNext())
        {System.out.println(itr.next());}
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q.poll());
        while(itr.hasNext())
        {System.out.println(itr.next()+" ");}

    }
}
