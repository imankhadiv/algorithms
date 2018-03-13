package com.irast.algorithms.datastructures.utils;

import com.irast.algorithms.datastructures.basics.BasicLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListUtil {


    public void removeDuplicatesWithBuffer(BasicLinkedList<Integer> input) {

        Set<Integer> set = new HashSet<>();
        BasicLinkedList<Integer>.Node previous = null;
        System.out.println("before removing duplicates: " + input.toString());
        BasicLinkedList<Integer>.Node node = input.getFirst();
        while (node != null) {
            if (set.contains(node.getValue())) {
                previous.setNext(node.getNext());
            } else {
                set.add(node.getValue());
                previous = node;

            }
            node = node.getNext();
        }
        System.out.println("after removing duplicates: " + input.toString());
    }

    public void removeDuplicatesWithoutBuffer(BasicLinkedList<Integer> input) {

        System.out.println("before removing duplicates: " + input.toString());
        BasicLinkedList<Integer>.Node current = input.getFirst();

        while (current != null) {
            BasicLinkedList<Integer>.Node runner = current;
            while (runner.getNext() != null) {
                if (runner.getNext().getValue().equals(runner.getValue())) {
                    runner.setNext(runner.getNext().getNext());
                } else {
                    runner = runner.getNext();
                }
            }
            current = current.getNext();
        }
        System.out.println("after removing duplicates: " + input.toString());
    }

    public BasicLinkedList.Node findKthLastNode(BasicLinkedList<Integer> basicLinkedList, int k) {

        if (k < 1) {
            throw new IllegalStateException("K must be greater than one");
        }
        BasicLinkedList.Node runnerNode = basicLinkedList.getFirst();
        BasicLinkedList.Node targetNode = basicLinkedList.getFirst();
        while (k > 1) {
            runnerNode = runnerNode.getNext();
            k--;
        }
        while (runnerNode.getNext() != null) {
            runnerNode = runnerNode.getNext();
            targetNode = targetNode.getNext();
        }
        return targetNode;
    }

    public int findKthElementRecursively(BasicLinkedList<Integer> linkedList, int k) {
        return findKthElementRecursively(linkedList.getFirst(), k);
    }

    private int findKthElementRecursively(BasicLinkedList<Integer>.Node node, int k) {

        if (node == null) return 0;
        int i = findKthElementRecursively(node.getNext(), k) + 1;
        if (i == k) System.out.println(node.getValue());
        return i;
    }

}
