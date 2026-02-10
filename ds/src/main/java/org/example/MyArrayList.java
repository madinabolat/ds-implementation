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
        if (currentPosition>defaultInitialCapacity-1){
            int[] newArray = new int[defaultInitialCapacity * 2];
            newArray = Arrays.copyOf(myArray, defaultInitialCapacity);
            currentPosition = defaultInitialCapacity;
            newArray[currentPosition] = n;
        } else {
            myArray[currentPosition] = n;
            currentPosition+=1;
        }

    }
}
