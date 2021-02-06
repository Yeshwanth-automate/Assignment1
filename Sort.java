import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static void sortByName () {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortById () {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getEmployeeId() > o2.getEmployeeId())
                    return 1;
                else if (o1.getEmployeeId() < o2.getEmployeeId())
                    return -1;
                else
                    return 0;
            }
        });
        for (int i = 0; i < EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }
    }
    public static void sortByAge () {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getAge() > o2.getAge())
                    return 1;
                else if (o1.getAge() < o2.getAge())
                    return -1;
                else
                    return 0;
            }
        });
        for (int i = 0; i < EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortBySalary () {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getSalary() > o2.getSalary())
                    return 1;
                else if (o1.getSalary() < o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
        for (int i = 0; i < EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
}