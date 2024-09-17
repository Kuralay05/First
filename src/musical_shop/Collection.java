package musical_shop;

import java.util.ArrayList;

public class Collection {
    private String name;
    private String ownersName;
    private ArrayList<Medium> album;

    public Collection(String name, String ownersName) {
        this.name = name;
        this.ownersName = ownersName;
        this.album = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public ArrayList<Medium> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Medium> album) {
        this.album = album;
    }
    public void addAlbum(Medium medium1){
        album.add(medium1);
    }
    public void removeAlbum(Medium medium2){
        album.remove(medium2);
    }
}


