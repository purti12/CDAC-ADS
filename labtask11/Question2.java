
package LabTask11;
class HashNode {
    int key;
    String value;
    HashNode next;

    public HashNode(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class HashTable {
    private HashNode[] bucketArray;
    private int numBuckets;

    public HashTable(int numBuckets) {
        this.numBuckets = numBuckets;
        bucketArray = new HashNode[numBuckets];

        for (int i = 0; i < numBuckets; i++) {
            bucketArray[i] = null;
        }
    }

    private int getBucketIndex(int key) {
        return key % numBuckets;
    }

    public String get(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucketArray[bucketIndex];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public void put(int key, String value) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucketArray[bucketIndex];

        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        head = bucketArray[bucketIndex];
        HashNode newNode = new HashNode(key, value);
        newNode.next = head;
        bucketArray[bucketIndex] = newNode;
    }

    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = bucketArray[bucketIndex];
        HashNode prev = null;

        while (head != null && head.key != key) {
            prev = head;
            head = head.next;
        }

        if (head == null) {
      
            return;
        }

        if (prev != null) {
            prev.next = head.next;
        } else {
            bucketArray[bucketIndex] = head.next;
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(11, "Eleven");
        hashTable.put(21, "Twenty-One");

        System.out.println("Value for key 2: " + hashTable.get(2));
        System.out.println("Value for key 11: " + hashTable.get(11));

        hashTable.remove(2);
        System.out.println("Value for key 2 after removal: " + hashTable.get(2));
    }
}
