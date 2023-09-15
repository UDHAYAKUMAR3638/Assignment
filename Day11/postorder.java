import java.util.ArrayList;

public class postorder {
    public static void main(String args[])
    {
        ArrayList<Integer>arr=new ArrayList<>();
        Tree t1=new Tree(1);
        Tree t2=new Tree(2);
        Tree t3=new Tree(3);
        t1.left=t2;
        t1.right=t3;
        Tree t4=new Tree(4);
        Tree t5=new Tree(5);
        Tree t6=new Tree(6);
        Tree t7=new Tree(7);
        t2.left=t4;
        t2.right=t5;
        t3.left=t6;
        t3.right=t7;
        postorder p=new postorder();
        arr=p.postorderTrav(t1,new ArrayList<Integer>());
        System.out.print("postorder: ");
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i) +" ");
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
