import java.util.Scanner;

public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    Queue() {
        front = -1;
        rear = -1;
    }
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    void insert(int element) {
        if (isFull()) {
            System.out.println("\nThe queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("\nThe element " + element + " is inserted");
        }
    }
    int pop() {
        int element;
        if (isEmpty()) {
            System.out.println("\nThe queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println("\nThe element " +element + " is deleted");
            return (element);
        }
    }
    void print() {
        int i;
        if (isEmpty()) {
            System.out.println("The queue is empty ");
        }
        else {
            System.out.println("\nThe elements of the queue are: ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        Integer flag = 1;
        while (flag == 1) {
            System.out.println("Enter the number of the below option to do list operation");
            System.out.println("1. ADD A ELEMENT");
            System.out.println("2. VIEW QUEUE ELEMENTS");
            System.out.println("3. REMOVE A ELEMENT");
            System.out.println("4. ISEMPTY");
            System.out.println("5. ISFULL");
            System.out.println("6. EXIT");
            Integer opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the value to add");
                    q.insert(sc.nextInt());
                    break;
                case 2:
                    q.print();
                    break;
                case 3:
                    System.out.println("Removed ELement: "+q.pop());
                    break;
                case 4:
                   System.out.println(q.isEmpty());
                    break;
                case 5:
                    System.out.println(q.isFull());
                    break;
                case 6:
                    flag = 0;
                    break;
            }

        }
    }
}
