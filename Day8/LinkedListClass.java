import java.util.Scanner;

public class LinkedListClass {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
        public static void add(LinkedListClass list,int data)
        {
           Node newnode=new Node(data);
           if(list.head==null)
               list.head=newnode;
           else {
                  Node last=list.head;
                  while(last.next!=null)
                      last=last.next;
                  last.next=newnode;
           }
          //return list;
        }
        public static void printList(LinkedListClass list)
        {      Node node=list.head;
            while(node!=null)
            {
                System.out.print(node.data+" ");
                node=node.next;
            }
            System.out.println();
        }
       public static int findList(LinkedListClass list,int ele)
       {
           Node curr=list.head;
           int cnt=1;
           while(curr!=null&&curr.data!=ele)
           { curr=curr.next;cnt++;
           }
           if(curr!=null && curr.data==ele)
               return cnt;
           return -1;
       }
       public static void deleteList(LinkedListClass list,int ele)
       {
          Node currNode=list.head,prev=null;
          if(currNode!=null && currNode.data==ele)
          {
              list.head=currNode.next;
          }
          else {
                  while(currNode!=null && currNode.data!=ele)
                  {
                      prev=currNode;
                      currNode=currNode.next;
                  }
                  prev.next=currNode.next;
          }
       }
       public static void insertList(LinkedListClass list,int pos,int ele)
       {
           Node curr=list.head,prev=null;
           int cnt=1;
           while(curr!=null&&cnt!=pos)
           {
               prev=curr;
               curr=curr.next;
               cnt++;
           }
           Node newnode=new Node(ele);
           if(cnt==pos)
           {
              if(prev!=null)
                  prev.next=newnode;
              else
                  list.head=newnode;
               newnode.next=curr;
           }
           else {
               curr.next=newnode;
           }


       }
       public static void replaceList(LinkedListClass list,int ele,int rep)
       {   Node curr=list.head;
           while(curr!=null&&curr.data!=ele)
           {
               curr=curr.next;
           }
           if(curr.data==ele)
               curr.data=rep;
       }
       public static void reverseList(LinkedListClass list)
       {
           Node prev=null,curr=list.head;
           Node Next;
           if(curr!=null&& curr.next!=null) {
               Next = curr.next;
               while(curr!=null)
               {
                   curr.next=prev;
                   prev=curr;
                   curr=Next;
                   if(Next!=null)
                   Next=Next.next;
               }
               list.head=prev;
           }
       }
        public static void main(String args [])
        {
            LinkedListClass list = new LinkedListClass();
            Scanner sc = new Scanner(System.in);
            Integer flag = 1;
            while (flag == 1) {
                System.out.println("Enter the number of the below option to do list operation");
                System.out.println("1. ADD A ELEMENT");
                System.out.println("2. VIEW LIST");
                System.out.println("3. REMOVE A ELEMENT");
                System.out.println("4. REVERSE LIST");
                System.out.println("5. FIND A ELEMENT");
                System.out.println("6. TO INSERT ELEMENT");
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
                        deleteList(list, sc.nextInt());
                        break;
                    case 4:
                        reverseList(list);
                        break;
                    case 5:
                        System.out.println("Enter the value to be searched");
                        System.out.println(findList(list, sc.nextInt()));
                        break;
                    case 6:System.out.println("Enter Position and element to be inserted:");
                    insertList(list,sc.nextInt(),sc.nextInt());break;
                    case 7:
                        flag = 0;
                        break;
                }

            }


        }
}
