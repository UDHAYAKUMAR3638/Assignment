import java.util.Scanner;

public class DoublyLinkedList {
    static Node head, tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    static class Node {
        int data;
        Node prev, next;

        Node(int ele) {
            data = ele;
            prev = null;
            next = null;
        }
    }

    public static void add(DoublyLinkedList list, int ele) {
        Node newnode = new Node(ele);
        if (list.head == null) {
            list.head = newnode;
            list.tail = newnode;
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
            newnode.prev = curr;
            list.tail = newnode;
        }
    }

    public static void printList(DoublyLinkedList list) {
        Node curr = list.head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void reverselist(DoublyLinkedList list) {
        if (list.head != null && list.head.next != null) {
            Node curr = list.tail;
            list.head = curr;
            Node bef = null;
            while (curr != null) {
                curr.next = curr.prev;
                curr.prev = bef;
                bef = curr;
                curr = curr.next;
            }
            list.tail = bef;
        }
    }

    public static void deleteList(DoublyLinkedList list, int ele) {
        Node curr = list.head;
        if (curr.data == ele && curr == list.tail) {
            list.head = null;
            list.tail = null;
        } else if (curr.data == ele) {
            curr.next.prev = null;
            list.head = curr.next;
        } else if (list.tail.data == ele) {
            Node nlast = list.tail.prev;
            nlast.next = null;
            list.tail = nlast;
        } else {
            Node prev = null;
            while (curr != null && curr.data != ele) {
                prev = curr;
                curr = curr.next;
            }
            if (curr != null) {
                prev.next = curr.next;
                if (curr.next != null)
                    curr.next.prev = prev;
            }
        }

    }

    public static void insertAtEnd(int data) {
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void insertList(DoublyLinkedList list, int pos, int ele) {
        if (pos == 1) {
            Node newnode = new Node(ele);
            list.head.prev = newnode;
            newnode.next = list.head;
            list.head = newnode;
        } else {
            int cnt = 1;
            Node curr = list.head;
            while (curr != null && cnt != pos) {
                cnt++;
                curr = curr.next;
            }
            if (curr != null) {
                Node prev = curr.prev;
                Node newnode = new Node(ele);
                prev.next = newnode;
                newnode.prev = prev;
                newnode.next = curr;
                curr.prev = newnode;
            } else {
                System.out.println("Enter Valid Position");
            }
        }
    }
    static void replaceElementbyPos(DoublyLinkedList list,int pos1,int pos2)
    {
        Node firstnode=list.head;
        Node secondnode=list.head;
        while(firstnode!=null&&firstnode.data!=pos1)
        {
            firstnode=firstnode.next;
        }
        while(secondnode!=null&&secondnode.data!=pos2)
        {
            secondnode=secondnode.next;
        }
            Node temp = new Node(firstnode.data);
            temp.next = firstnode.next;
            temp.prev = firstnode.prev;
            firstnode.next = secondnode.next;
            firstnode.prev = secondnode.prev;
            secondnode.next = temp.next;
            secondnode.prev = temp.prev;
            if(firstnode.next!=null)
            firstnode.next.prev = firstnode;
            if(firstnode.prev!=null)
            firstnode.prev.next = firstnode;
            if(secondnode.prev!=null)
            secondnode.prev.next = secondnode;
            if(secondnode.next!=null)
            secondnode.next.prev = secondnode;
        if(pos1==list.head.data)
            list.head=secondnode;
    }
    static void replaceElement(DoublyLinkedList list,int val1,int val2)
    {
        Node firstnode=list.head;
        Node secondnode=list.head;
        int cnt=1;
        while(firstnode!=null&&cnt!=val1)
        {
            firstnode=firstnode.next;
            cnt++;
        }
        cnt=1;
        while(secondnode!=null&&cnt!=val2)
        {
            secondnode=secondnode.next;
            cnt++;
        }
        Node temp = new Node(firstnode.data);
        temp.next = firstnode.next;
        temp.prev = firstnode.prev;

        firstnode.next = secondnode.next;
        firstnode.prev = secondnode.prev;
        secondnode.next = temp.next;
        secondnode.prev = temp.prev;
        if(firstnode.next!=null)
            firstnode.next.prev = firstnode;
        if(firstnode.prev!=null)
            firstnode.prev.next = firstnode;
        if(secondnode.prev!=null)
            secondnode.prev.next = secondnode;
        if(secondnode.next!=null)
            secondnode.next.prev = secondnode;
        if(val1==1)
            list.head=secondnode;
    }

    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        Integer flag = 1;
        while (flag == 1) {
            System.out.println("Enter the number of the below option to do list operation");
            System.out.println("1. ADD A ELEMENT");
            System.out.println("2. VIEW LIST");
            System.out.println("3. REMOVE A ELEMENT");
            System.out.println("4. REVERSE LIST");
            System.out.println("5. INSERT A ELEMENT AT END");
            System.out.println("6. TO REPLACE TWO NODES USING POSITION");
            System.out.println("7. TO REPLACE TWO NODES USING ELEMENTS");
            System.out.println("8. EXIT");
            Integer opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Enter the value to add");
                    add(list, sc.nextInt());
                    break;
                case 2:
                    printList(list);
                    break;
                case 3:
                    System.out.println("Enter the value to remove");
                    deleteList(list, sc.nextInt());
                    break;
                case 4:
                    reverselist(list);
                    break;
                case 5:
                    System.out.println("Enter the value to be Inserted");
                    insertAtEnd(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Enter the positions to replaced");
                    replaceElementbyPos(list,sc.nextInt(),sc.nextInt());
                    break;
                case 7:
                    System.out.println("Enter the Elements to replaced");
                    replaceElementbyPos(list,sc.nextInt(),sc.nextInt());
                    break;
                case 8:
                    flag = 0;
                    break;
            }
        }
    }
}
