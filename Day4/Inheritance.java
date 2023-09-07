class Shape
{
    int l,b,r;
    Shape()
    {
    }
    Shape(int l,int b,int r)
    {
        this.l=l;
        this.b=b;
        this.r=r;
    }
     void cirArea()
    {
        System.out.println("Circle:"+(3.14)*r*r);
    }
     void recArea()
    {
        System.out.println("Rec:"+l*b);   
    }
}
class Rec extends Shape
{
  Rec()
  {
    super(10,20,3);
  }
}
class Circle extends Shape{
    Circle()
    {
        super(1,2,3);
    }

}
class Inheritance {
    public static void main(String[] args) {
        Rec r=new Rec();
        r.recArea();
        Circle c=new Circle();
        c.cirArea();
    } 
}
