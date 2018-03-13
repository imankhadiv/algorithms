package com.irast.algorithms.datastructures.utils;

import com.irast.algorithms.datastructures.basics.BasicLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListUtilTest {

    BasicLinkedList<Integer> linkedList;
    LinkedListUtil app;

    @BeforeEach
    void setUp() {
        linkedList = new BasicLinkedList<>();
        app = new LinkedListUtil();

    }

    @Test
    void removeDuplicatesWithBuffer() {

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(30);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(30, linkedList.get(2).intValue());
    }

    @Test
    void removeDuplicatesWhenAllNodesAreEquals() {

        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(10, linkedList.get(0).intValue());
    }

    @Test
    void removeDuplicatesWithoutBuffer() {

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(30);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(30, linkedList.get(2).intValue());
    }

    @Test
    void removeDuplicatesWithoutBufferWhenAllNodesAreEquals() {

        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(10);

        app.removeDuplicatesWithBuffer(linkedList);
        Assert.assertEquals(10, linkedList.get(0).intValue());
    }

    @Test
    void findKthElementInTheList() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList.Node node = app.findKthLastNode(linkedList, 1);

        Assert.assertEquals(5, node.getValue());
    }

    @org.junit.Test(expected = IllegalStateException.class)
    void shouldThrowExceptionWhenKIsLessThanOne() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList.Node node = app.findKthLastNode(linkedList, 0);

    }

    @Test
    void partitionLinkedList() {

        BasicLinkedList<Integer> linkedList = createList();
        BasicLinkedList<Integer> partitionedList = app.partitionLinkedList(linkedList.getFirst(), 40);
        Assert.assertEquals(50, partitionedList.getLast().getValue().intValue());

//        Assert.assertEquals(java.util.Optional.of(50), partitionedList.getLast().getValue());
    }


    private BasicLinkedList<Integer> createList() {
        BasicLinkedList<Integer> basicLinkedList = new BasicLinkedList<>();
        basicLinkedList.add(10);
        basicLinkedList.add(20);
        basicLinkedList.add(30);
        basicLinkedList.add(40);
        basicLinkedList.add(50);
        basicLinkedList.add(10);
        basicLinkedList.add(5);
        return basicLinkedList;
    }
}