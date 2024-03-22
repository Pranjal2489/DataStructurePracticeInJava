package assignment6.binaryTree;

class Node2
{
    int data;
    Node2 left = null, right = null;

    Node2(int data) {
        this.data = data;
    }
}
public class binaryTree5 {
    public static void main(String[] args) {
        /* Construct the following tree
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
        */

        Node2 root = new Node2(1);
        root.left = new Node2(2);
        root.right = new Node2(3);
        root.left.left = new Node2(4);
        root.left.right = new Node2(5);
        root.right.left = new Node2(6);
        root.right.right = new Node2(7);

        convertToMirror(root);
        preorder(root);
    }

    private static void preorder(Node2 root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    private static void convertToMirror(Node2 root) {
        if (root == null) {
            return;
        }
        convertToMirror(root.left);
        convertToMirror(root.right);
        swap(root);
    }
    private static void swap(Node2 root)
    {
        if (root == null) {
            return;
        }

        Node2 temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
