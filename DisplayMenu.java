import java.util.Scanner;

public class DisplayMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void EmployeeMenu(){
        System.out.println("Enter your choice: ");
        System.out.println("1:Create employee ");
        System.out.println("2:update employee ");
        System.out.println("3:delete employee ");
        System.out.println("4:List employee ");
        System.out.println("5:Sort employee");
        int choice= scanner.nextInt();

        switch(choice){
            case 1: EmployeeServices.createEmployee();
            break;
            case 2: EmployeeServices.employeeUpdate();
            break;
            case 3: EmployeeServices.employeeDelete();
            break;
            case 4: EmployeeServices.employeeList();
            break;
            case 5: listSort();
            break;
            default:
            System.out.println("Enter a valid choice");
            break;
        }
    }

    public static void listSort(){
        System.out.println("1:ByName ");
        System.out.println("2:ByAge ");
        System.out.println("3:Bysalary ");
        System.out.println("4:ById ");
        int sort= scanner.nextInt();

        switch(sort){
            case 1:Sort.sortByName();
            break;
            case 2:Sort.sortByAge();
            break;
            case 3:Sort.sortBySalary();
            break;
            case 4:Sort.sortById();
            break;
            default:
                System.out.println("enterd invalid option:");
                break;
        }

    }
    public static void projectMenu(){
        System.out.println("1:Create project ");
        System.out.println("2:list project ");
        System.out.println("3:Delete project ");
        System.out.println("4:add employees to the project ");
        System.out.println("5:Deleting employees from the project ");
        System.out.println("6:list employees in the project ");
        int projectoption=scanner.nextInt();

        switch(projectoption){
            case 1:ProjectServices.createProject();
            break;
            case 2:ProjectServices.listProjects();
            break;
            case 3:ProjectServices.deleteProjects();
            break;
            case 4:ProjectServices.addEmployees();
            break;
            case 5:ProjectServices.deletingEmployees();
            break;
            case 6:ProjectServices.listEmployees();
            break;
            default:
                System.out.println("enterd value is invalid:");
                break;

        }
        DisplayMenu.projectMenu();
    }
}
