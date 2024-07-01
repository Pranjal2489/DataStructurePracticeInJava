package linkedlist.operations;

import java.sql.SQLOutput;

public class LinedListPractice {
    public static void main(String[] args) {

    }
    class Node{
        int val;
        Node next;
        Node(int data){
            this.val=data;
            this.next=null;
        }
    }

//    insertion at the end
    Node head;
    public  void insertAtEnd(int newData){
        if(head==null){
            head=new Node(newData);
        }
        Node newNode =new Node(newData);
        Node temp=head;
        while (temp.next != null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
//    insertion at beginning
    public void insertAtBeginning(int newdata){
        Node newNode =new Node (newdata);
        newNode.next=head;
        head=newNode;
    }

//    insertion at any position
    public void insertAtPos(Node prevNode,int data){
        if(prevNode==null){
            System.out.printf("cannot insert");
        }
        Node newNode=new Node(data);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }

// display Linked List
    public void display(){
        Node temp= head;
        while (temp.next !=null){
            System.out.printf(temp.val +" ");
            temp=temp.next;
        }
    }
//    deletion
    public  void delete(int pos){
        if(head==null) return;
        Node temp=head;
        if(pos==0) {
            head=temp.next;
        }
        for(int i=0; i<pos-1 && temp!=null ; i++){
            temp=temp.next;
        }
        if(temp==null && temp.next==null) return;
        temp.next=temp.next.next;
    }
//    iteratively reversing a ll
    public void reverseITLL(){
        Node curr=head;
        Node prev=null;
        Node nextPtr=null;
        while(curr !=null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;

        }
        head=prev;
    }

//    recursively reversing a ll
    public void reverseRELL(Node curr,Node prev){
//        base case
        if(curr.next==null) {
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=prev;

        reverseRELL(nextPtr,curr);
    }

    public void middleNode(){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null){
        slow=slow.next;
        fast=fast.next.next;
        }
        System.out.println(slow.val);

    }
//    cycle detection
    public boolean hasCycle(){
        boolean flag=false;
        Node slow=head;
        Node fast=head;
        while(slow != null && fast!= null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }

        }
        return flag;
    }

//    ass1 to check if num is present
    public void hasKey(Node head,int x){
        Node temp=head;
        int flag=0;
        while(temp != null){
            if(x==temp.val){
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if(flag==0) System.out.println("N");
        else System.out.println("Yes");

    }


}
