package linkedlist.operations;

public class LinkedList {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        System.out.println("Linked List before Insertion of 10");
        list.displayLL();
        list.insertAtEnd(10);
        System.out.println("Linked List after Insertion of 10");
        list.displayLL();
        list.insertAtBegin(1);
        System.out.println("Linked List after Insertion of 1 at beginning");
        list.displayLL();
        list.insertAfter(list.head.nextAddr.nextAddr, 13);
        System.out.println("LinkedList after insertion of 13 in between");
        list.displayLL();
        list.deleteNode(0);
        System.out.println("LinkedList after deletion");
        list.displayLL();
        list.reverseIteratively();
        System.out.println("LinkedList after iterative reversal");
        list.displayLL();
        list.reverseRecursively(list.head, null);
        System.out.println("LinkedList after recursive reversal");
        list.displayLL();

        list.middleNode();
        list.insertAtEnd(19);
        list.displayLL();
        list.middleNode();

        list.detectLoop();


        //Circular loop creation
        Node temp= list.head;
        while (temp.nextAddr!= null){
            temp=temp.nextAddr;
        }temp.nextAddr= list.head;
        //detection of circular loop
        list.detectLoop();
    }



    private static class Node {
        int data;
        Node nextAddr;

        Node(int d) {
            data = d;
            nextAddr = null;
        }
    }
    //Declaration of head which points to first node

    Node head;

    //implementation of insertion of node at ending
    private void insertAtEnd(int newData) {

        //case 1 : if ll is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        //case2: ll is not empty
        Node newNode = new Node(newData);
        newNode.nextAddr = null;
        Node temp = head;
        while (temp.nextAddr != null) {
            temp = temp.nextAddr;

        }
        temp.nextAddr = newNode;

    }

    //implementation of insertion of node at beginning
    private void insertAtBegin(int newData) {
        Node newNode = new Node(newData);
        newNode.nextAddr = head;
        head = newNode;

    }

    //implementation of insertion of node at any Point
    private void insertAfter(Node prev_node, int newData) {
        if (prev_node == null) {
            System.out.println(" the node cannot be inserted as this position does not exist");
            return;
        }
        Node newNode = new Node(newData);
        newNode.nextAddr = prev_node.nextAddr;
        prev_node.nextAddr = newNode;
    }

    //implementation of deletion of node at any Point
    private void deleteNode(int position) {
        //if linked list is empty
        if (head == null) {
            return;
        }


        //otherwise
        Node temp = head;

        //deletion at beginning
        if (position == 0) {
            head = temp.nextAddr;
            return;
        }

        //deletion at any position
        for (int i = 0; i < position-1  && temp != null; i++) {
            temp = temp.nextAddr;
        }

        if (temp == null && temp.nextAddr == null) {
            return;
        }

        temp.nextAddr = temp.nextAddr.nextAddr;
    }

    //implementation of iteratively reversing of node at any Point
    private void reverseIteratively() {
        Node curr=head;
        Node nextPtr=null;
        Node prev=null;
        while (curr!=null){
            nextPtr=curr.nextAddr;
            curr.nextAddr=prev;
            prev=curr;
            curr=nextPtr;
        }
        head=prev;
    }

    //implementation of recursively reversing of node at any Point
    public void reverseRecursively(Node curr,Node prev){
        //Base Case Condition
        if (curr.nextAddr==null){
            head=curr;
            curr.nextAddr=prev;
            return;
        }


        Node nextPtr=curr.nextAddr;
        curr.nextAddr=prev;

        //Recursive function call
        reverseRecursively(nextPtr,curr);

    }

    //implementation of finding middle of node in the Linked List
    private void middleNode() {
        Node slow =head;
        Node fast =head;
        while (fast!=null && fast.nextAddr != null){
            slow = slow.nextAddr;
            fast = fast.nextAddr.nextAddr;

        }
        System.out.println("the middle node is "+ slow.data);

    }

    //implementation of detecting a loop in a linked List
    private  void detectLoop(){
        Node slow=head;
        Node fast =head;

        int flag=0;
        while (slow!=null && fast!= null && fast.nextAddr!=null){
            slow=slow.nextAddr;
            fast=fast.nextAddr.nextAddr;

            if (slow==fast){
                flag=1;
                break;
            }

        }

        
        if (flag==0){
            System.out.println("no loop Detected");
        }
        else {
            System.out.println("Loop has been detected");
        }
    }

    //implementation of displaying a linked list
    private void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextAddr;
        }
        System.out.println();
    }
}
