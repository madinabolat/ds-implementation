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
        System.out.println("After adding 15 elements");
        for (int i = 0; i < 15; i++){
            myArrayList1.add(15);
        }
        for (int i : myArrayList1.myArray){
            System.out.println(i);
        }



        ArrayList<Integer> myAL = new ArrayList<>();
        System.out.println(myAL);
        myAL.add(4);
        myAL.add(5);
        System.out.println(myAL);


    }
}