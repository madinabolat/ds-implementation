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
        //properly throw exception - need to catch it?
        if (k > currentPosition){
            throw new IndexOutOfBoundsException();
        }
        //why arraylist doesnt have toString? is it coming from Collection or list?

        //decrease index by 1

        //how to handle when you pass object not index
        //but if it is also int (the type), then how does it know?



        return true;
    }


    //remove
    //get
}
