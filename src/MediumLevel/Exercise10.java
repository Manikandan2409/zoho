package MediumLevel;
/*10.Implement a hash table data structure in Java using either an array or a linked list.
The hash table should have methods for inserting, deleting, and searching for keys. */

import java.util.LinkedList;

class HashTable{
    private LinkedList<Entry>[]  table;
    private int size;
    private static class Entry{
        Object key;
        Object value;
        Entry(Object key, Object value){
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    HashTable(int size){
        this.size = size;
        table = new LinkedList[size];
    }
    private int hash(Object key) {
        return Math.abs(key.hashCode() % size);
    }
    void insert(Object key, Object value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }
    Object search(Object key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    void delete(Object key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry entry : table[index]) {
                if (entry.key.equals(key)) {
                    table[index].remove(entry);
                    return;
                }
            }
        }
    }
    
}

public class Exercise10 {
    public static void main(String[] args) {
   
        HashTable hashTable = new HashTable(10);
        
        hashTable.insert("key1", "value1");
        hashTable.insert("key2", "value2");
        hashTable.insert("key3", "value3");
        
        
        System.out.println(hashTable.search("key1")); 
        System.out.println(hashTable.search("key4")); 
        
        
        hashTable.delete("key2");
        System.out.println(hashTable.search("key2")); 

    }
}
