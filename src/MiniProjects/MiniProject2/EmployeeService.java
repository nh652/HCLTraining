package MiniProjects.MiniProject2;

import java.util.*;

public class EmployeeService {
    ArrayList<Employee> list = FileUtil.load();

    public void add(Employee e) {
        for (Employee emp : list)
            if (emp.id == e.id)
                throw new RuntimeException("ID must be unique");
        list.add(e);
        FileUtil.save(list);
    }

    public void display() {
        list.forEach(e ->
                System.out.println(e.id + " " + e.name + " " + e.dept + " " + e.salary));
    }

    public Employee search(int id) {
        return list.stream().filter(e -> e.id == id).findFirst().orElse(null);
    }

    public void delete(int id) {
        list.removeIf(e -> e.id == id);
        FileUtil.save(list);
    }

    public void updateSalary(int id, double sal) {
        if (sal <= 0) throw new RuntimeException("Salary must be positive");
        Employee e = search(id);
        if (e != null) e.salary = sal;
        FileUtil.save(list);
    }
}
