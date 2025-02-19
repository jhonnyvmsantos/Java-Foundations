package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Department department;
    //Ao declarar uma lista num classe, não o atribua ao constructor (Instancie-a por padrão na classe)
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker() {
        //Vazio...
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        //Instanciando um obj "Calendar"
        Calendar cal = Calendar.getInstance();

        for (HourContract element : contracts) {
            //"Setando" a data do contrato no Calendar instanciado
            cal.setTime(element.getDate());

            //Retornando o mes e ano do calendar instanciado em um numero inteiro
            int e_year = cal.get(Calendar.YEAR);
            int e_month = cal.get(Calendar.MONTH) + 1; //"+1" add porque os meses começam em "0"

            if (e_year == year && e_month == month) {
                sum += element.totalValue();
            }
        }

        return sum;
    }

}
