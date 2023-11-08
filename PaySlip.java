package main;
import java.util.ArrayList;
import java.util.Scanner;

public class PaySlip {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter the Emp_Name : ");
            String name = scanner.next();
            System.out.print("Enter the Emp_id : ");
            String id = scanner.next();
            System.out.print("Enter the Address : ");
            String address = scanner.next();
            System.out.print("Enter the Mail_id : ");
            String mail = scanner.next();
            System.out.print("Enter the Mobile_no : ");
            String mobile = scanner.next();
            System.out.print("Enter the Designation : ");
            String designation = scanner.next();
            System.out.print("Enter the Basic_Pay : ");
            float basicPay = scanner.nextFloat();

            Employee employee;
            if (designation.equalsIgnoreCase("Programmer")) {
                employee = new Programmer(name, id, address, mail, mobile, basicPay);
            } else if (designation.equalsIgnoreCase("Professor")) {
                employee = new Professor(name, id, address, mail, mobile, basicPay);
            } else if (designation.equalsIgnoreCase("AssistantProfessor")) {
                employee = new AssistantProfessor(name, id, address, mail, mobile, basicPay);
            } else if (designation.equalsIgnoreCase("AssociateProfessor")) {
                employee = new AssociateProfessor(name, id, address, mail, mobile, basicPay);
            } else {
                System.out.println("Invalid designation. Defaulting to Employee.");
                employee = new Employee(name, id, address, mail, mobile);
            }

            employees.add(employee);

            System.out.println("Do you want to continue? Press 'y' to continue or any other key to stop: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y');

        scanner.close();

        System.out.println("------------ Employees Pay Slips ------------");
        for (Employee emp : employees) {
            if (emp instanceof Programmer) {
                ((Programmer) emp).paySlip();
            } else if (emp instanceof Professor) {
                ((Professor) emp).paySlip();
            } else if (emp instanceof AssistantProfessor) {
                ((AssistantProfessor) emp).paySlip();
            } else if (emp instanceof AssociateProfessor) {
                ((AssociateProfessor) emp).paySlip();
            }
        }
        System.out.println("------------ End of the Statements -----------");
    }
}