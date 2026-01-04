package Assignments.Assignment3;
import java.util.*;

public class ArrayListDemoQ1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(20);
        List<String> temp = Arrays.asList("Java", "Python");
        ArrayList<String> list3 = new ArrayList<>(temp);

        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");
        list1.add(1, "Mango");
        list1.addAll(list3);

        System.out.println("Element at index 2: " + list1.get(2));
        list1.set(0, "Grapes");
        System.out.println("Contains 'Mango'? " + list1.contains("Mango"));
        System.out.println("Index of 'Java': " + list1.indexOf("Java"));
        
        list1.add("Grapes");
        System.out.println("Last Index of 'Grapes': " + list1.lastIndexOf("Grapes"));
        
        list1.remove(1);
        list1.remove("Cherry");
        
        System.out.println("Size: " + list1.size());
        System.out.println("Is Empty? " + list1.isEmpty());
        
        List<String> sub = list1.subList(0, 2);
        System.out.println("SubList: " + sub);
        
        Object[] arr = list1.toArray();
        System.out.println("Array: " + Arrays.toString(arr));
        
        list1.clear();
        System.out.println("After clear: " + list1);
    }
}