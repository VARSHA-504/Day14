package com.bl.linkedlistprogram;

import java.util.LinkedList;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class List1 {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Datastructure Program");
        LinkedList<Integer> List1 = new LinkedList<Integer>();
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node tail = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }

    }
}