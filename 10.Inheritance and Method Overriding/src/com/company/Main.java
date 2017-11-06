package com.company;

class Employee {
    public void DisplayEmployee() {
        System.out.println("Displaying the Employee Base class!!");
    }
}

class PartTimeEmployee extends Employee {
    public void DisplayEmployee() {
        System.out.println("Displaying the PartTimeEmployee!!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Inheritance and Method Overriding\n\n");

        Employee EE = new Employee();
        EE.DisplayEmployee();

        //This is Method Overriding
        PartTimeEmployee PT = new PartTimeEmployee();
        PT.DisplayEmployee();

    }
}
