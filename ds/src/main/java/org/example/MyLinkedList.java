package org.example;

import java.util.LinkedList;

public class MyLinkedList {
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    Node head;
    int size;

    public void add(int n){
        if (head == null){
            head = new Node(n);
        } else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(n);
        }
    }

    @Override
    public String toString(){
        String s = "[";
        Node temp = head;

        while (temp != null){
            s += temp.value + ",";
            temp = temp.next;
        }
        s = s.replaceAll(",$", "");
        s+= "]";
        return s;
    }

    //add to the end
    //add to specific index


    //is the first element added to mylinkedlist is becoming its head?



}


