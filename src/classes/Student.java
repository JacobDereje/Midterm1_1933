package classes;

public class Student {// classes are a way to create anything and assign them values in order to create objects
    String firstName;
    String lastName;
    double gpa;
    String major;
    int age;
    boolean onProbation;

    public Student (double gpa){
        this.gpa = gpa;
    }

    public boolean isOnHonorRoll() {
        if (this.gpa > 3.5){
            return true;
        }
        return false;
    }
}

