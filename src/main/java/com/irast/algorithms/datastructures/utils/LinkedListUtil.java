package com.irast.algorithms.datastructures.utils;

import com.irast.algorithms.datastructures.basics.BasicLinkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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

    public BasicLinkedList<Integer> partitionLinkedList(BasicLinkedList<Integer>.Node node, int x) {

        BasicLinkedList<Integer>.Node lessStart = null;
        BasicLinkedList<Integer>.Node lessEnd = null;
        BasicLinkedList<Integer>.Node greaterStart = null;
        BasicLinkedList<Integer>.Node greaterEnd = null;
        System.out.println("Before partition..." + insertNodesIntoLinkedList(node));
        while (node != null) {
            System.out.println(node.getValue() + "-" + x);
            BasicLinkedList<Integer>.Node next = node.getNext();
            node.setNext(null);
            if (node.getValue() < x) {
                if (lessStart == null) {
                    lessStart = node;
                    lessEnd = lessStart;
                } else {
                    lessEnd.setNext(node);
                    lessEnd = lessEnd.getNext();
                }
            } else {
                if (greaterStart == null) {
                    greaterStart = node;
                    greaterEnd = greaterStart;
                } else {
                    greaterEnd.setNext(node);
                    greaterEnd = greaterEnd.getNext();
                }
            }
            node = next;
        }
        lessEnd.setNext(greaterStart);
        System.out.println("After partition..." + insertNodesIntoLinkedList(lessStart));

        return insertNodesIntoLinkedList(lessStart);
    }

    public BasicLinkedList<Integer> partitionLinkedListWithoutPointers(BasicLinkedList<Integer>.Node node, int x) {

        BasicLinkedList<Integer>.Node head = node;
        BasicLinkedList<Integer>.Node tail = node;
        while (node != null) {
            BasicLinkedList<Integer>.Node next = node.getNext();
            Integer val = node.getValue();
            if (val > x) {
                tail.setNext(node);
                tail = node;
            } else {
                node.setNext(head);
                head = node;
            }
            node = next;
        }
        tail.setNext(null);
        System.out.println(insertNodesIntoLinkedList(head));
        return insertNodesIntoLinkedList(head);
    }

    public boolean isLinkedListPalindrome(BasicLinkedList<Integer> linkedList) {
        BasicLinkedList<Integer>.Node slowRunner = linkedList.getFirst();
        BasicLinkedList<Integer>.Node fastRunner = linkedList.getFirst();
        Stack<BasicLinkedList.Node> stack = new Stack<>();
        while (fastRunner != null && fastRunner.getNext() != null) {
            fastRunner = fastRunner.getNext().getNext();
            stack.add(slowRunner);
            slowRunner = slowRunner.getNext();
        }
        //handling odd number
        if(fastRunner != null){
            slowRunner = slowRunner.getNext();
        }
        while (slowRunner != null) {
            BasicLinkedList<Integer>.Node node = stack.pop();
            if (!node.getValue().equals(slowRunner.getValue())) return false;
            slowRunner = slowRunner.getNext();
        }
        return true;
    }

    private BasicLinkedList<Integer> insertNodesIntoLinkedList(BasicLinkedList<Integer>.Node first) {
        BasicLinkedList<Integer> linkedList = new BasicLinkedList<>();
        while (first != null) {
            linkedList.add(first.getValue());
            first = first.getNext();
        }
        return linkedList;
    }


}
