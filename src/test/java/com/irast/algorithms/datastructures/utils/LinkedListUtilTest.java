package com.irast.algorithms.datastructures.utils;

import com.irast.algorithms.datastructures.basics.BasicLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListUtilTest {

    BasicLinkedList<Integer> linkedList;
    LinkedListUtil app;

    @Before
    public void setUp() {
        linkedList = new BasicLinkedList<>();
        app = new LinkedListUtil();

    }

    @Test
    public void removeDuplicatesWithBuffer() {

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(30);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(30, linkedList.get(2).intValue());
    }

    @Test
    public void removeDuplicatesWhenAllNodesAreEquals() {

        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(10, linkedList.get(0).intValue());
    }

    @Test
    public void removeDuplicatesWithoutBuffer() {

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(30);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(30, linkedList.get(2).intValue());
    }

    @Test
    public void removeDuplicatesWithoutBufferWhenAllNodesAreEquals() {

        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(10, linkedList.get(0).intValue());
    }

    @Test
    public void findKthElementInTheList() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList.Node node = app.findKthLastNode(linkedList, 1);

        Assert.assertEquals(5, node.getValue());
    }

    @org.junit.Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenKIsLessThanOne() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList.Node node = app.findKthLastNode(linkedList, 0);

    }

    @Test
    public void partitionLinkedList() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList<Integer> partitionedList = app.partitionLinkedList(linkedList.getFirst(), 40);
        Assert.assertEquals(50, partitionedList.getLast().getValue().intValue());
    }

    @Test
    public void partitionLinkedListWithoutPointer() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList<Integer> partitionedList = app.partitionLinkedListWithoutPointers(linkedList.getFirst(), 19);
        Assert.assertEquals(50, partitionedList.getLast().getValue().intValue());
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindromeForOddSizeList() {

        BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(10);

        Assert.assertTrue(app.isLinkedListPalindrome(linkedList));
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindromeForEvenSizeList() {

        BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();
        linkedList.add(10);
        linkedList.add(10);

        Assert.assertTrue(app.isLinkedListPalindrome(linkedList));
    }


    private BasicLinkedList<Integer> createList() {
        BasicLinkedList<Integer> basicLinkedList = new BasicLinkedList<>();
        basicLinkedList.add(10);
        basicLinkedList.add(20);
        basicLinkedList.add(30);
        basicLinkedList.add(40);
        basicLinkedList.add(50);
        basicLinkedList.add(11);
        basicLinkedList.add(5);
        return basicLinkedList;
    }
}