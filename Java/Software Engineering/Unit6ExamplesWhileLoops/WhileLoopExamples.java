

/**
 * Complete the methods accoding to the comment
 * Test your methods in main
 *
 * @author While Loop practice
 * @version 
 */
public class WhileLoopExamples
{
    public static void main(String[] args){
        // Test methods here
    }

    /**
     * Problem 1:
     * 
     * Write a method called digitSum that accepts an integer as a parameter 
     * and returns the sum of the digits of that integer. 
     * For example, the call digitSum(29107) returns 2 + 9 + 1 + 0 + 7 or 19. 
     * For negative numbers, return the same value that would result if the number were positive. 
     * For example, digitSum(-456) returns 4 + 5 + 6 or 15. The call digitSum(0) returns 0.
     * 
     * @param value The value to have its digits added
     * @return The sum of the digits

     */
    public static int digitSum(int value) {


        String valueString = value+"";
        int i = 0;
        int sum = 0;
        while (i <valueString.length()) {
            sum += Integer.parseInt(valueString.charAt(i) + "");
        }

        return sum;
    }
    
    /**
     * Problem 2:
     * 
     * Write the method, printLeftTriangle, to print a left facing right triangle of n rows.  
     * Example output for n = 4 is shown below.  Please write this method using while loops
     *
     *              &
     *             &&
     *            &&&
     *           &&&&

     */
    

    
    /**
     * Problem 3:
     * 
     * Now write a method to do the same output as above but using a for loop
     * 
     */

    
    
    
    /**
     * Problem 4:
     * 
     * In a particular sequence, the first 5 values are 0, 1, 3, 7, and 15. 
     * Determine the pattern for this sequence and then write a method
     * to print the first n values in this sequence.  You may assume n >=0.
     *
     * @param n The number of values to print in the sequence where n >= 0.
     */

    
    
    
    /**
     * Problem 5:
     * 
     * Keep in mind we usually only use Scanner in the main method but we can use it in 
     * other methods if it makes sense to do so as in this example and the next one
     * 
     * 
     * The method temps is going to prompt the user to input a series of temperatures, 
     * each measured to the nearest tenth of a degree.  
     * When all of the temperatures have been entered, the user should enter -999.  
     * Then, the program should output the maximum temperature and the minimum temperature entered.
     * 
     * @param none
     * @return none
     * 
     */

    
    
    /**
     * Problem 6:
     * 
     * The Scanner.next() method finds and returns the next complete token as a String.
     * A complete token is preceded and followed by input that matches the delimiter pattern. 
     * The default delimiter is a space.
     * 
     * The method scores prompts the user for the name of two teams and their 
     * respective scores and outputs the winner or a tie.  
     * Use Scanner.next() to read in the data.  Input is entered on one line.  
     * 
     * For example:
     * 
     * Union 2 RPI 1
     * 
     * The method should continue this behavior until there is no more input.  
     * When there is no more input, the user should enter DONE.
     * 
     * @param none
     * @return none
     * 
     */

    
    
    
    
    /**
     * Problem 7:
     * 
     * The method countAs uses a while loop to return the number of times "a" occurs in the input String word
     * 
     * @param word The word to count for a's
     * @return The number of times the letter a occurs in word
     * 
     */


}