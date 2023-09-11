import java.util.*;
public class vector {
    public static void main(String args[])
    {
        Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        System.out.println("Vector: " + vec);
        vec.remove(4);
        for(int i=0;i<vec.size();i++)
        {
        System.out.println(vec.get(i)+" ");
        }
        
    }
}
