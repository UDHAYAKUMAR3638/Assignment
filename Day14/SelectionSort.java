import java.util.*;
class SelectionSort{
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
    System.out.print("Before Selection Sort:");
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
    arr=selectionSort(arr);
    System.out.print("After Selection Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static int [] selectionSort(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    return arr;
}
}