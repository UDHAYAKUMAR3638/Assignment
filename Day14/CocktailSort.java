import java.util.*;
class CocktailSort{
  
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
    System.out.print("Before Cocktail Sort:");
    for(int i:arr)
    System.out.print(i+" ");
    System.out.println();
    arr=cocktailsort(arr);
    System.out.print("After Cocktail Sort:");
    for(int i:arr)
    System.out.print(i+" ");
}
static int [] cocktailsort(int arr[])
{ boolean flag=true;
    int start=0;
    int end =arr.length-1;
    while(flag==true)
    {    
        for(int i=start;i<end;i++)
        {  
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                flag=true;
            }
            
        }
        if(!flag)
        break;
        end--;
        flag=false;
       for(int i=end;i>start;i--)
       {
          if(arr[i]<arr[i-1])
           {
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                flag=true;
            }
       }
       start++;
    }
    return arr;
}
}

