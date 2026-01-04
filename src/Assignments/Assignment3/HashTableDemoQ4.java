package Assignments.Assignment3;
import java.util.*;

public class HashTableDemoQ4 {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht1 = new Hashtable<>();
        Hashtable<String, Integer> ht2 = new Hashtable<>(20);
        Hashtable<String, Integer> ht3 = new Hashtable<>(20, 0.75f);
        Hashtable<String, Integer> ht4 = new Hashtable<>(ht1);

        ht1.put("Math", 90);
        ht1.put("Science", 85);
        ht1.put("English", 88);
        
        System.out.println("Get Math: " + ht1.get("Math"));
        System.out.println("Contains Key 'Science'? " + ht1.containsKey("Science"));
        System.out.println("Contains Value 90? " + ht1.containsValue(90));
        
        ht1.putIfAbsent("History", 75);
        ht1.replace("Math", 95);
        ht1.remove("English");
        
        Enumeration<String> keys = ht1.keys();
        while(keys.hasMoreElements()) System.out.println(keys.nextElement());
        
        Enumeration<Integer> values = ht1.elements();
        while(values.hasMoreElements()) System.out.println(values.nextElement());
        
        System.out.println("Key Set: " + ht1.keySet());
        System.out.println("Entry Set: " + ht1.entrySet());
        System.out.println("Size: " + ht1.size());
        System.out.println("Is Empty? " + ht1.isEmpty());
        
        ht1.clear();
    }
}