
//https://leetcode.com/problems/design-hashset/
//705. Design HashSet
public class MyHashSet {

    private final LinkedList<Integer>[] arr;
    private final int size;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        this.size = 16;
        this.arr = new LinkedList[this.size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        if(!contains(key))
            arr[hash(key)].add(key);
    }

    public void remove(int key) {
        arr[hash(key)].remove(Integer.valueOf(key));
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return arr[hash(key)].contains(key);
    }

    private int hash(int data) {
        return data % size;
    }
}