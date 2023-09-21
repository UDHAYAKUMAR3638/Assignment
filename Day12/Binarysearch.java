import java.util.*;
class Binarysearch{
    static ArrayList<Integer>arr=new ArrayList<>();
    public static void main(String args[]){
        System.out.print("Enter the no of elements:");
        Scanner sc=new Scanner(System.in);
        int cnt=sc.nextInt();
        System.out.println("Enter Elements:");
        while(cnt>0)
        {arr.add(sc.nextInt());
            cnt--;
        }
        System.out.print("Enter Element to be Searched:");
        int target=sc.nextInt();
        int ind=binarysearch(0,arr.size()-1,target);
        if(ind==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found At: "+ind);
    }

    static int binarysearch(int low,int high,int target)
    { 
        System.out.println("Low is At:"+low+" High is At:"+high);
        int mid=(high+low)/2;
        if(arr.get(mid)==target)
            return mid;
        if(low>high)
            return -1;
        if(arr.get(mid)>target)
            return binarysearch(low,mid-1,target);
        elsecd
            return binarysearch(mid+1,high,target);
    }
}