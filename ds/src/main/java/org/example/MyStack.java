package org.example;

public class MyStack {
    MyArrayList arrayList;

    public MyStack(){
        arrayList = new MyArrayList();
    }


    public void push(int n){
        arrayList.add(n);
    }

    public int getLastElementIndex(){
        return arrayList.size() - 1;
    }

    public void checkIfStackEmpty(){
        if (arrayList.size() == 0){
            throw new IndexOutOfBoundsException("The stack is empty");
        }
    }


    public int peek(){
        checkIfStackEmpty();
        int lastElementIndex = getLastElementIndex();
        return arrayList.get(lastElementIndex);
    }

    public int pop(){
        checkIfStackEmpty();
        int lastElementIndex = getLastElementIndex();
        return arrayList.remove(lastElementIndex);
    }

    @Override
    public String toString(){
        return arrayList.toString();
    }

}
