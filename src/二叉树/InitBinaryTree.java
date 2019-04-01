package 二叉树;

import java.util.*;

public class InitBinaryTree {
    public static class Node {
        public int value;
        public Node left;  //左子树
        public Node right; //右子树

        public Node(int data) {
            this.value = data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        InitBinaryTree f = new InitBinaryTree();
        String str = "1!2!4!#!#!5!#!#!3!6!#!#!7!#!#!";   //二叉树序列化结果
        f.printTreeByZigzag(node1);

    }

    //  测试代码***************************************************
    public void printTreeByZigzag(Node head) {
        if (head == null) {
            return;
        }
        Deque<Node> dq = new LinkedList<>();
        boolean lr = true;    //true:从左到右   false：从右到左
        int level = 1;
        Node last = head;
        Node nLast = null;
        dq.offerFirst(head);
        print(level++, lr);
        while (!dq.isEmpty()) {
            if (lr) {
                head = dq.pollFirst();
                if (head.left != null) {
                    nLast = nLast == null ? head.left : nLast;
                    dq.offerLast(head.left);
                }
                if (head.right != null) {
                    nLast = nLast == null ? head.right : nLast;
                    dq.offerLast(head.right);
                }
            } else {
                head = dq.pollLast();
                if (head.right != null) {
                    nLast = nLast == null ? head.right : nLast;
                    dq.offerFirst(head.right);
                }
                if (head.left != null) {
                    nLast = nLast == null ? head.left : nLast;
                    dq.offerFirst(head.left);
                }
            }
            System.out.print(head.value + " ");
            if (head == last && !dq.isEmpty()) {
                lr = !lr;
                last = nLast;
                nLast = null;
                System.out.println();
                print(level++, lr);
            }
        }
    }

    public void print(int level, boolean lr) {
        System.out.print("level " + level + " from ");
        System.out.print(lr ? "left to right: " : "right to left: ");
    }
    //*************************************************************
}
