package linkedlist.operations;

import java.util.SortedMap;

public class LinkedListAssignment {
    public class Node{
        int data;
        Node next;

        public Node(int newData) {
            data=newData;
            next=null;
        }

    }
     Node head;
    Node header;
    private void insertAtEnd(int newData) {

        //case 1 : if ll is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        //case2: ll is not empty
        Node newNode = new Node(newData);
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }

    //implementation of insertion of node at beginning
    private void insertAtBegin(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;

    }

    private void insertAfter(Node prev_node,int newData){
        if (prev_node==null){
            System.out.println("Cannot be inserted");
            return;
        }
        Node newNode =new Node(newData);
        newNode.next=prev_node.next;
        prev_node.next=newNode;
    }
    private void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private  void keyPresent(int x){
        Node temp=head;
        int flag=0;
        while (temp!=null){
            if (x== temp.data){
                flag = 1;
                break;
            }
            temp=temp.next;
        }

        if (flag==0)
            System.out.println("Not present");
        else
            System.out.println("Yes");

    }
    public static void main(String[] args) {
        LinkedListAssignment list1=new LinkedListAssignment();
        list1.insertAtEnd(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(3);
        list1.insertAtEnd(1);
        list1.displayLL();
//        list1.insertAfter(list1.head.next,9);
//        list1.displayLL();

////        list1.keyPresent(9);
        LinkedListAssignment list2=new LinkedListAssignment();

        list2.displayLL();
        while (list1!=null){
            list2.header.data=list1.head.data;
            list1.head=list1.head.next;
            list2.header= list2.header.next;
        }
        reverseLL(list1);
        list1.displayLL();
        list2.displayLL();
//        compare(list1,list2);




    }

    private static void compare(LinkedListAssignment list1, LinkedListAssignment list2) {

        Node temp1= list1.head;
        Node temp2= list2.head;

        int flag=0;

        while (list2.head!=null&&list1.head!=null){
            temp1=temp1.next;
            temp2=temp2.next;
            if(list1.head.data!=list2.head.data){
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("Palindrome");
        }else
            System.out.println("not a palindrome");
    }

    private static void reverseLL(LinkedListAssignment list1) {
        Node curr= list1.head;
        Node prev=null;
        Node nextPtr=null;
        while (curr!=null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        list1.head=prev;

    }


}
