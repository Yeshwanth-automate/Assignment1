import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeServices {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static String name;
    public static int age;
    public static int salary;
    public static int id;

    //creating an employee
    public static void createEmployee() {
        boolean toContinue = true;


        while (toContinue) {

            System.out.println("Enter employee name: ");
            name = scanner.next();
            System.out.println("Enter salary: ");
            salary = scanner.nextInt();
            System.out.println("enter age: ");
            age = scanner.nextInt();
            Employee empl = new Employee(salary, age, name);
            employees.add(empl);
            for (Employee emp : employees)
                System.out.println(emp);
            System.out.println("want to continue(true/false)");
            toContinue = scanner.nextBoolean();

        }
        DisplayMenu.EmployeeMenu();
    }

    //updating employee details
    public static void employeeUpdate() {
        System.out.println("enter an employee id to be updated");
        int id = scanner.nextInt();


        for (int i = 0; i <= employees.size(); i++) {
            boolean isEmployeeFound = (employees.get(i).getEmployeeid() == id);
            System.out.println(isEmployeeFound);
            if (isEmployeeFound) {
                System.out.println("Enter employee name: ");
                name = scanner.next();
                System.out.println("Enter salary: ");
                salary = scanner.nextInt();
                System.out.println("enter age: ");
                age = scanner.nextInt();

                employees.get(i).update(name, salary, age);
                break;
            }

        }
        DisplayMenu.EmployeeMenu();
    }

    ////deleting employee details
    public static void employeeDelete() {
        System.out.println("enter an employee id to be deleted");
        int id = scanner.nextInt();
        boolean isEmployeeFound = false;

        for (int i = 0; i <= employees.size(); i++) {
            isEmployeeFound = (employees.get(i).getEmployeeid() == id);

            if (isEmployeeFound) {
                employees.remove(i);
                System.out.println(employees);
                break;
            }

        }
        DisplayMenu.EmployeeMenu();

    }


    //printing the list of employee deatails
    public static void employeeList() {
        for (Employee emp : employees)
            System.out.println(emp);
    }




}





