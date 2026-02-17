package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

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


        MyLinkedList myLL = new MyLinkedList();
        System.out.println(myLL);
        myLL.add(1);
        myLL.add(2);
        myLL.add(3);
        System.out.println(myLL);

    }
}