
interface calc{
    void add(int a,int b);
    void sub(int a,int b);
    void div(int a,int b);
    void mul(int a,int b);
    void add(float a,float b);
}
abstract class adding implements calc{
   public void add(int a,int b)
   {System.out.println("add:"+(a+b));}
   public void add(float a,float b)
   {System.out.println("add:"+(a+b));}  
   public void add(int a,float b)
   {System.out.println("add:"+(a+b));} 
   public void add(float a,int b)
   {System.out.println("add:"+(a+b));}    
   
}
abstract class subt extends adding{
    
    public void sub(int a,int b)
    {System.out.println("sub:"+ (a-b));}
    public void sub(float a,int b)
    {System.out.println("sub:"+ (a-b));}
    public void sub(double a,int b)
    {System.out.println("sub:"+ (a-b));}
    public void sub(int a,float b)
    {System.out.println("sub:"+ (a-b));}
 }
 abstract class mult extends subt{
   
    public void mul(int a,int b)
    {System.out.println("multiply:"+a*b);}
    
 }
 class divd extends mult{
    
    public void div(int a,int b)
    {System.out.println("division:"+(float)a/b);}
    
 }
public class Calculator1{
   public static void main(String[] args) {
       calc c=new Main();
       c.add(4f,8f); 
       c.add(4,8f);
       c.sub(13,8); 
       c.div(24,8); 
       c.mul(4,8); 
   }

}

