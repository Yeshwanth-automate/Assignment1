import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


            System.out.println("Enter your choice");
            System.out.println("1:employee menu");
            System.out.println("2:project menu");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    DisplayMenu.EmployeeMenu();
                    break;
                case 2:
                    DisplayMenu.projectMenu();
                    break;
            }



    }
}