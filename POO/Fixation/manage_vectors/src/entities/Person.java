package entities;

public class Person {

    private String name;
    private String gender;
    private int age;
    private double height, weight;

    public Person(String name, String gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        if (gender != null) {
            return "Nome: " + name + " | Genero: " + gender + " | Idade: " + age + " | Altura: " + height + " | Peso: " + weight;
        } else {
            return "Nome: " + name + " | Idade: " + age + " | Altura: " + height + " | Peso: " + weight;
        }
    }
}
