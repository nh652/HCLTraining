package MiniProjects.MiniProject2;

import java.io.*;
import java.util.ArrayList;

public class FileUtil {
    private static final String FILE = "employees.dat";

    public static void save(ArrayList<Employee> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("File error");
        }
    }

    public static ArrayList<Employee> load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
