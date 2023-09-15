package HashMaps;

import java.util.HashMap;

class LruNode {

    int key;
    int value;
    public LruNode next;
    public LruNode prev;

    public LruNode(int key, int value, LruNode next, LruNode prev) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

}

public class LRUMap {

    HashMap<Integer, LruNode> map;
    LruNode first;
    LruNode last;
    int capacity;

    public LRUMap(HashMap<Integer, LruNode> map, LruNode first, LruNode last) {
        this.map = new HashMap<>();
        this.first = first;
        this.last = last;
        this.capacity = 10;

    }

    public int get(Integer key) {
        // does not exist in the map
        if (map.containsKey(key)) {
            LruNode entry = map.get(key);
            removeFromEnd(entry);
            addToStart(entry);
            return entry.value;

        }
        return -1;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            LruNode node = map.get(key);
            node.value = value;
            removeFromEnd(node);
            addToStart(node);

        } else {
            LruNode newNode = new LruNode(key, value, null, null);
            if (map.size() >= capacity) {
                // evict the last entry
                removeFromEnd(last);
                addToStart(newNode);
            } else {
                addToStart(newNode);
            }
            map.put(key, newNode);
        }

    }

    private void addToStart(LruNode entry) {

        entry.next = first;
        entry.prev = null;

        if (first.prev != null) {
            first.prev = entry;
        }
        first = entry;
        if (last == null) {
            last = first;
        }

    }

    private void removeFromEnd(LruNode entry) {
        if (entry.prev != null) {
            entry.prev.next = null;
        } else {
            first = entry.prev;
        }

        if (entry.next != null) {
            entry.prev.next = entry.next;
        } else {
            last = entry.prev;
        }

    }

}
