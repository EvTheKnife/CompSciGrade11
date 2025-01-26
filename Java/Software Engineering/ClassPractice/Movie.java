public class Movie {

    // Instance Variables
    String title, director;
    double rating;
    boolean inTheaters;
    

    // Constructors
    public Movie(String title) {
        this.title = title;
        director = "unknown";
        rating = 0.0;
        inTheaters = false;
    }
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
        inTheaters = false;
    }


    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void setTheaters(boolean inTheaters) {
        this.inTheaters = inTheaters;
    }


    // Getter methods
    public String getTitle() {
        return title;
    }
    public String getDirector() {
        return director;
    }
    public double getRating() {
        return rating;
    }
    public boolean getInTheaters() {
        return inTheaters;
    }


    // toString method
    @Override
    public String toString() {
        if (inTheaters) {
            return "The movie " + title + " directed by " + director + "is in theaters now! Critics rate this " + rating + "star(s)!";
        }
        else {
            return "The movie " + title + " directed by " + director + " is not in theaters. Critics rate this " + rating + "star(s)!";
        }
    }

}

