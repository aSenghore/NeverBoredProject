package NevBoardProject;

public class Movie extends Media{

    private String ageRating;
    private double rating;
    private String studio;

    public Movie(){
    }

    public Movie(int id, String title, String genre, String type, String ageRating, double rating, String studio, int year){
        super(id, title, genre, type, year);
        this.ageRating = ageRating;
        this.rating = rating;
        this.studio = studio;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString(){
        return "TypeID: " + getType() + getId() + "\nTitle: " + getTitle() + "\nGenre: " + getGenre()
                 + "\nAge Rating: " + getAgeRating() + "\nRating Score: " + getRating()
                 + "\nStudio: " + getStudio() + "\nYear:" + getYear()
                + "------------------------------------------------------------------------------------------";
    }

}
