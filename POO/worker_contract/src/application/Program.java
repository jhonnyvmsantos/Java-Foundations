package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //System.out.print("");

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.println("Enter Worker data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n_contracts = sc.nextInt();

        for (int i = 0; i < n_contracts; i++) {
            System.out.printf("Enter contract #%d data: \n", (i + 1));

            System.out.print("Date (DD/MM/YYYY): ");
            Date contract_date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            worker.addContract(new HourContract(contract_date, valuePerHour, hours));
        }
        System.out.println();

        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        String[] income_date = sc.next().split("/");

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());

        System.out.printf("Income: R$%.2f\n", worker.income(Integer.parseInt(income_date[1]), Integer.parseInt(income_date[0])));

        sc.close();
    }
}