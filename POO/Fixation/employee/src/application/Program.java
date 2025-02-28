package application;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");

            System.out.print("Outsourced (y/n)? ");
            Character outsourced = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced.equals('y')) {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                employees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");

        for (Employee e : employees) {
            System.out.println(e);
        }

        sc.close();
    }
}