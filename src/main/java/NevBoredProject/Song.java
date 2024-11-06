package NevBoardProject;

public class Song extends Media{

    private String release;

    public Song(){
    }

    public Song(int id, String title, String genre, String type, String release, int year){
        super(id, title, genre, type, year);
        this.release = release;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString(){
        return "TypeID: " + getType() + getId() + "\nTitle: " + getTitle() + "\nGenre: " + getGenre()
                + "\nRelease: " + getRelease() + "\nYear:" + getYear()
                + "------------------------------------------------------------------------------------------";
    }
}
