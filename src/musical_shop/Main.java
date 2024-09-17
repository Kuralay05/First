package musical_shop;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection("Music for soul", "Danyar");
        Medium medium = new Medium("Stray Kids", "Kpop", 2016, 22.17);
        Medium medium1 = new Medium("Ariana Grande", "Pop", 2024, 31.33);
        Composition composition = new Composition("Lonely street", 3.15);
        Composition composition1 = new Composition("Miroh", 3.45);
        Composition composition2 = new Composition("Yes or yes", 4.12);
        collection.addAlbum(medium);
        collection.addAlbum(medium1);
        medium.setCollection(collection);
        medium1.setCollection(collection);
        medium.addSong(composition);
        medium.addSong(composition1);
        medium1.addSong(composition2);
        int totalDuration = 0;
        for (Composition stray: medium.getSong()){
            totalDuration+= stray.getDuration();
            System.out.println(stray.getName1());
            System.out.println(stray.getDuration());
            System.out.println("---------------------------");
        }
        System.out.println("total duration = " + totalDuration);
        System.out.println(5);
        System.out.println("Search for song: " + findMySong("Lon", collection).getName1());
    }

    static Composition findMySong(String title, Collection collection) {
        for (Medium medium : collection.getAlbum()) {
            for (Composition song : medium.getSong()) {
                if(song.getName1().contains(title) == true){
                    return song;
                }
            }
        }
        return null;
    }
}
