package assignment6.binaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

class Node{
    int key;
    Node2 left=null,right=null;
    Node (int key){
        this.key=key;
    }
}
public class binaryTree2 {
    public static void main(String[] args) {
        /* Construct the following tree
                  1
               /     \
              2       3
             / \     / \
            4   5   6   7
        */
        Node2 root=new Node2(1);
        root.left=new Node2(2);
        root.right=new Node2(3);
        root.left.left=new Node2(4);
        root.left.right=new Node2(5);
        root.right.left=new Node2(6);
        root.right.right=new Node2(7);
        
        if (isComplete(root)){
            System.out.println("CBT");
        }else {
            System.out.println("not CBT");
        }

    }

    private static boolean isComplete(Node2 root) {
        if ((root==null)){
            return true;
        }
        Queue<Node2> queue=new ArrayDeque<>();
        queue.add(root);

        Node2 front;
        boolean flag=false;
        while (!queue.isEmpty()){
            front=queue.poll();
            if (flag&&(front.left!=null||front.right!=null)){
                return false;
            }
            if (front.left==null&& front.right!=null){
                return false;
            }
            //for left and right nodes
            if (front.left!=null){
                queue.add(front.left);
            }
            else flag=true;
            if (front.right!=null){
                queue.add(front.right);
            }
            else flag=true;

        }
        return  true;
    }
}
