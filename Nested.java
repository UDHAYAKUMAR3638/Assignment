//Nested interface
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

//class inside interface

interface Nested1{
        class A
        {
        void m1(){
        System.out.println("inside m1");
        }
        void m2(){
        System.out.println("inside m2");
        }
        }
}

public class nestclass{
public static void main(String args[])
{
Nested1.A ia = new Nested1.A();
ia.m1();
ia.m2();
}
}

//interface inside class
 class Test {
    interface myInterface {
       void demo();
    }
 }
 public class interfaceclass implements Test.myInterface {
    public void demo() {
       System.out.println("interface implemented");
    }
    public static void main(String args[]) {
       interfaceclass obj = new interfaceclass();
       obj.demo();
    }
 }
