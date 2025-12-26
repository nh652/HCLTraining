package Assignment02;
import java.util.*;

class EmployeeManagerQ4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "HR");
        map.put(2, "IT");

        for (var e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        map.remove(1);

        TreeMap<Integer, String> sorted = new TreeMap<>(map);
        System.out.println(sorted);
    }
}
