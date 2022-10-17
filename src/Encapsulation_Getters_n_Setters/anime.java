package Encapsulation_Getters_n_Setters;

public class anime {
    private String Name;
    private String Genre;
    private String Studio;
    private int malScore;

    public anime(String name, String genre, String studio, int malScore) {
        Name = name;
        Genre = genre;
        Studio = studio;
        this.malScore = malScore;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getStudio() {
        return Studio;
    }

    public void setStudio(String studio) {
        Studio = studio;
    }

    public int getMalScore() {
        return malScore;
    }

    public void setMalScore(int malScore) {
        this.malScore = malScore;
    }
}
