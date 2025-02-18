
/**
 * Write a description of class MoviePass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoviePass {
    private String movieTitle; 
    private int screenNumber;  
    private String showing;    
    private int passNumber;
    
    public MoviePass(String mTitle, int sNumber, String show, int pNumber) {
        movieTitle = mTitle;
        screenNumber = sNumber;
        showing = show;
        passNumber = pNumber;
    }

    public String getMovieTitle() { 
        return movieTitle; 
    }

    public int getScreenNumber() { 
        return screenNumber; 
    }

    public int getPassNumber() { 
        return passNumber; 
    }

    public void setShowing(String newShowing) { 
        showing = newShowing;
    }

    public void setScreenNumber(int newScreenNumber) { 
        screenNumber = newScreenNumber;
    }
    //Additional methods omitted
}

