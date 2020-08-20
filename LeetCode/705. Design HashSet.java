
//https://leetcode.com/problems/design-hashset/
//705. Design HashSet

class MyHashSet {
/** Initialize your data structure here. */
boolean[] arr=new boolean[1000000];

public MyHashSet() {
    
}

public void add(int key) {
    arr[key]=true;
}

public void remove(int key) {
    arr[key]=false;
}

/** Returns true if this set contains the specified element */
public boolean contains(int key) {
    return arr[key];
}

}