package com.bl.linkedlistprogram;

import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Datastructure Program");
        LinkedList list1 = new LinkedList();
        list1.addFirst(70);
        list1.addFirst(30);
        list1.addFirst(56);
        list1.display();
        list1.deleteLast();
        list1.display();


    }
}
