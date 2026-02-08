package org.example;

public class MyArrayList {
    int default_initial_capacity = 10;
    int[] myArray;

    public MyArrayList(){
        myArray = new int[default_initial_capacity];
    }

    public void add(int i){
        //check if still in bounds of default initial capacity
        //if not - create new array and copy previous into the new one
    }
}
