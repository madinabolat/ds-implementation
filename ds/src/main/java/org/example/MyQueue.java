package org.example;

import java.util.Queue;

public class MyQueue {
    MyLinkedList myLinkedList;

    //first in first out


    //for unlimited queue - always true
    //for limited queue - need to add exceptions
    public boolean add(int n){
        myLinkedList.add(n);
        return true;
    }

    public int remove(int n){
        myLinkedList.remove(0);
        //need to throw Throws:
        //NoSuchElementException – if this queue is empty

        //but my linkedlist returns outofbound if emppty

        //need to catch here
        //or restructure better the linked list
        return n;
    }
    
    //poll
    //element
    //peek



    
}
