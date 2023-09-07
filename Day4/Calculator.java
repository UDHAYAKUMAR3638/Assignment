/*we can add any no of new methods in interface implemented class but can't add any other new method 
in abstract class only interface holding methods can be defined*/
interface calc{
     void add(int a,int b);
     void add(float a,float b);
     void sub(int a,int b);
     void div(int a,int b);
     void mul(int a,int b);
}
class Main implements calc{
    public void add(int a,int b)
    {System.out.println("add:"+(a+b));}
    public void add(float a,float b)
    {System.out.println("add:"+(a+b));}   
    public void sub(int a,int b)
    {System.out.println("sub:"+ (a-b));}
    public void div(int a,int b)
    {System.out.println("division:"+(float)a/b);}
    public void mul(int a,int b)
    {System.out.println("multiply:"+a*b);}
    
}
public class Calculator{
    public static void main(String[] args) {
        calc c=new Main();
        c.add(4f,8f); 
        c.sub(13,8); 
        c.div(24,8); 
        c.mul(4,8); 
    }

}

