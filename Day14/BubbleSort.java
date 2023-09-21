import java.util.*;
class BubbleSort{
  
public static void main(String args[])
{
    System.out.print("Enter the array size:");
    Scanner sc=new Scanner(System.in);
    int val=sc.nextInt();
    int arr[]=new int[val];
    int v=0;
    System.out.println("Enter Elements:");
    while(val>0)
    {
        arr[v++]=sc.nextInt();
        val--;
    }
    System.out.print("Before Bubble Sort:");
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
    
    arr=BubbleSort(arr);
    System.out.print("After Bubble Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static int [] BubbleSort(int arr[])
{ boolean flag=false;
    for(int i=0;i<arr.length;i++)
    {   flag=false;
        for(int j=0;j<arr.length-i-1;j++)
        {  
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(!flag)
        break;
    }
    return arr;
}

}