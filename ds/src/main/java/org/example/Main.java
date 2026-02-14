package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        for (int i : myArrayList1.myArray){
            System.out.println(i);
        }


        myArrayList1.add(1);
        myArrayList1.add(2);
        myArrayList1.add(3);
        myArrayList1.add(4);
        myArrayList1.add(5);

        System.out.println("After adding elements");
        int counter = 0;
        for (int i : myArrayList1.myArray){
            System.out.println("Element " + counter + ": " + i);
            counter ++;
        }

        System.out.println("Size: " + myArrayList1.size());

        myArrayList1.remove(3);

        System.out.println("After removing");
        int counter1 = 0;
        for (int i : myArrayList1.myArray){
            System.out.println("Element " + counter1 + ": " + i);
            counter1 ++;
        }
        System.out.println("Size: " + myArrayList1.size());

//
//        ArrayList<Integer> myAl = new ArrayList<>();
//        myAl.add(5);
//        myAl.add(4);
//        myAl.add(3);
//        System.out.println(myAl);
//
//
//        myAl.remove(1);
//        System.out.println(myAl);

    }
}