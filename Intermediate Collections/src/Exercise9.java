import java.util.LinkedList;

class HashTable<K, V> {
    @SuppressWarnings("hiding")
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] table;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void insert(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    public boolean delete(K key) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                table[index].remove(entry);
                size--;
                return true;
            }
        }
        return false;
    }

    public V search(K key) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }
}

public class Exercise9 {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>(10);

        hashTable.insert("apple", 1);
        hashTable.insert("banana", 2);
        hashTable.insert("cherry", 3);
        
        System.out.println("Search for 'apple': " + hashTable.search("apple")); 
        System.out.println("Search for 'banana': " + hashTable.search("banana")); 
        System.out.println("Search for 'cherry': " + hashTable.search("cherry"));
        System.out.println("Search for 'date': " + hashTable.search("date"));   
        
        System.out.println("Delete 'banana': " + hashTable.delete("banana"));   
        System.out.println("Search for 'banana': " + hashTable.search("banana")); 
        
        System.out.println("Current size: " + hashTable.size()); 
    }
}
