package org.example;

import java.util.Arrays;

public class MyArrayList {
    int defaultInitialCapacity = 10;
    int currentPosition = 0; // check this, what is it
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

    //add methods:
    //insert element to specific index
    //remove - based on certain element - returns boolean

    //how to handle when you pass object not index
    //but if it is also int (the type), then how does it know?
    public int remove(int k){
        if (k > currentPosition || k < 0){
            throw new IndexOutOfBoundsException();
        }

        int removedElement = myArray[k];
        int[] reducedArray = new int[myArray.length];
        for (int i = 0; i<k; i++){
            reducedArray[i] = myArray[i];
        }
        for (int i = k; i < reducedArray.length-1; i++){
            reducedArray[i] = myArray[i+1];
        }
        reducedArray[reducedArray.length-1] = 0; //pad 0 to the end for the removed element
        currentPosition -= 1;
        myArray = reducedArray;

        return removedElement;
    }

    public int get(int k){
        if (k > currentPosition || k < 0){
            throw new IndexOutOfBoundsException();
        }
        int requestedElement = myArray[k];
        return requestedElement;
    }

    @Override
    public String toString(){
        String s = "[";
        int k = 0;
        while (k < currentPosition){
            s += myArray[k] + ",";
            k++;
        }
        s = s.replaceAll(",$", "");
        s+= "]";
        return s;
    }

}
