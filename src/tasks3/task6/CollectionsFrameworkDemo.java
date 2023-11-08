package tasks3.task6;

import java.util.*;

public class CollectionsFrameworkDemo {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Cat");
        System.out.println("LinkedList: " + linkedList);

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(6, "Six");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Dog");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Cat");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Lion");
        treeSet.add("Tiger");
        System.out.println("TreeSet: " + treeSet);

        // TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(7, "Seven");
        treeMap.put(8, "Eight");
        treeMap.put(9, "Nine");
        System.out.println("TreeMap: " + treeMap);
    }
}
