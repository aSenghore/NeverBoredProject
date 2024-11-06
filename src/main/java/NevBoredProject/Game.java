package NevBoardProject;

public class Game extends Media{

    private String platform;
    private String rating;
    private int year;

    public Game(){
    }

    public Game(int id, String title, String genre, String type, String platform, String rating, int year){
        super(id, title, genre, type, year);
        this.platform = platform;
        this.rating = rating;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString(){
        return "TypeID: " + getType() + getId() + "\nTitle: " + getTitle() + "\nGenre: " + getGenre()
                + "\nPlatform: " + getPlatform() + "\nRating: " + getRating() + "\nYear:" + getYear()
                + "------------------------------------------------------------------------------------------";
    }
}
