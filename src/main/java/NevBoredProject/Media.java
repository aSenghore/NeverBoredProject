package NevBoardProject;

public class Media {

    private int id;
    private String title;
    private String genre;
    private String type;
    private int year;

    public Media(){

    }

    public Media(int id, String title, String genre, String type, int year){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.type = type;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return "Null media";
    }
}
