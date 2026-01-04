package Assignments.Assignment3;
import java.util.*;

public class HashMapDemoQ3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>(20);
        HashMap<Integer, String> map3 = new HashMap<>(20, 0.8f);
        HashMap<Integer, String> map4 = new HashMap<>(map1);

        map1.put(101, "Alice");
        map1.put(102, "Bob");
        map1.put(103, "Charlie");
        map1.putIfAbsent(101, "Dave");
        
        System.out.println("Value for 102: " + map1.get(102));
        System.out.println("Get 105: " + map1.getOrDefault(105, "Not Found"));
        System.out.println("Contains Key 101? " + map1.containsKey(101));
        System.out.println("Contains Value 'Bob'? " + map1.containsValue("Bob"));
        
        map1.replace(102, "Bobby");
        map1.remove(103);
        
        System.out.println("Key Set: " + map1.keySet());
        System.out.println("Values: " + map1.values());
        System.out.println("Entry Set: " + map1.entrySet());
        System.out.println("Size: " + map1.size());
        
        map1.forEach((k, v) -> System.out.println(k + "=" + v));
        map1.clear();
    }
}