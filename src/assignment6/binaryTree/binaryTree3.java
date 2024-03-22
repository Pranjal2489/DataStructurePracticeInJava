package assignment6.binaryTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class Node1
{
    int key;
    Node1 left = null, right = null;

    Node1(int key) {
        this.key = key;
    }
}
public class binaryTree3 {
    public static void main(String[] args) {
        Node1 root = new Node1(15);
        root.left = new Node1(10);
        root.right = new Node1(20);
        root.left.left = new Node1(8);
        root.left.right = new Node1(12);
        root.right.left = new Node1(16);
        root.right.right = new Node1(25);
        reverseLevelOrderTraversal(root);
    }

    private static void reverseLevelOrderTraversal(Node1 root) {
        if (root == null) {
            return;
        }
        Queue<Node1> queue = new ArrayDeque<>();
        queue.add(root);

        Deque<Integer> stack=new ArrayDeque<>();
        Node1 curr;

        while (!queue.isEmpty()){
            curr=queue.poll();
            stack.push(curr.key);
            if (curr.right != null) {
                queue.add(curr.right);
            }

            if (curr.left != null) {
                queue.add(curr.left);
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.poll() + " ");
            }


        }
    }
}
