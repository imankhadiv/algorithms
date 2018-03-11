package com.irast.algorithms.datastructures;

import java.util.StringJoiner;

public class BasicLinkedList<T> {

    Node first;
    Node last;
    int nodeCount;


    public int size() {
        return nodeCount;
    }

    public void add(T item) {

        Node node = new Node(item);
        if (size() == 0) {
            first = node;
            last = first;
        } else {
            last.next = node;
            last = node;
        }
        nodeCount++;

    }

    public T remove() {

        if (nodeCount == 0) {
            throw new IllegalStateException("Can't remove from an empty list");
        }
        T value = first.getValue();
        first = first.next;
        if (first == null) last = null;
        nodeCount--;
        return value;
    }

    public void insert(T item, int position) {
        if (position > nodeCount) {
            throw new IllegalStateException("The linkedlist is smaller than the position");
        } else if (nodeCount == 0) {
            add(item);
        } else {
            Node node = new Node(item);

            Node previous = first;
            for (int i = 1; i < position; i++) {
                previous = previous.next;
            }
            if (position == 0) {
                node.next = first;
                first = node;
            } else if (position == nodeCount) {
                last.next = node;
                last = node;
            } else {
                Node tmp = previous.next;
                previous.next = node;
                node.next = tmp;
            }
            nodeCount++;
        }
        System.out.println(this);
    }

    public T removeAt(int position) {
        Node removedNode = null;
        System.out.println("before removing..." + this);
        if (nodeCount == 0 || position >= nodeCount) {
            throw new IllegalStateException("The linkedlist is smaller than the position");
        } else if (position == 0) {
            removedNode = first;
            first = first.next;
        } else {
            Node previous = first;
            for (int i = 1; i < position; i++) {
                previous = previous.next;
            }
            removedNode = previous.next;
            previous.next = removedNode.next;
            if (position == nodeCount - 1) last = previous;
        }
        System.out.println("after removing..." + this);
        nodeCount--;
        return removedNode.value;
    }

    public T get(int position) {
        if (nodeCount == 0 || position >= nodeCount) {
            throw new IllegalStateException("The linkedlist is smaller than the position");
        }
        Node current = first;
        while (position > 0) {
            current = current.next;
            position--;
        }
        return current.getValue();
    }

    public int find(T item) {
        if (first == null) {
            throw new IllegalStateException("The Llinkedlist is empty and there are not items to find");
        }
        Node currentNode = first;
        for (int i = 1; i < size() && currentNode != null; i++) {
            if (currentNode.getValue().equals(item)) {
                return (i - 1);
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("->", "", "");
        for (Node node = first; node != null; node = node.next) {
            String val = node.getValue() == null ? "null" : node.getValue().toString();
            stringJoiner.add(val);
        }
        return stringJoiner.toString();
    }

    class Node {

        private T value;
        private Node next;

        Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
