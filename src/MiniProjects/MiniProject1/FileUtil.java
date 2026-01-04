package MiniProjects.MiniProject1;

import java.io.*;

public class FileUtil {
    private static final String FILE = "bankdata.dat";

    public static void save(Account acc) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(acc);
        } catch (Exception e) {
            System.out.println("File write error");
        }
    }

    public static Account load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
            return (Account) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
