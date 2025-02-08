package main;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;


public class BinaryTree {
    Node root;
    public void add(int value) {
        root = addRecursive(root, value);
    }
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private Node addRecursive (Node current, int value){
        if (current==null){
            return new Node(value);
        }
        if (value<current.value){
            current.left = addRecursive(current.left, value);
        }else if (value>current.value){
            current.right= addRecursive(current.right, value);
        }else{
            return current;
        }
        return current;
    }

    private Node deleteRecursive (Node current, int value)
    {
        if (current.value==value) {
            if (current.left==null && current.right==null) {
                return null;
            }
            if (current.left!=null && current.right!=null) {
                return current;
            }
        }
        if(value<current.value)
        {
            current.left=deleteRecursive(current.left, value);
        }
        else if (value>current.value) {
            current.right=deleteRecursive(current.right, value);
        }
        else
        {
            return current;   
        }        
        return current;
    }
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

}
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
    
    


