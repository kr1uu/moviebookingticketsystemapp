package javafxapplication4;

/**
 *
 * @author Vy Kiet
 */
public class Movie {
    private int ID;
    private String MovieTitle;
    private String Genre;
    private String Duration;
    private byte[] picture;

    public Movie(int ID,String MovieTitle, String Genre, String Duration,byte[] image) {
        this.ID =ID;
        this.MovieTitle = MovieTitle;
        this.Genre = Genre;
        this.Duration = Duration;
        this.picture = image;
    }

     public void setID(int ID) {
        this.ID = ID;
    }
    public void setMovieTitle(String MovieTitle) {
        this.MovieTitle = MovieTitle;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

     public int getID() {
        return ID;
    }
    public String getMovieTitle() {
        return MovieTitle;
    }

    public String getGenre() {
        return Genre;
    }

    public String getDuration() {
        return Duration;
    }
    public byte[] getImage(){
        return picture;
    }
}
