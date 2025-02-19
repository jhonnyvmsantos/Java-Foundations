package entities;

public class Department {
    private String name;

    public Department() {
        //Vazio...
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
