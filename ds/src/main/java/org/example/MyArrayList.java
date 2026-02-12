package org.example;

import java.util.Arrays;

public class MyArrayList {
    int defaultInitialCapacity = 10;
    int currentPosition = 0;
    int[] myArray;

    public MyArrayList(){
        myArray = new int[defaultInitialCapacity];
    }

    public void add(int n){
        if (currentPosition == myArray.length-1){
            int[] newArray;
            newArray = Arrays.copyOf(myArray, myArray.length + defaultInitialCapacity);
            newArray[currentPosition] = n;
            currentPosition += 1;
            myArray = newArray;
        } else {
            myArray[currentPosition] = n;
            currentPosition+=1;
        }
    }

    public int size(){
        return currentPosition;
    }


    //returns boolean value
    public boolean remove(int k){
        //how to handle if kth element doesnt exist

        return true;
    }

    //returns the removed element
    public int remove(String s){
        return 0;
    }

    //remove
    //get
}
