class Excep extends Exception {
    public Excep(String message) {
        super(message);
        System.out.println("custom expection");
    }
}

class exp {
    public void demo() throws Exception
    {
        try{
            int val=10;
            val=val/0;
        }
        catch(ArithmeticException e)
        {  // System.out.println("execption handled in interface");
           try {
            throw new Excep("AE thrown");
           }
        catch(Excep e1){
            System.out.println("Called");
        }
    }
    }
} 
public class tryclass {
    public static void main(String[] args) {
        exp e=new exp();
        try{
            e.demo();
        }catch(Exception i)
        {
            System.out.println("inside main catch");
        }
        System.out.println("Hello");

    }
}
