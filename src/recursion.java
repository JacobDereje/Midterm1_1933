public class recursion {
    public static void main(String[] args) {
        walkIterative(10);
        walkRecursive(10);
        System.out.println(factorial(5));;
        System.out.println(power(2,8));
    }
    private static void walkIterative(int steps){ //Iterative
        for (int i = 0; i<steps; i++){
            //System.out.println("You take a step.");
        }
    }
    private static void walkRecursive(int steps){ //Recursive
        if(steps<1) return;//base case
        System.out.println("You take a step.");
        walkRecursive(steps-1); // recursive case
    }
    private static  int factorial(int num){
        if (num<1) return 1; //base case
        return num*factorial(num - 1); // recursive case
    }
    private static int power(int base, int expo){
        if (expo<1) return 1; //base
        return base * power(base, expo -1); //recursive case

    }
}
