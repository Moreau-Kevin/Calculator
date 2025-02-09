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
        BinaryTree bt = createBinaryTree();

        bt.TraverseInOrder(bt.root);
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
