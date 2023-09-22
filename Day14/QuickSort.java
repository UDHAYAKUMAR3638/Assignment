import java.util.*;
class QuickSort{
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
    System.out.print("Before Quick Sort:");
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
    quicksort(arr,0,arr.length-1);
    System.out.print("After Quick Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static void quicksort(int arr[],int left,int right)
{ 
int front=left;
int back=right;
int pivot=(right+left)/2;
while(front<=back)
{
    while(arr[front]<arr[pivot]&&front<=right)
    front++;
    while(arr[back]>arr[pivot]&&back>0)
    back--;
    if(front<=back)
    {
        int temp=arr[front];
        arr[front]=arr[back];
        arr[back]=temp;
        front++;back--;
    }
}
if(left<front-1)
quicksort(arr,left,front-1);
if(front<right)
quicksort(arr,front,right);
}
}