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
        public static void printlist(LinkedListClass list)
        {      Node node=list.head;
            while(node!=null)
            {
                System.out.print(node.data+" ");
                node=node.next;
            }
        }
       public static int findlist(LinkedListClass list,int ele)
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
       public static void deletelist(LinkedListClass list,int ele)
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
       public static void insertlist(LinkedListClass list,int pos,int ele)
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
       public static void replacelist(LinkedListClass list,int ele,int rep)
       {   Node curr=list.head;
           while(curr!=null&&curr.data!=ele)
           {
               curr=curr.next;
           }
           if(curr.data==ele)
               curr.data=rep;
       }
       public static void reverselist(LinkedListClass list)
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
            LinkedListClass list=new LinkedListClass();
            add(list,1);
            add(list,2);
            add(list,4);
            add(list,5);
            add(list,6);
            add(list,7);
            printlist(list);
            System.out.println();
//            deletelist(list,5);
//            printlist(list);
//            System.out.println();
//            System.out.println(findlist(list,5));
//            replacelist(list,4,10);
//             insertlist(list,7,3);
            reverselist(list);
             printlist(list);

        }
}
