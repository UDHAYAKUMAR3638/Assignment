import java.util.*;
class graphDFS{
    static Scanner sc=new Scanner(System.in);
    static HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
    static class node{
        int data;
        ArrayList<Integer>list;
        node(int data)
        {
            this.data=data;
            this.list=new ArrayList<>();
        }
    }

    public static void main(String args[])
    {
        link();
        System.out.print("Enter the source node for traversal:");
        bfs(sc.nextInt());

    }
    static void link()
    {
        System.out.println("Enter node element:");
        node root=new node(sc.nextInt());
        System.out.print("1.Enter Vertices or 2.End:");
        while(sc.nextInt()==1)
        {
        root.list.add(sc.nextInt());
        System.out.print("1.Enter Vertices or 2.End:");
        }
        map.put(root.data,root.list);
        System.out.print("1.Create new node or 2.End:");
        if(sc.nextInt()==1)
        link();
    }
    static void bfs(int val)
    {  HashMap<Integer,Integer>map1=new HashMap<>();
        Stack<Integer>q=new Stack<>();
        q.add(val);
        while(!q.isEmpty())
        {       Integer cur=q.pop();
                if(!map1.containsKey(cur))
                {
                  map1.put(cur,1);
                  System.out.print(cur+" ");
                  if(map.containsKey(cur))
                  { for(Integer i:map.get(cur))
                  q.push(i);
                  }
                } 
        }

    }

}