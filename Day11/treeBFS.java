import java.util.*;
public class treeBFS {
    public static void main(String args[])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        Tree t1=new Tree(10);
        treeBFS t=new treeBFS();
        t.addnode(t1,11);
        t.addnode(t1,14);
        t.addnode(t1,9);
        t.addnode(t1,8);
        t.addnode(t1,20);
        t.addnode(t1,2);
        t.addnode(t1,16);
       arr=t.bfs(t1,new ArrayList<>());
       System.out.print("BFS: ");
       for(int i=0;i<arr.size();i++)
           System.out.print(arr.get(i)+" ");
    }
    int addnode(Tree root,int val)
    {    
        if(root==null)
        return 0;
        if(val>root.data)
        {if(addnode(root.right,val)==0)
         root.right=new Tree(val);
         }
        else
        {
        if(addnode(root.left,val)==0)
        root.left=new Tree(val);
        }
        return 1;
    }
    ArrayList<Integer> bfs(Tree root,ArrayList<Integer> arr)
    {  Queue<Tree>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Tree temp=q.poll();
            arr.add(temp.data);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        return arr;
    }
}
