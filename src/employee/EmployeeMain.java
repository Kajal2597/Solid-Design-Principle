package employee;

import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        Employee emp1 = new Employee("Ajay", 101, "Ajay@gmail.com");
        Employee emp2 = new Employee("Prasad", 102, "prrasad@gmail.com");
        Employee emp3 = new Employee("Kajal", 103, "kajal@gmail.com");
        Employee emp4 = new Employee("briz", 105, "briz@gmail.com");
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        al.add(emp4);
        for (Employee employee : al) {
            System.out.println(employee);
        }
        al.remove(2);
        System.out.println("After removing 2 index employee");
        for (Employee employee : al) {
            System.out.println(employee);
        }
        Employee updatedEmp = new Employee("Abhishek", 105, "abhishek@gmail.ccom");
        al.set(2, updatedEmp);

        System.out.println("After updating 2 index employee");
        for (Employee employee : al) {
            System.out.println(employee);
        }
    }
}