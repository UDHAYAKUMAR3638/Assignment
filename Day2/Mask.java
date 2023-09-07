//Using for loop
/*
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
*/
//Using Recursion

import java.util.*;
public class Maskrec {
static int star(int i,int val)
{   if(i==val)
    return 0;
    for(int j=0;j<=i;j++)
    System.out.print("*");
    for(int j=2*(val-i-1);j>0;j--)
    System.out.print(" ");
    for(int j=0;j<=i;j++)
    System.out.print("*");
    System.out.println("");
     star(++i,val); 
    return 0;
}
static int line(int i,int val)
{ if(i==val)return 0;
  for(int j=i;j<val;j++)
    System.out.print("_");
    for(int j=0;j<2*i;j++)
    System.out.print(" ");
     for(int j=i;j<val;j++)
    System.out.print("_");
    System.out.println("");
    line(++i,val);
    return 0;
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int val=s.nextInt();
star(0,val);
line(0,val);
}    
}

