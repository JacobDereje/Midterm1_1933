public class Single_Dimensional_Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[5]; // one line
        numbers[0] = 5; // {5,0,0,0,0}
        numbers[2] = 8; // {5,0,8,0,0}
        numbers[4] = 10; // {5,0,8,0,4}
        System.out.println(numbers[0]); // prints out the [0] value
        for (int i = 0; i< numbers.length;i++) {
            System.out.println(numbers[i] + "");
        }


        int[] othernumbers = {5,0,8,0,9}; // makes array in one line
        for (int j = 0; j<othernumbers.length; j++){
            System.out.println(othernumbers[j] + "");


        }
    }

}
