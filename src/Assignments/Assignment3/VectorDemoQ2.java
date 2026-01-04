package Assignments.Assignment3;
import java.util.*;

public class VectorDemoQ2 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        Vector<Integer> v2 = new Vector<>(10);
        Vector<Integer> v3 = new Vector<>(10, 5);
        Vector<Integer> v4 = new Vector<>(Arrays.asList(1, 2, 3));

        v1.addElement(10);
        v1.addElement(20);
        v1.add(30);
        v1.add(40);
        v1.insertElementAt(15, 1);
        
        System.out.println("First: " + v1.firstElement());
        System.out.println("Last: " + v1.lastElement());
        System.out.println("Element at 2: " + v1.elementAt(2));
        System.out.println("Capacity: " + v1.capacity());
        System.out.println("Contains 30? " + v1.contains(30));
        System.out.println("Index of 30: " + v1.indexOf(30));
        
        v1.removeElement(20);
        v1.removeElementAt(0);
        v1.setElementAt(99, 0);
        
        Integer[] arr = new Integer[v1.size()];
        v1.copyInto(arr);
        
        v1.trimToSize();
        v1.removeAllElements();
    }
}