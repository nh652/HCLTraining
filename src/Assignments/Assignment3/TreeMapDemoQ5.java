package Assignments.Assignment3;
import java.util.*;

public class TreeMapDemoQ5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm1 = new TreeMap<>();
        TreeMap<Integer, String> tm2 = new TreeMap<>(Collections.reverseOrder());
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);

        tm1.put(3, "Three");
        tm1.put(1, "One");
        tm1.put(2, "Two");
        tm1.put(5, "Five");
        tm1.put(4, "Four");

        System.out.println("First Key: " + tm1.firstKey());
        System.out.println("Last Key: " + tm1.lastKey());
        System.out.println("First Entry: " + tm1.firstEntry());
        System.out.println("Last Entry: " + tm1.lastEntry());
        
        System.out.println("Lower Key 3: " + tm1.lowerKey(3));
        System.out.println("Higher Key 3: " + tm1.higherKey(3));
        System.out.println("Floor Key 3: " + tm1.floorKey(3));
        System.out.println("Ceiling Key 3: " + tm1.ceilingKey(3));
        
        System.out.println("Head Map 3: " + tm1.headMap(3));
        System.out.println("Tail Map 3: " + tm1.tailMap(3));
        System.out.println("Sub Map 2-4: " + tm1.subMap(2, 4));
        
        tm1.pollFirstEntry();
        tm1.pollLastEntry();
        
        System.out.println("Descending Key Set: " + tm1.descendingKeySet());
    }
}