import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        st.pop();
        Iterator<Integer> itr=st.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }
}
