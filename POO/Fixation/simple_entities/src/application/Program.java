package application;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //Para executar algum dos exercicios de fixação, retire os comentários, deixando APENAS 1 não comentado (Em funcionamento)

//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        Rectangle rectangle = new Rectangle();
//
//        System.out.print("Enter the rectangle width and height: ");
//        rectangle.width = sc.nextDouble();
//        rectangle.height = sc.nextDouble();
//
//        System.out.println("Area = " + rectangle.area());
//        System.out.println("Perimeter = " + rectangle.perimeter());
//        System.out.println("Diagonal = " + rectangle.diagonal());
//
//        sc.close();
//    }


//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        Employee employee = new Employee();
//
//        System.out.println("Enter the employee data:");
//
//        System.out.print("Name: ");
//        employee.name = sc.nextLine();
//
//        System.out.print("Gross Salary: ");
//        employee.grossSalary = sc.nextDouble();
//
//        System.out.print("Tax: ");
//        employee.tax = sc.nextDouble();
//
//        System.out.println("Employee: " + employee);
//
//        System.out.print("Which percentage to increase salary? ");
//        employee.increaseSalary(sc.nextDouble());
//
//        System.out.println("Updated Data: " + employee);
//
//        sc.close();
//    }


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        int count = 0;
        boolean result;

        System.out.println("Enter the student data:");

        System.out.print("Name: ");
        student.name = sc.nextLine();

        while (count < 3) {
            System.out.printf("%d° Tri. grade (%s max): ", count + 1, (count == 0) ? "30" : "35");
            student.grade[count] = sc.nextDouble();

            if (count == 0) {
                if (student.grade[count] <= 30) count++;
            } else {
                if (student.grade[count] <= 35) count++;
            }
        }

        System.out.println("Final Grade: " + student.finalGrade());

        result = student.finalResult();
        System.out.println(result ? "Pass" : "Failed");

        if (!result) System.out.printf("Missing %.2f points", student.missingGrade());

        sc.close();
    }

}