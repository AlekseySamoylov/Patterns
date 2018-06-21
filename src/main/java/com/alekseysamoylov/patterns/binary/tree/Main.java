package com.alekseysamoylov.patterns.binary.tree;

public class Main {

    Node root;

    public void levelOrderBinaryTree(int[] arr) {
        root = levelOrderBinaryTree(arr, 0);
    }

    public Node levelOrderBinaryTree(int[] arr, int start) {
        int size = arr.length;
        Node curr = new Node(arr[start]);
        int left = 2 * start + 1;
        int right = 2 * start + 2;

        if (left < size) {
            curr.lChild = levelOrderBinaryTree(arr, left);
        }
        if (right < size) {
            curr.rChild = levelOrderBinaryTree(arr, right);
        }
        return curr;
    }


    public static void main(String[] args) {
        Main t = new Main();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        t.levelOrderBinaryTree(arr);
        t.print();
    }

    private void print() {
        System.out.println(root.print());
    }
}


class Node {
    int value;
    Node lChild;
    Node rChild;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    public String print() {
        return "Left node: " + lChild == null ? "null" : lChild.print() + " Right node: " + rChild.print() == null ? "null" : rChild.print();
    }
}
