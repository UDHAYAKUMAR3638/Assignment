
import java.util.ArrayList;


public class treeDFS {
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        Tree t1=new Tree(1);
        treeDFS p=new treeDFS();
        p.addnode(t1,2);
        p.addnode(t1,3);
        p.addnode(t1,4);
        p.addnode(t1,5);
        p.addnode(t1,6);
        p.addnode(t1,7);

        arr=p.inorderTrav(t1,new ArrayList<Integer>());
        System.out.print("Inorder: ");
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i) +" ");
        System.out.println();

        arr=p.preorderTrav(t1,new ArrayList<Integer>());
        System.out.print("preorder: ");
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i) +" ");
        System.out.println();
        
        arr=p.postorderTrav(t1,new ArrayList<Integer>());
        System.out.print("postorder: ");
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i) +" ");

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
    void addnode(Tree root,Tree node)
    {    
        if(root==null)
        return;
        if(node.data>root.data)
        {addnode(root.right,node);
        root.right=node;}
        else
        {
        addnode(root.left,node);
        root.left=node;}
    }
    ArrayList<Integer> preorderTrav(Tree root,ArrayList<Integer> arr)
    {
        if(root==null)
            return arr;
        arr.add(root.data);
        preorderTrav(root.left,arr);
        preorderTrav(root.right,arr);
        return arr;
    }
    ArrayList<Integer> inorderTrav(Tree root,ArrayList<Integer> arr)
    {
        if(root==null)
            return arr;
        inorderTrav(root.left,arr);
        arr.add(root.data);
        inorderTrav(root.right,arr);
        return arr;
    }
    ArrayList<Integer> postorderTrav(Tree root,ArrayList<Integer> arr)
    {
        if(root==null)
            return arr;
        postorderTrav(root.left,arr);
        postorderTrav(root.right,arr);
        arr.add(root.data);
        return arr;
    }
}
