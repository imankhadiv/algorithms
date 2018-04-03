package com.irast.algorithms.datastructures.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BTreeUtilTest {

    BTreeUtil app;

    @Before
    public void setUp() throws Exception {
        app = new BTreeUtil();
    }

    @Test
    public void getHeightWhenThereIsLeftChild() {
        Node root = new Node(100);
        root.left = new Node(50);
        root.left.left = new Node(20);
        Assert.assertEquals(2, app.getHeight(root));
    }

    @Test
    public void getHeightWhenThereIsNoChild() {
        Node root = new Node(100);
        Assert.assertEquals(0, app.getHeight(root));
    }

    @Test
    public void shouldReturnTrueIfTreeIsBinarySearchTree() {

        Node root = new Node(100);
        root.left = new Node(50);
        root.left.right = new Node(70);
        root.left.left = new Node(60);
        root.right = new Node(200);
        root.right.right = new Node(210);
        //Assert.assertTrue(app.isBinarySearchTree(root));
        app.printBST(root);

    }

    @Test
    public void shouldReturnFalseIfTreeIsBinarySearchTree() {

        Node root = new Node(100);
        root.left = new Node(50);
        root.left.right = new Node(170);
        root.right = new Node(200);
        Assert.assertFalse(app.isBinarySearchTree(root));
    }


    @Test
    public void shouldCheckIfBTIsBalanced() {

        Node root = new Node(100);
        root.left = new Node(50);
        root.right = new Node(200);
        root.right.right = new Node(250);
        root.right.right.right = new Node(260);
        app.printBST(root);
        Assert.assertFalse(app.checkIfBinayTreeIsBalanced(root));
    }
}