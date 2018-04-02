package com.irast.algorithms.datastructures.utils;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Node {
    public Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BTreeUtil {

    public int getHeight(Node node) {
        if (node == null || (node.left == null && node.right == null)) return 0;
        return Integer.max(getHeight(node.left), getHeight(node.right)) + 1;
    }

    public boolean isBinarySearchTree(Node node) {
        return isBinarySearchTree(node, null, null);
    }

    private boolean isBinarySearchTree(Node root, Integer min, Integer max) {

        if (root == null) return true;
        if ((min != null && root.data <= min) || (max != null && root.data > max)) return false;
        if (!isBinarySearchTree(root.left, min, root.data) || !isBinarySearchTree(root.right, root.data, max))
            return false;
        return true;
    }

    public void printBST(Node root) {
        int height = getHeight(root);
        Comparator<Integer> comparator = Comparator.reverseOrder();
        Map<Integer, String> map = new TreeMap<>(comparator);
        printBST(root, height, height, map);
        System.out.println(map);
        map.forEach((key, val) -> System.out.println(val));
    }

    private void printBST(Node node, int height, int tab, Map<Integer, String> map) {
        if (node == null) return;

        printBST(node.left, height - 1, tab, map);
        String s = Stream.generate(() -> "\t").limit(height).collect(Collectors.joining());
        String ss = "";
        if (tab >= 0) {
            ss = Stream.generate(() -> "\t").limit(tab).collect(Collectors.joining());
        }
        map.merge(height, (s + node.data + ss), (oldVal, newVal) -> (oldVal + newVal));

        printBST(node.right, height - 1, tab + 1, map);
    }

    public void bfs(Node root, int height, Map<Integer, String> map) {

        String s = Stream.generate(() -> "\t").limit(height).collect(Collectors.joining());
        LinkedList<Node> nodes = new LinkedList<>();
        while (root != null) {
            //nodes.add(root);
            if (root.left != null) {
                nodes.add(root.left);
            }
            if (root.right != null) {
                nodes.add(root.right);
            }
            if (nodes.size() != 0) {
                //System.out.print(root.data + "\t");
                map.put(height, s);
                root = nodes.pop();
            } else {
                System.out.println(root.data);
                return;
            }
        }
    }
}
