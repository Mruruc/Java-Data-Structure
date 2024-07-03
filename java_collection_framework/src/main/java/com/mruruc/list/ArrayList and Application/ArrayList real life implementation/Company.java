package Java_Collections;
/*Implement a program that maintains a list of employees in a company. The program should allow the user to:

  Add an employee: The user should be able to enter the employee's name, age, and salary.
  Remove an employee: The user should be able to remove an employee by entering their name.
  Display all employees: The program should display the details of all employees in the list.
  You can use an ArrayList to store the employees, and create a separate Employee class to represent each employee.
  You can use a Scanner object to get user input,
  and create a menu-based interface to allow the user to perform the actions listed above.*/

import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public boolean addEmployee(Employee employee) {
        employees.add(employee);
        return true;
    }

    public Employee find(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(String name) {
        employees.remove(find(name));
    }


    public void showAllEmployee() {
        for (Employee employees1 : employees) {
            System.out.println("Name: " + employees1.name + "\nAge: " + employees1.age + "\n Salary: " + employees1.salary);
            System.out.println("====================================");
        }

    }

    static class Employee {
        private String name;
        private Integer age;
        private Double salary;

        public Employee(String name, Integer age, Double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }
}
