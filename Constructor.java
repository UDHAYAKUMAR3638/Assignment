public class Constructor {
    float l,b;
    Constructor()
    {
         System.out.println("Constructor is Created");
    }
    Constructor(float a,float b)
    {
    this.l=a;
    this.b=b;
    }
    Constructor(Constructor obj)
    {
       this.l=obj.l;
       this.b=obj.b;
    }
    void display()
    {
        System.out.println("Area is:"+this.l*this.b);
    }
    
}
