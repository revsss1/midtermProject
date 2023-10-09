import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Salary> list = new ArrayList<>();

        // Initialize the first Salary object

        while (true) {
            System.out.println("Enter details for the first employee:");
            System.out.println("Company: \n>Shell\n>Omanoil");
            System.out.print("Type Company name: ");
            String company1 = input.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive check
            System.out.print("Category (T/S): ");
            char category1 = input.next().charAt(0);
            input.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name1 = input.nextLine();
            System.out.print("Basic Salary: ");
            double basic1 = input.nextDouble();
            input.nextLine();

            if (isValidInput(company1, category1)) {
                Salary salary1 = new Salary(company1, category1, name1, basic1);
                list.add(salary1);
                System.out.println("Employee added to the list. Please press enter");
                break;
            } else {
                System.out.println("Invalid company or category. Please check your input.");
                System.out.print("Please press enter");
                input.nextLine();
            }
        }

        // Initialize the second Salary object
        while (true) {
            input.nextLine(); // Consume the newline character
            System.out.println("\nEnter details for the second employee:");
            System.out.println("Company: \n>Shell\n>Omanoil");
            System.out.print("Type Company name: ");
            String company2 = input.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive check
            System.out.print("Category (T/S): ");
            char category2 = input.next().charAt(0);
            input.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name2 = input.nextLine();
            System.out.print("Basic Salary: ");
            double basic2 = input.nextDouble();

            if (isValidInput(company2, category2)) {
                Salary salary2 = new Salary(company2, category2, name2, basic2);
                list.add(salary2);
                System.out.println("Employee added to the list. Please press enter");
                break;
            } else {
                System.out.println("Invalid company or category. Please check your input.");
                System.out.print("Please press enter");
                input.nextLine();
            }
        }

        // print details
        for (Salary salary : list) {
            printEmployeeDetails(salary);
        }

        input.close();
    }

    static boolean isValidInput(String company, char category) {
        return (company.equals("OMANOIL") && category == 'S') ||
                (company.equals("SHELL") && category == 'T');
    }

    static boolean checkInput(String company, char category) {
        if (("Shell".equals(company) && category == 'T') || ("Omanoil".equals(company) && category == 'S')) {
            return true;
        } else {
            return false;
        }
    }

    static void printEmployeeDetails(Salary salary) {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Name  :   " + salary.getName());
        salary.printEmployeeDetails();
        System.out.println("Name           :   " + salary.getName());
        System.out.println("Basic Pay      :   " + salary.getbasic());
    }

}
