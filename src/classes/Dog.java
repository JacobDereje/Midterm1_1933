package classes;

public class Dog {
    int age; // instance variable (nonstatic fields); unique to each instance of class
   String name;
   int numberofLegs = 4; // static fields remain the same, all dogs have 4 legs, thus this will never change, thus it is static
    public void about(int a, String name){ // Parameters are declared within a methods signature and are passed into a method. I.E int age = x , jacob.age(x)
        int nextYear = a + 1; // local variable, only visible within the method it was made (in the curly brace)
        System.out.println(name +" is " + age + ".");
        System.out.println("All dogs have " + numberofLegs +" legs.");
        System.out.println("Next year, this dog will be " + nextYear + " years old.");
    };

}
