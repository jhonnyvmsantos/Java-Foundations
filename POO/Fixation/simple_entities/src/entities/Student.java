package entities;

public class Student {
    public String name;
    public double[] grade = {
            0, 0, 0
    };

    public double finalGrade() {
        return grade[0] + grade[1] + grade[2];
    }

    public double missingGrade() {
        return Math.abs(finalGrade() - 60);
    }

    public boolean finalResult() {
        return finalGrade() >= 60;
    }
}
