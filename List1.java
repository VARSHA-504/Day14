package com.bl.linkedlistprogram;

import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Datastructure Program");
        LinkedList list = new LinkedList();
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);
        list.display();
        list.deleteFirst();
        list.display();


    }
}
