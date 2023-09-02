
import java.math.BigInteger;
import java.lang.*;
import java.util.*;
class Main
{   
    public static void main(String[] args) {
     //System.out.println(cnt);
     BigInteger a=BigInteger.ZERO;
     BigInteger b=BigInteger.ONE;
     Scanner s= new Scanner(System.in);
     while(args[0]!="n")
     { 
      fib(a,b,Integer.parseInt(args[0]));
       args[0]=s.next();
     }
}
static int fib( BigInteger prev,BigInteger curr,int cnt)
{  
    if(cnt!=0){
    System.out.print(prev+" ");
     BigInteger z=curr.add(prev);
     prev=curr;
     curr=z;
     fib(prev,curr,--cnt);
    }
  return 0;
    }
}
