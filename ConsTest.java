public class ConsTest {
    public static void main(String[] args) {
        Constructor c1=new Constructor();
        Constructor c2=new Constructor(6f,8f);
        Constructor c3=new Constructor(c2);
        c1.display();
        c2.display();
        c3.b=10f;
        c3.display();
    }
}
