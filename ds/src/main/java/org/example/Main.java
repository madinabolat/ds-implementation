package org.example;

import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        MyArrayList myArrayList1 = new MyArrayList();
//        for (int i : myArrayList1.myArray){
//            System.out.println(i);
//        }
//
//
//        myArrayList1.add(1);
//        myArrayList1.add(2);
//        myArrayList1.add(3);
//        myArrayList1.add(4);
//        myArrayList1.add(5);
//
//        System.out.println("curr position: " + myArrayList1.currentPosition);
//        System.out.println("After adding elements");
//        int counter = 0;
//        for (int i : myArrayList1.myArray){
//            System.out.println("Element " + counter + ": " + i);
//            counter ++;
//        }
//
//        System.out.println("Size: " + myArrayList1.size());
//
//        myArrayList1.remove(0);
//        System.out.println("curr position: " + myArrayList1.currentPosition);
//
//        System.out.println("After removing");
//        int counter1 = 0;
//        for (int i : myArrayList1.myArray){
//            System.out.println("Element " + counter1 + ": " + i);
//            counter1 ++;
//        }
//        System.out.println("Size: " + myArrayList1.size());
//
//
//        System.out.println("requesting");
//        System.out.println(myArrayList1.get(2));


//        ArrayList<Integer> myAL = new ArrayList<>();
//        myAL.add(1);
//        myAL.add(2);
//        myAL.add(3);
//        myAL.add(4);
//        myAL.add(5);
//        System.out.println(myAL);
//
//        myAL.get(10);


//        MyLinkedList myLL = new MyLinkedList();
//        System.out.println(myLL);
////        myLL.add(0);
////        myLL.add(1);
////        myLL.add(2);
////        myLL.add(3);
////        myLL.add(4);
////        myLL.add(5);
//        System.out.println(myLL);
//        myLL.remove(0);
//        System.out.println(myLL);


//        LinkedList<Integer> myL = new LinkedList<>();
//        System.out.println(myL.get(0));

//        MyStack myStack = new MyStack();
//        System.out.println(myStack);
//        myStack.push(0);
//        myStack.push(1);
//        myStack.push(2);
//        System.out.println(myStack);
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());



//        MyArrayList myAL = new MyArrayList();
//        System.out.println(myAL);
//        myAL.add(0);
//        myAL.add(1);
//        myAL.add(2);
//        myAL.add(3);
//        myAL.add(4);
//        myAL.add(5);
//        System.out.println(myAL);
//
//        System.out.println("My Array List size: " + myAL.size());
//        System.out.println(myAL.get(2));
//        myAL.remove(2);
//        System.out.println(myAL);
//        System.out.println("Current position: " + myAL.currentPosition);


//        MyQueue myQueue = new MyQueue();
////        myQueue.add(5);
//        System.out.println(myQueue);
////        myQueue.add(5);
////        myQueue.add(4);
////        myQueue.add(3);
//        System.out.println(myQueue);
////        myQueue.remove();
////        System.out.println(myQueue);
////        myQueue.remove();
////        System.out.println(myQueue);
//
////        System.out.println(myQueue.peek());
////
////        System.out.println(myQueue.peek());
//
//        myQueue.remove();

        MyHashMap myHashMap = new MyHashMap();
        System.out.println(myHashMap);
        myHashMap.put(1,100);
        myHashMap.put(1,1000);
        myHashMap.put(1,10000);
        myHashMap.put(17,1000);
        myHashMap.put(2,200);
        myHashMap.put(2,400);
        myHashMap.put(33,400);
        myHashMap.put(2,4000);
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        myHashMap.remove(33);
        System.out.println(myHashMap);
        System.out.println(myHashMap.containsKey(2));

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"madina");
//        map.put(2, "got");
//        map.put(3, "her");
//        map.put(4, "green card!");
//        map.put(1,"Madishok");
//        System.out.println(map);
//        System.out.println(map.containsKey(4));


    }
}