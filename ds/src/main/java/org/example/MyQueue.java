package org.example;

import java.util.Queue;

public class MyQueue {
    MyLinkedList myLinkedList = new MyLinkedList();

    //first in first out

    //for unlimited queue - always true
    //for limited queue - need to add exceptions
    public boolean add(int n){
        myLinkedList.add(n);
        return true;
    }

    public int remove(){
        int n = myLinkedList.get(0);
        myLinkedList.remove(0);
        //need to throw Throws:
        //NoSuchElementException – if this queue is empty

        //but my linkedlist returns outofbound if emppty

        //need to catch here
        //or restructure better the linked list
        return n;
    }

    public int peek(){
        return myLinkedList.get(0);
    }

    @Override
    public String toString(){
        return myLinkedList.toString();
    }

    //poll
    //offer
    //element

}
