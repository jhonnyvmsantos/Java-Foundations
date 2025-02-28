package entities;

public class Employee {
    private String name;
    protected Integer hours;
    protected Double valuePerHour;

    public Employee() {
        //Vazio...
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return this.hours * this.valuePerHour;
    }

    //OBS: Nota-se que o método sobreposto numa subclass, se mantém modificado mesmo quando executado dentro da superclass, onde não há sobreposição
    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", payment());
    }
}
