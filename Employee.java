package main;

public class Employee {
	String Emp_name, Emp_id, Address, Mail_id, Mobile_no;
    Employee(String name, String id, String address, String mail, String mobile) {
        Emp_name = name;
        Emp_id = id;
        Address = address;
        Mail_id = mail;
        Mobile_no = mobile;
    }
    void display() {
        System.out.println("Emp_Name : " + Emp_name);
        System.out.println("Emp_id : " + Emp_id);
        System.out.println("Address : " + Address);
        System.out.println("Mail_id : " + Mail_id);
        System.out.println("Mobile_no : " + Mobile_no);
    }
}

class Programmer extends Employee {
    float bPay;

    Programmer(String name, String id, String address, String mail, String mobile, float basicPay) {
        super(name, id, address, mail, mobile);
        bPay = basicPay;
    }

    void paySlip() {
        float da = bPay * 97 / 100;
        float hra = bPay * 10 / 100;
        double grossSalary = bPay + da + hra;
        float pf = bPay * 12 / 100;
        double scf = bPay * 0.1 / 100;
        double netSalary = grossSalary - pf - scf;

        display();
        System.out.println("---------PROGRAMMER---------");
        System.out.println("  Designation : Programmer");
        System.out.println("    Basic_Pay : " + bPay);
        System.out.println(" Gross Salary : " + grossSalary);
        System.out.println("   Net Salary : " + netSalary);
        System.out.println("----------------------------");
    }
}

class AssistantProfessor extends Employee {
    float bPay;

    AssistantProfessor(String name, String id, String address, String mail, String mobile, float basicPay) {
        super(name, id, address, mail, mobile);
        bPay = basicPay;
    }

    void paySlip() {
        float da = bPay * 97 / 100;
        float hra = bPay * 10 / 100;
        double grossSalary = bPay + da + hra;
        float pf = bPay * 12 / 100;
        double scf = bPay * 0.1 / 100;
        double netSalary = grossSalary - pf - scf;

        display();
        System.out.println("---------ASSISTANT-PROFESSOR---------");
        System.out.println("  Designation : Assistant Professor");
        System.out.println("    Basic_Pay : " + bPay);
        System.out.println(" Gross Salary : " + grossSalary);
        System.out.println("   Net Salary : " + netSalary);
        System.out.println("-------------------------------------");
    }
}

class AssociateProfessor extends Employee {
    float bPay;

    AssociateProfessor(String name, String id, String address, String mail, String mobile, float basicPay) {
        super(name, id, address, mail, mobile);
        bPay = basicPay;
    }

    void paySlip() {
        float da = bPay * 97 / 100;
        float hra = bPay * 10 / 100;
        double grossSalary = bPay + da + hra;
        float pf = bPay * 12 / 100;
        double scf = bPay * 0.1 / 100;
        double netSalary = grossSalary - pf - scf;

        display();
        System.out.println("---------ASSOCIATE-PROFESSOR---------");
        System.out.println("  Designation : Associate Professor");
        System.out.println("    Basic_Pay : " + bPay);
        System.out.println(" Gross Salary : " + grossSalary);
        System.out.println("   Net Salary : " + netSalary);
        System.out.println("-------------------------------------");
    }
}

class Professor extends Employee {
    float bPay;
    Professor(String name, String id, String address, String mail, String mobile, float basicPay) {
        super(name, id, address, mail, mobile);
        bPay = basicPay;
    }
    void paySlip() {
        float da = bPay * 97 / 100;
        float hra = bPay * 10 / 100;
        double grossSalary = bPay + da + hra;
        float pf = bPay * 12 / 100;
        double scf = bPay * 0.1 / 100;
        double netSalary = grossSalary - pf - scf;

        display();
        System.out.println("---------PROFESSOR---------");
        System.out.println("  Designation : Professor");
        System.out.println("    Basic_Pay : " + bPay);
        System.out.println(" Gross Salary : " + grossSalary);
        System.out.println("   Net Salary : " + netSalary);
        System.out.println("---------------------------");
    }
}