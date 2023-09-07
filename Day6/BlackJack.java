import java.util.HashMap;
import java.util.*;

public class BlackJack {
     static int player=0;
     static int dealer=0;
     static boolean curr=true;
     static String str;
     static boolean stayval=true;
     static HashMap<Integer, Integer>map=new HashMap<>(){{
        put(2,4);
        put(3,4);
        put(4,4);
        put(5,4);
        put(6,4);
        put(7,4);
        put(8,4);
        put(9,4);
        put(10,4);
        put(11,4);

    }};
    public static void main(String[] args) {
    System.out.println("Welcome to BlackJack Program");
     int i1=ranGen();
     int i2=ranGen();
     System.out.println("You get a "+i1+" and a "+i2);
     player+=i1+i2;
     dealer+=ranGen();
     System.out.println("The dealer has a "+dealer+" showing , and a hidden card.\nHis total is hidden, too.");
      choose();
}
static int ranGen()
{
     int val=(int)Math.floor((Math.random()*(11-2+1)+2));
     if(map.get(val)>0)
     { map.put(val,map.get(val)-1);
     return val;
     }
     else
     { 
        while(map.get(val)==0)
        {val=(int)Math.floor((Math.random()*(11-2+1)+2));
        }
        map.put(val,map.get(val)-1);
     }
   return val;
}
static void choose()
{   
    if(curr){
    Scanner s=new Scanner(System.in);
    System.out.println("Would you like to \"hit\" or \"stay\"?");
    str=s.nextLine();
    }
    else{
        if((int)Math.floor((Math.random()*(5-2+1)+2))>2)
        str="hit";
        else
        str="stay";
    }
    if(str.equals("hit"))
    {   if(curr)
        playhit();
        else
        dealerhit();
    }
    if(str.equals("stay"))
    {  if(stayval&&curr)
        {curr=false;
        stayval=false;
        stay();
        }
        else if(curr)
        {curr=false;
        comp();
         choose();
        }
        else
        {   System.out.println("Dealer stays");
            curr=true;
            comp();
            choose();
        }
    }
}
   
static void playhit()
{  int val=ranGen();
   System.out.println("You drew a "+val);
   player+=val;
   playert();
   comp();
   choose();
}
static void dealerhit()
{  int val=ranGen();
  System.out.println("He drews a "+val);
 dealer+=val;
  dealert();
  comp();
  choose();
}
static void stay()
{ int val=ranGen();
  System.out.println("Okay dealer's turn ");
  System.out.println("His hidden card was a "+val);
  dealer+=val;
  dealert();
  stayval=false;
  comp();
  choose();
}

static void playert()
{ System.out.println("Your total is "+player);
}
static void dealert()
{ System.out.println("His total is "+dealer);
}
static void comp()
{
    if(player>21)
   { System.out.println("DEALER WIN!");
    System.exit(0);
   }
    else if(dealer>16)
    {System.out.println("YOU WIN!");
    System.exit(0);
     }
}

}
