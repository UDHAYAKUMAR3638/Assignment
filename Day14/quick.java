import java.util.*;
class quick{
    public static void main(String args[])
{
    System.out.print("Enter the array size:");
    Scanner sc=new Scanner(System.in);
    int val=sc.nextInt();
    Integer arr[]=new Integer[val];
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
    quicks(arr,0,arr.length-1);
    System.out.print("After Quick Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static void quicks(Integer arr[],Integer start,Integer end){
        Integer mid = (start+end)/2;
        Integer pivot = arr[mid]; 
        Integer b = start;
        Integer e = end;
        while (b<=e){
            while(arr[b]<pivot && b<=e){
                b++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(b<=e){
                Integer temp = arr[b];
                arr[b]=arr[e];
                arr[e]=temp;
                b++;
                e--;
            }
        }
        if(start<b-1){
            quicks(arr,start,b-1);
        }
        if(end>b){
            quicks(arr,b,end);
        }
    }
}