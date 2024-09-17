package musical_shop;

import java.util.ArrayList;

public class Medium {
    String author;
    String genre;
    int year_of_manufacture;
    double total_duration_of_sound;
    ArrayList<Composition> song;
    Collection collection;

    public Medium(String author, String genre, int year_of_manufacture, double total_duration_of_sound) {
        this.author = author;
        this.genre = genre;
        this.year_of_manufacture = year_of_manufacture;
        this.total_duration_of_sound = total_duration_of_sound;
        this.song = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear_of_manufacture() {
        return year_of_manufacture;
    }

    public void setYear_of_manufacture(int year_of_manufacture) {
        this.year_of_manufacture = year_of_manufacture;
    }

    public double getTotal_duration_of_sound() {
        return total_duration_of_sound;
    }

    public void setTotal_duration_of_sound(double total_duration_of_sound) {
        this.total_duration_of_sound = total_duration_of_sound;
    }

    public ArrayList<Composition> getSong() {
        return song;
    }
    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public void addSong(Composition song1){
        song.add(song1);
    }
    public void removeSong(Composition song2){
        song.remove(song2);
    }
}
