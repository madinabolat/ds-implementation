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

        for (int i = 0; i < 5; i++){
            myArrayList1.add(5);
        }
        System.out.println("After adding 25 elements");
        int counter = 0;
        for (int i : myArrayList1.myArray){
            System.out.println("Element " + counter + ": " + i);
            counter ++;
        }

        System.out.println("Size: " + myArrayList1.size());



    }
}