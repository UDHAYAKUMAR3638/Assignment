import java.util.Scanner;

public class Stack {

    static final int max=1000;
    int top;
int stack[]=new int[1000];
boolean isEmpty()
{
    return (top<0);
}
Stack()
{
    top=-1;
}
boolean push(int val)
{
    if(top>=(max-1))
    {
        System.out.println("Stack over flow");
        return false;
    }
    else {
        stack[++top]=val;
        System.out.println(val+" is pushed");
        return true;
    }
}
int pop()
{   if(top<0)
    {System.out.println("Under flow");
    return 0;
    }
    else{
    int val=stack[top--];
    return val;
    }
}
int peek()
{
    if(top<0)
    {
        System.out.println("Stack Underflow");
        return 0;
    }
    else{
        return stack[top];
    }
}
void print()
{
    for(int i=top;i>=0;i--)
        System.out.print(stack[i]+" ");
    System.out.println();
}
}
class Main
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        Integer flag = 1;
        while (flag == 1) {
            System.out.println("Enter the number of the below option to do list operation");
            System.out.println("1. ADD A ELEMENT");
            System.out.println("2. VIEW LIST");
            System.out.println("3. REMOVE TOP ELEMENT");
            System.out.println("4. TOP ELEMENT IN THE STACK");
            System.out.println("5. CHECK STACK IS EMPTY OR NOT");
            System.out.println("6. EXIT");
            Integer opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the value to add");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    s.print();
                    break;
                case 3:
                    System.out.println(s.pop());

                    break;
                case 4:
                    System.out.println(s.peek());
                    break;
                case 5:
                    System.out.println(s.isEmpty());
                    break;
                case 6:
                    flag = 0;
                    break;
            }

        }
    }
}
