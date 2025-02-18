/**
 * Lab 8, Debugging Exercise
 *
 * @author 
 * @version
 */
public class DebugMe
{
    //A list of words that should be ignored at input.
    private static ArrayList<String> ignoreTheseWords;

    /**
     * This program prompts the user to enter a list of words.  The
     * user should signal the end of their input by entering the word
     * done in any combination of case (e.gd, Done, done, DONE, etc.).
     * 
     * The program then prints a list of the unique words the user entered,
     * one per line, in reverse order and lowercase.  Except, the program 
     * ignores any word the user entered that is saved in the ArrayList 
     * ignoreTheseWords.
     * 
     * @param  args This program requires no command line input.
     */
    public static void main(String[] args)
    {
        populateIgnoreTheseWords();

        ArrayList<String> keepTheseWords = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a list of words.  To end your input, enter done.");
        String word = keyboard.next();

        while(!word.equals("done")){
            if(!ignoreTheseWords.contains(word)){
                if(!keepTheseWords.contains(word)){
                    keepTheseWords.add(word);
                }
            }
        }

        System.out.println("\nThe words this program is keeping are:  ");
        for(String kept : keepTheseWords){
            System.out.println(kept);
        }
    }

    /**
     * Adds words to the ignoreTheseWords ArrayList.
     */
    private static void populateIgnoreTheseWords()
    {
        ignoreTheseWords.add("a");
        ignoreTheseWords.add("and");
        ignoreTheseWords.add("are");
        ignoreTheseWords.add("at");
        ignoreTheseWords.add("int");
        ignoreTheseWords.add("of");
        ignoreTheseWords.add("on");
        ignoreTheseWords.add("or");
        ignoreTheseWords.add("to");
        ignoreTheseWords.add("the");
    }
}