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
    }



    private class Node {
        int data;
        Node nextAddr;

        Node(int d) {
            data = d;
            nextAddr = null;
        }
    }

    //implementation of insertion of node at ending
    Node head;

    private void insertAtEnd(int newData) {

        Node newNode = new Node(newData);
        //case 1 : if ll is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        //case2: ll is not empty
        newNode.nextAddr = null;
        Node temp = head;
        while (temp.nextAddr != null) {
            temp = temp.nextAddr;

        }
        temp.nextAddr = newNode;
        return;

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
            System.out.println(" the node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.nextAddr = prev_node.nextAddr;
        prev_node.nextAddr = newNode;
    }

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
//        deletion at any position
        for (int i = 0; i < position-1  && temp != null; i++) {
            temp = temp.nextAddr;
        }
        if (temp == null && temp.nextAddr == null) {
            return;
        }
        temp.nextAddr = temp.nextAddr.nextAddr;
    }
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

    private void displayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextAddr;
        }
        System.out.println();
    }
}
