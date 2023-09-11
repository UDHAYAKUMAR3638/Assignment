import java.util.*;
public class Arraydeque {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        dq.offer("ramesh");
        dq.add("suresh");
        dq.offerFirst("babu");
        dq.add("vignesh");
        Iterator<String>itr=dq.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        //dq.poll();
        dq.pollLast();
        System.out.println();
        for(String s:dq)
        System.out.print(s+" "); 
    }
}
