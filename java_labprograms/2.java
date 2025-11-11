// EmployeeInfo.java
import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Employee Information System ===");

        // Taking user input using Scanner
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = sc.nextDouble();

        // Display employee details
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name         : " + name.toUpperCase());
        System.out.println("Employee ID  : " + empId);
        System.out.println("Department   : " + dept);
        System.out.println("Designation  : " + designation);
        System.out.println("Base Salary  : ₹" + baseSalary);

        // Handle Command-line Arguments for Batch Update
        if (args.length > 0) {
            System.out.println("\n--- Batch Update (via Command-line Arguments) ---");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Updated Info " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("\nNo command-line batch updates found.");
        }

        sc.close();
    }
}
