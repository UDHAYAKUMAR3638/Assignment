import java.util.Scanner;

public class CircularLinkedList {
    Node head, tail;

    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static void add(CircularLinkedList list, int data) {
        Node newnode = new Node(data);
        if (list.head == null) {
            list.head = newnode;
            list.tail = newnode;
        } else {
            list.tail.next = newnode;
            list.tail = newnode;
            list.tail.next = list.head;
        }
    }

    static void printList(CircularLinkedList list) {
        Node curr = list.head;
        while (curr.next != list.head) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print(curr.data + "\n");
    }

    static void insertList(CircularLinkedList list, int pos, int ele) {
        Node newnode = new Node(ele);
        if (pos == 1) {
            newnode.next = list.head;
            list.head = newnode;
        } else {
            Node curr = list.head;
            int cnt = 1;
            while (curr.next != list.head && cnt != pos) {
                curr = curr.next;
                cnt++;
            }
            Node after = curr.next;
            curr.next = newnode;
            newnode.next = after;
        }
    }

    static void removeList(CircularLinkedList list, int ele) {
        if (list.head.data == ele) {
            list.head = list.head.next;
            list.tail.next = list.head;
        } else {
            Node curr = list.head;
            Node prev = null;
            while (curr.next != list.head && curr.data != ele) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            while (prev.next != list.head) {
                prev = prev.next;
            }
            list.tail = prev;
        }
    }

    static int findList(CircularLinkedList list, int ele) {
        Node node = list.head;
        int cnt = 1;
        if (list.head.data == ele)
            return 1;
        else {
            node = node.next;
            cnt++;
            while (node != list.head) {
                if (node.data == ele)
                    return cnt;
                node = node.next;
                ++cnt;
            }
        }
        return cnt;
    }
    static void replaceElement(CircularLinkedList list,int val1,int val2)
    {
       Node firstnode=list.head;
       Node secondnode=list.head;
       Node prev1=null;
       Node prev2=null;
        while(firstnode.next!=list.head&&firstnode.data!=val1)
        {   prev1=firstnode;
            firstnode=firstnode.next;
        }
        while(secondnode.next!=list.head&&secondnode.data!=val2)
        {    prev2=secondnode;
            secondnode=secondnode.next;
        }
        if(firstnode.data==val1&&secondnode.data==val2) {
            Node temp = new Node(1);
            temp.next = firstnode.next;
            if (prev1 != null)
                prev1.next = secondnode;
            else
                list.tail.next=secondnode;
            prev2.next = firstnode;
            firstnode.next = secondnode.next;
            secondnode.next = temp.next;
            if (list.head.data == val1)
                list.head = secondnode;
        }
    }
    public static void reverseList(CircularLinkedList list) {
        Node prev = list.tail, curr, next, temp = list.head;
        curr = list.head;
        next = curr.next;
        while (curr != list.tail) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        list.tail = temp;
        list.head = curr;
    }


    public static void main(String args[]) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        Integer flag = 1;
        while (flag == 1) {
            System.out.println("Enter the number of the below option to do list operation");
            System.out.println("1. ADD A ELEMENT");
            System.out.println("2. VIEW LIST");
            System.out.println("3. REMOVE A ELEMENT");
            System.out.println("4. REVERSE LIST");
            System.out.println("5. FIND A ELEMENT");
            System.out.println("6. REPLACE TWO ELEMENTS");
            System.out.println("7. EXIT");
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
                    removeList(list, sc.nextInt());
                    break;
                case 4:
                    reverseList(list);
                    break;
                case 5:
                    System.out.println("Enter the value to be searched");
                    System.out.println(findList(list, sc.nextInt()));
                    break;
                case 6:
                    System.out.println("Enter the values to replaced");
                    replaceElement(list, sc.nextInt(),sc.nextInt());
                    break;
                case 7:
                    flag = 0;
                    break;
            }

        }

    }

}

