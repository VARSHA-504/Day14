package com.bl.linkedlistprogram;

public class LinkedList {
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

    /*
     * This is the method to add first element
     */
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

    /*
     * This is the method to display elements
     */
    public void display() {
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

    /*
     * This is the method to add last element
     */
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

    /*
     * This is the method to delete first element
     */
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
}