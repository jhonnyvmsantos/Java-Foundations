package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list =  new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int qtd = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < qtd; i++) {
            System.out.printf("Employee #%d\n", (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }

        System.out.println("List of employees: ");
        for (Employee e : list) {
            System.out.println(e.toString());
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee temp = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

        if (temp != null) {
            System.out.print("Enter the percentage (0.0): ");
            int per = sc.nextInt();

            double total = temp.getSalary() + (temp.getSalary() * (per / 100.0));
            temp.setSalary(total);
        } else {
            System.out.println("This id does not exist!");
        }

        System.out.println((temp != null) ? "List of employees (Updated): " : "List of employees: ");
        for (Employee e : list) {
            System.out.println(e.toString());
        }

        sc.close();
    }
}