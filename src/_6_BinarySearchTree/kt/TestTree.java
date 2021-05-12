package _6_BinarySearchTree.kt;

import _6_BinarySearchTree.BST;

public class TestTree<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left, right;

        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;
}
