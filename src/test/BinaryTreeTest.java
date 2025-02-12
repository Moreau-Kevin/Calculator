package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.BinaryTree;

public class BinaryTreeTest {
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt= createBinaryTree();
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));
        assertFalse(bt.containsNode(1));
    }

    @Test
    public void AddAnElementAndDeleteIt(){
        BinaryTree bt= createBinaryTree();
        bt.add(9);
        assertTrue(bt.containsNode(3));
        bt.delete(3);
        assertFalse(bt.containsNode(3));
    }
    @Test
    public void TraverseInOrderTest()
    {
        System.out.println("--------------------------------- TRAVERSE IN ORDER TEST --------------------------------------------");
        BinaryTree bt = createBinaryTree();

        bt.TraverseInOrder(bt.root);
        System.err.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    @Test
    public void TraversePreOrderTest()
    {
        System.out.println("--------------------------------- TRAVERSE PRE ORDER TEST ---------------------------------------------");
        BinaryTree bt = createBinaryTree();
        bt.TraversePreOrder(bt.root);
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
    @Test
    public void TraversePostOrderTest()
    {   System.out.println("--------------------------------- TRAVERSE POST ORDER TEST --------------------------------------------");
        BinaryTree bt = createBinaryTree();
        bt.TraversePostOrder(bt.root);
        System.err.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    @Test
    public void TraverseLevelOrderTest()
    {
        System.out.println("--------------------------------- TRAVERSE LEVEL ORDER TEST --------------------------------------------");
        BinaryTree bt = createBinaryTree();
        bt.TraverseLevelOrder();
        System.err.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();
    
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    
        return bt;
    }
}
