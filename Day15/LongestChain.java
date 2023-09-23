// import java.util.*;
// class LongestChain
// {static long tcnt=0;
//     public static void main(String args[])
//     {   Integer max=0;
//         long i;
//         for( i=1;i<1000000;i++)
//         { max=Math.max(max,chain(i));
//         }
//         System.out.println("ChainCnt:"+max+" Iteration:"+tcnt);
//     }
//     static Integer chain(long x)
//     {  Integer cnt=1;
//         long val=x;
//         while(val!=1)
//         {   tcnt++;
//             if(val%2==0)
//             val=val/2;
//             else
//             val=3*val+1;
//             cnt++;
//         }
//         return cnt;
//     }
// }


// Using Map to Optimize
import java.util.*;
class LongestChain
{static long tcnt=0;
static HashMap<Long,Integer>map=new HashMap<>();
    public static void main(String args[])
    {   Integer max=0;
        long i;
        for( i=1;i<1000000;i++)
        {max=Math.max(max,chain(i));
        }
        System.out.println("Longest Chain Value:"+max+" Iteration:"+tcnt);
    }
    static Integer chain(long x)
    {  Integer cnt=1;
        long val=x;
        while(val!=1)
        {   tcnt++;
            if(val%2==0)
            val=val/2;
            else
            val=3*val+1;
            if(map.containsKey(val))
            { map.put(x,cnt+map.get(val));
            return map.get(x);
            }
            cnt++;
        }
        map.put(x,cnt);
        return cnt;
    }
}