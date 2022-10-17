package constructor_practice;


public class cat {
    String name;
    int age;
public cat(String name){
    this.name = name;
}
    public cat(int age){
        this.age = age;
    }
    public cat(String name, int age){
        this.name = name;
        this.age = age;
    }
}
