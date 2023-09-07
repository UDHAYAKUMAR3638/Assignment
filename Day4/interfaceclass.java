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
       Test.myInterface obj = new interfaceclass();
       obj.demo();
    }
 }