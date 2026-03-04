package org.example;

public class MyHashSet {
    MyHashMap map = new MyHashMap();

    public boolean add(int k){
        return map.put(k,0) != -1; //with generics - null
    }

    public boolean remove(int k){
        return map.remove(k) != -1;
    }

    public boolean contains(int k){
        return map.containsKey(k);
    }

    public int size(){
        return map.size();
    }

    public boolean isEmpty(){
        return map.isEmpty();
    }

    @Override
    public String toString(){
        String s = "{";
        for (int i : map.keySet()){
            s += i + ", ";
        }
        s = s.replaceAll(", $", "");
        s+= "}";
        return s;
    }
}
