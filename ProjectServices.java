import java.util.ArrayList;
import java.util.Scanner;

public class ProjectServices {
    public static ArrayList<Project> projects = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    private static String projectname;
    private int id;
    private static String startdate;
    private static String enddate;
    //create project
    public static void createProject() {
        boolean toContinue = true;


        while (toContinue) {

            System.out.println("Enter Project name: ");
            projectname = scanner.next();
            System.out.println("Enter Startdate: ");
            startdate = scanner.next();
            System.out.println("enter Enddate: ");
            enddate= scanner.next();
            Project project = new Project(projectname, startdate, enddate);
            projects.add(project);
            for (Project projectt : projects)
                System.out.println(projectt);
            System.out.println("want to continue(true/false)");
            toContinue = scanner.nextBoolean();

        }
        DisplayMenu.projectMenu();
    }
    //list project
    public static void listProjects(){
        for (Project project : projects)
            System.out.println(project);

    }
    //delete projects
    public static void deleteProjects(){
        System.out.println("enter an project id to be deleted");
        int id = scanner.nextInt();
        boolean isProjectFound = false;

        for (int i = 0; i <= projects.size(); i++) {
            isProjectFound = (projects.get(i).getId() == id);

            if (isProjectFound) {
                projects.remove(i);
                System.out.println(projects);
                break;
            }

        }
        DisplayMenu.projectMenu();

    }
    //add employees to the projects
    public static void addEmployees(){

    }
    //deleting employees from the project
    public static void deletingEmployees(){

    }
    //list employees in the project
    public static void listEmployees(){

    }

}
