public class params_and_methods {
    // This is the main of the code. It runs what code we've written
    public static void main(String[] args) {
      printInfo("Jacob", 20);
      int sum = add(2,4); //sum is equal to
      int result = sum * 15; // result is equal to
        System.out.println(sum);
        System.out.println(result);
        int mult = multiply(3,5); // mult is equal to
        System.out.println(mult);


    }

    /**
     * @printInfo is the name of the method
     * @param name is the name of the person
     * @param age is the age of teh person
     */
    public static void printInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old ");
    }

    /**
     * adds two numbers and returns them
     * @param x a number
     * @param y a number
     * @return This returns x + y, so we can use it as an integer value, to assign it to other things
     */
    public static int add(int x, int y){
    //System.out.println(x + " plus " + y + " is " + (x+y));
    return (x+y);
    }

    /**
     * multiplies two numbers
     * @param a a number
     * @param b a number
     * @return the multiplied number as an int
     */
    public static int multiply(int a, int b ){
    return (a * b);
    }

}
