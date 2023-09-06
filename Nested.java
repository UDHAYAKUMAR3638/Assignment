interface Nested1{
    interface InsideNested{
      void display();
    }

}
class Run implements Nested1.InsideNested{
public void display(){
    System.out.println("Inside Nested interface");
}
}
public class Nested {
    public static void main(String[] args) {
        Nested1.InsideNested n=new Run();
        n.display();
    }
    
}
