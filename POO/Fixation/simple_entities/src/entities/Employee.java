package entities;

public class Employee {
    public String name;
    public double grossSalary, tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary / percentage;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}
