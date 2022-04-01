package com.bl.linkedlistprogram;

import java.util.Scanner;

public class LinkedList {
    Scanner scanner = new Scanner(System.in);
    Node head;

    // node creation
    public class Node {

        Object data;
        Node ref;

        // constructor
        public Node(Object data) {
            this.data = data;
        }
    }

    public void addFirst(Object data) {
        // create new node
        Node newNode = new Node(data);
        // list is empty
        if (head == null)
            head = newNode;
            // list is not empty
        else {
            newNode.ref = head;
            head = newNode;
        }
    }


    public void display(Object data) {
        // list is empty
        if (head == null)
            System.out.println("No elements to display.");
            // list is not empty
        else {
            Node temp = head;
            // traverse up to null elements
            while (temp != null) {
                if (temp.ref != null)
                    System.out.print(temp.data + " => ");
                else
                    // display data
                    System.out.println(temp.data);
                temp = temp.ref;
            }
        }
    }

    public void addLast(Object data) {
        // create new node
        Node newNode = new Node(data);
        // list is empty
        if (head == null)
            head = newNode;
            // list has only one element
        else if (head.ref == null)
            head.ref = newNode;
            // list has more than 1 elements
        else {
            Node temp = head;
            // traverse up to null elements
            while (temp.ref != null) {
                temp = temp.ref;
            }
            temp.ref = newNode;
        }
    }

    public void deleteFirst() {
        // list is empty
        if (head == null)
            System.out.println("Nothing to delete..");
            // list is not empty
        else {
            Node temp = head;
            head = temp.ref;
        }
    }
            public void deleteLast () {
                // list is empty
                if (head == null)
                    System.out.println("No elements to delete");
                    // list has only one element
                else if (head.ref == null)
                    head = null;
                    // list is not empty
                else {
                    Node temp = head;
                    // traverse up to ref of next node is null
                    while (temp.ref.ref != null) {
                        temp = temp.ref;
                    }
                    temp.ref = null;

                }
            }
    public void addMiddle(Object data) {
        // create new node
        Node newNode = new Node(data);
        // list is empty
        if (head == null)
            head = newNode;
            // list has more than 1 elements
        else {
            Node temp = head;
            System.out.println("Enter the data after which new data should be added");
            Object data1 = scanner.nextInt();
            // traverse up to data after which new data should be added
            while (temp.data != data1) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void search (Object data) {

        boolean isFound = false;
        // list is empty
        if (head == null)
            System.out.println("No elements to search");
            // list has only one element
        else if (head.data == data)
            isFound = true;
            // list has more than 1 elements
        else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    isFound = true;
                    break;
                }
                temp = temp.next;
            }
        }
        if (isFound)
            System.out.println("Data found ");
        else
            System.out.println(data + " not found");
    }
}