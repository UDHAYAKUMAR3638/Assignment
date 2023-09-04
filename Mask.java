import java.util.*;
public class Mask {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int val=s.nextInt();
for(int i=0;i<val;i++)
{   for(int j=0;j<=i;j++)
    System.out.print("*");
    for(int j=2*(val-i-1);j>0;j--)
    System.out.print(" ");
    for(int j=0;j<=i;j++)
   System.out.print("*");
    System.out.println("");
}
for(int i=val;i>0;i--)
{   for(int j=0;j<i;j++)
    System.out.print("_");
    for(int j=0;j<2*(val-i);j++)
    System.out.print(" ");
     for(int j=0;j<i;j++)
    System.out.print("_");
    System.out.println("");
}
}    
}
