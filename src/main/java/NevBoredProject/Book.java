package NevBoardProject;

public class Book extends Media{

    private String author;
    private double rating;
    private String publisher;
    private String group;

    public Book(){
    }

    public Book(int id, String title, String genre, String type, String ageRating, double rating, String studio, String group, int year){
        super(id, title, genre, type, year);
        this.author = ageRating;
        this.rating = rating;
        this.publisher = studio;
        this.group = group;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return "TypeID: " + getType() + getId() + "\nTitle: " + getTitle() + "\nGenre: " + getGenre()
                + "\nAuthor: " + getAuthor() + "\nRating Score: " + getRating()
                + "\nPublisher: " + getPublisher() + "\nSeries(or None): " + getGroup() + "\nYear:" + getYear()
                + "------------------------------------------------------------------------------------------";
    }
}
