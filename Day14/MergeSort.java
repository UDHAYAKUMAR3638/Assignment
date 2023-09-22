import java.util.*;
class MergeSort{
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
   int s1=m-s+1;
   int s2=e-m;
   int arr1[]=new int[s1];
   int arr2[]=new int[s2];
   for(int i=0;i<s1;i++)
   arr1[i]=arr[s+i];
   for(int i=0;i<s2;i++)
   arr2[i]=arr[m+1+i];
   int i=0;
   int j=0;
   int k=s;
   while(i<s1&&j<s2)
   {
    if(arr1[i]<=arr2[j])
    {
     arr[k++]=arr1[i++];
    }
    else 
    {
    arr[k++]=arr2[j++];
    }
   }
   while(i<s1)
   {
    arr[k++]=arr1[i++];
   }
   while(j<s2)
   {
    arr[k++]=arr2[j++];
   }

}
}