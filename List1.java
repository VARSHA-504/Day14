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
        LinkedList List1 = new LinkedList();
        List1.addFirst(70);
        List1.addFirst(56);
        List1.add(1,30);

        System.out.println(List1);

    }
}
