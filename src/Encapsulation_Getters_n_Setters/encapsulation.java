package Encapsulation_Getters_n_Setters;
// Encapsulation = attributes of a class will be hidden or private,
// can be accessed only through methods (getters and setters)
// You should make attributes private if you don't have a reasons to amke them public/protected
public class encapsulation {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model x", 2022);

        car.setYear(2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        anime anime = new anime("Ore Monogatari","Romance","Studio MadHouse",9);

        System.out.println(anime.getMalScore());


    }

}
