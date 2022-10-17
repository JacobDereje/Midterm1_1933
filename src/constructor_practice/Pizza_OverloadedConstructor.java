package constructor_practice;

public class Pizza_OverloadedConstructor {

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza_OverloadedConstructor(){

    }

    Pizza_OverloadedConstructor(String bread) {
        this.bread = bread;

    }

    Pizza_OverloadedConstructor(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;

    }
    Pizza_OverloadedConstructor(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    Pizza_OverloadedConstructor(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;


    }
}
