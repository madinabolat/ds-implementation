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
    int size = 0;

    public int size(){
        return size;
    }

    //need to add - to the end, to specific index
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
        size++;
    }

    //need to add remove the object
    public void remove(int index){
        if (index > size) {
            throw new IndexOutOfBoundsException("Index is out of bound.");
        }
        if (index==0){
            head = head.next;
            size--;
            return;
        }
        Node previousNode = getNodeAtIndex(index-1);
        previousNode.next = previousNode.next.next;
        size--;
    }


    public Node getNodeAtIndex(int index){
        if (head == null) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        int counter = 0;
        Node temp = head;

        while (counter < index){
            if (temp.next == null){
                throw new IndexOutOfBoundsException("Index is out of bound.");
            }
            temp = temp.next;
            counter ++;
        }

        return temp;
    }

    public int get(int index){
        return getNodeAtIndex(index).value;
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
}


