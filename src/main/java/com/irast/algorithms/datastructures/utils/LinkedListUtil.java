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

}
