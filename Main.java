
import java.math.BigInteger;
import java.util.*;
class Main
{   
    public static void main(String[] args) {
     int cnt=Integer.parseInt(args[0]);
     //System.out.println(cnt);
     BigInteger a=BigInteger.ZERO;
     BigInteger b=BigInteger.ONE;
    fib( a,b,cnt);
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