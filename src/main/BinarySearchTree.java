package main;

public class BinarySearchTree {
    public BinaryTree bst;
    public Node addRecursiveBST(Node current, int value)
    {
        if (current==null)
        {
            return new Node(value);
        }
        if (current.value<value) {
            return addRecursiveBST(current.left, value);
        }
        else
        {
            return addRecursiveBST(current.right, value);
        }
    }
}
