package org.example;

public class MyHashMap {
    class Node{
        int key;
        int value;
        int hash;
        Node next;

        Node(int key, int value, int hash, Node next){
            this.key = key;
            this.value = value;
            this.hash = hash; //should I calculate hash?
            this.next = next;
        }
    }

    Node[] buckets = new Node[16];
    int size = 0;

    public int getHash(int key){
        return Integer.hashCode(key);
    }
    public int getIndex(int key){
        int hash = getHash(key);
        return hash & (buckets.length-1);
    }

    public int put(int key, int value){
        int hash = getHash(key);
        int index = getIndex(key);
        Node node = new Node(key, value, hash, null);
        if (buckets[index]==null){
            buckets[index] = node;
            size += 1;
        } else {
            Node temp = buckets[index];
            while (temp != null){
                if (temp.key == key){
                    int previousValue = temp.value;
                    temp.value = value;
                    return previousValue;
                }
                if (temp.next != null){
                    temp = temp.next;
                } else {
                    temp.next = node;
                    size += 1;
                }
            }
        }
        return -1; //should return null with generics
    }

    public int size(){
        return size;
    }

    public int remove(int key){
        int index = getIndex(key);
        if (buckets[index]==null){
            return -1;
        } else {
            Node temp = buckets[index];
            if (temp.key == key){
                int value = buckets[index].value;
                buckets[index] = buckets[index].next;
                size--;
                return value;
            }
            while (temp != null) {
                if (temp.next.key == key) {
                    int value = temp.next.value;
                    temp.next = temp.next.next;
                    size--;
                    return value;
                }
                temp = temp.next;
            }
        }
        return -1; //should return null with generics
    }

    public int get(int key){
        int index = getIndex(key);
        if (buckets[index]==null){
            return -1;
        } else {
            Node temp = buckets[index];
            while (temp != null) {
                if (temp.key == key) {
                    return temp.value;
                }
                temp = temp.next;
            }
        }
        return -1; //should return null with generics
    }


    public boolean containsKey(int key){
        return get(key)!=-1; //with generics null

    }

//   implement: keySet, entrySet

    @Override
    public String toString(){
        String s = "{";
        for (Node node : buckets){
            while (node != null){
                s += node.key + "=" + node.value + ", ";
                node = node.next;
            }
        }
        s = s.replaceAll(", $", "");
        s += "}";
        return s;
    }
}
