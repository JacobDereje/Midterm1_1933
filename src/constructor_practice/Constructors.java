package constructor_practice;

public class Constructors { // Constructors are pretty much classes, but you can put methods into them
    public static void main(String[] args) {

        cat mycat = new cat("Adam", 19);
        System.out.println(mycat.name + " " + mycat.age);


        Pizza_OverloadedConstructor pizza = new Pizza_OverloadedConstructor("Thick Crust", "Tomato", "Mozzarella", "Pineapple"); // This here is what im talking about. compared to classes where you have to do all the coding in the file you're importing this to you can just do it there

        // You can remove any element of this list and the code will function properly
        System.out.println("Here are the ingredients of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

    }

}
