import java.util.*;
class MergeSortSpace{
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
    System.out.print("Before Merge Sort:");
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
    sort(arr,0,arr.length-1);
    System.out.print("After Merge Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static void sort(int arr[],int s,int e)
{    if(s<e)
   { int m=(e+s)/2;
     sort(arr,s,m);
     sort(arr,m+1,e);
    mergesort(arr,s,m,e);
   }
}
static void mergesort(int arr[],int s,int m,int e)
{
    Integer temp;
    if(s==(e-1)){
        if(arr[s]>arr[e]){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
    }
    int midstart=m+1;
    while(s<midstart&&midstart<=e)
    {
        if(arr[s]>arr[midstart])
        {
            temp=arr[midstart];
            for(int j=midstart;j>s;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[s]=temp;
            s++;
            midstart++;
        }
        else
        s++;
    }
}

}
