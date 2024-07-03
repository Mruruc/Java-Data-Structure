package Java_Collections;

import java.util.Scanner;

public class CompanyImplementation {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("To add employee enter 1:\n" +
                    "To remove an employee enter 2:\n" +
                    "To see list of all employees enter 3:\n" +
                    "To log out enter 4:");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter employee name:");
                    String name = scan.nextLine();
                    System.out.println("Enter employee age:");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee salary:");
                    double salary = scan.nextDouble();
                    if (company.addEmployee(new Company.Employee(name, age, salary))) {
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Unsuccessful!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the employee you want to remove:");
                    String namee = scan.nextLine();
                    company.removeEmployee(namee);
                    break;
                case 3:
                    System.out.println("Here is the complete list of employees:");
                    company.showAllEmployee();
                    break;
                case 4:
                    System.out.println("Goodbye :)");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
