
import java.util.*;

public class Linkedlist {
	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
        for (int i = 0; i < ll.size(); i++) { 
    
            System.out.print(ll.get(i) + " "); 
        } 
        System.out.println();
		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
	}
}
