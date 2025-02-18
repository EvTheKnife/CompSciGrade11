/**
 * Write a description of class MovieTheater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 import java.util.ArrayList;
import jdk.jshell.Snippet;

public class MovieTheater {
    private ArrayList<MoviePass> passes;
    /**
     * Constructs a MovieTheater object by
     * creating the ArrayList passes
     */
    public MovieTheater() {
        passes = new ArrayList<>();
    }

    /**
     * Add a new MoviePass to the ArrayList passes.
     *
     * @param mTitle The movie title.
     * @param sNumber The screen number.
     * @param show The date and time of the showing.
     * @param pNumber The pass number.
     */
    public void addMoviePass(String mTitle, int sNumber, String show, int pNumber){
        passes.add(new MoviePass(mTitle, sNumber, show, pNumber));
    }

    /**
     * @param screen The screen number.
     *
     * @return The number of MoviePasses for the movie playing
     * the screen.  
     */
    public int getViewsOnScreen(int screen) { 
        return -1;
    }

    /**
     * Change all movies showing on the screen oldScreen to show
     * on the screen newScreen.  
     *
     * @param oldScreen The original screen number.
     * @param newScreen The new screen number.
     */
    public void changeScreen(int oldScreen, int newScreen){ 
        
    }

    /**
     * Write a while loop to find the pass number forPassNumber  
     * and change its showing to newShowing.  Once the correct  
     * pass number is found, the loop should terminate.
     * 
     * @param forPassNumber The number of the pass to update.
     * @param newShowing  The new showing number.
     *
     * @return true if the pass number was found, and false 
     *         otherwise.
     */
    public boolean changeShowing(int forPassNumber, String newShowing){ 
        return false;
    }
}