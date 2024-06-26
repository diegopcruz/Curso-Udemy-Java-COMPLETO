package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee oficial = new Employee();
        System.out.print("Name: ");
        oficial.name = sc.nextLine();

        System.out.print("Gross salary: ");
        oficial.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        oficial.tax = sc.nextDouble();

        System.out.println();
        System.out.println(oficial);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double salary = sc.nextDouble();
        oficial.increaseSalary(salary);

        System.out.println();
        System.out.print("Updated date: " + oficial);
        System.out.println();

        sc.close();

    }
}