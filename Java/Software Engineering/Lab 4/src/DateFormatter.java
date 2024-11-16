import java.util.Scanner;

/**
 * Lab 4, Part 2
 * 
 * @author  
 * @version 
 */
public class DateFormatter
{
    /**
     * This program allows the user to enter a date as mm/dd/yyyy.  If the date is valid,
     * the user will be allowed to select a formatting preference for the date 
     * (American, European, ISO, Ordinal).  Then, the program will output the date 
     * in the requested format.
     * 
     * @param args[] No input is required to start this program.
     */
    public static void main(String args[])
    { 
        String answer;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the date you would like to format (mm/dd/yyyy):  ");
        answer = sc.nextLine();
        if (isValidDate(answer))
        {     
            
            int[] dateNums = getDateNums(answer);

            System.out.println("\nEnter the number of the date format you would like.");
            System.out.println("1. American");
            System.out.println("2. European");
            System.out.println("3. ISO");
            System.out.println("4. Ordinal\n");
            
            int typeChoice = sc.nextInt();

            switch (typeChoice) {
            case 1:
                System.out.println(getUSFormat(dateNums[0], dateNums[1], dateNums[2]));
                break;
            case 2:
                System.out.println(getEuropeanFormat(dateNums[0], dateNums[1], dateNums[2]));
                break;
            case 3:
                System.out.println(getISOFormat(dateNums[0], dateNums[1], dateNums[2]));
                break;
            case 4:
                System.out.println(getOrdinalMonthDay(dateNums[0], dateNums[1]));
                break;
            
            }


        }
        else
        {
            System.out.println("Sorry, " + answer + " is not a valid date in the format mm/dd/yyyy.");
        }
        
        sc.close();
    }


    public static String getMonthName(int monthNum) {
 
        String[] monthNames = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[monthNum - 1];
    }

    public static String getOrdinalNum(int dayNum) {

        if (10 < dayNum && dayNum < 20) {
    		return dayNum + "th";
    	}
    	else if (dayNum % 10 == 1) {
    		return dayNum + "st";
    	}
    	else if (dayNum % 10 == 2) {
    		return dayNum + "nd";
    	}
    	else if (dayNum % 10 == 3) {
    		return dayNum + "rd";
    	}
    	else {
    		return dayNum + "th";
    	}
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    

    /**
     * This function returns the date following United States format.
     * 
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as nameOfMonth day, year.  E.g., January 25, 2017
     */
    public static String getUSFormat(int month, int day, int year)
    {
        return getMonthName(month) + " " + day + ", " + year;
    }

    /**
     * This function returns the date following the most commonly use European format.
     * 
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as day nameOfMonth year. E.g., 25 January 2017
     */
    public static String getEuropeanFormat(int month, int day, int year)
    {
        return day + " " + getMonthName(month) + " " + year;
    }

    /**
     * This function returns the date in International Organization for Standardization (ISO) format.
     * @param month  A valid month.
     * @param day A valid day for the given month.
     * @param year A valid year.
     * 
     * @return The date formatted as year nameOfMonth day. E.g., 2017 January 25
     */
    public static String getISOFormat(int month, int day, int year)
    {
        return year + " " + getMonthName(month) + " " + day;
    }

    /**
     * This function returns the name of the month followed by the ordinal day.
     * 
     * @param month A valid month.
     * @param day A valid day for the given month.
     * 
     * @return the nameOfMonth followed by the ordinal day.  E.g., January 25th
     */
    public static String getOrdinalMonthDay(int month, int day)
    {
        return getMonthName(month) + " " + getOrdinalNum(day);
    }
    
    /**
     * We will say a date is valid if the month is in [1, 12],
     * the year is in [1, 2500], and the day is the correct number
     * of days for the month, including consideration for leap year.
     * Remember the mnemonic rhyme?
     * 
     * Thirty days has September, 
     * April, June, and November.
     * All the rest have 31, 
     * Except for February alone,
     * Which has but twenty-eight days clear,
     * And twenty-nine in each leap year.
     * (https://en.wikipedia.org/wiki/Thirty_days_hath_September)
     * 
     * For our purposes, the date must be in the format mm/dd/yyyy.
     * 
     * @param date A possible date.
     * @return true If this is a valid date and false otherwise.
     */
    public static boolean isValidDate(String date)
    {
        int month = 0;
        int day = 0;
        int year = 0;
        boolean isValid = true;
        
        if (date.length() == 10)
        {
            try
            {
                month = Integer.parseInt(date.substring(0, 2));
                day = Integer.parseInt(date.substring(3, 5));
                year = Integer.parseInt(date.substring(6));

            }
            catch(NumberFormatException nfe)
            {
                isValid = false;
            }
        }
        if (month > 0 && month < 12) {
            switch(month) {
            case 4, 6, 9, 11:
                if (day > 30) {
                    isValid = false;
                }
                break;

            case 1, 3, 5, 7, 8, 10, 12: 
                if (day > 31) {
                    isValid = false;
                }
                break;
            case 2:
                if (isLeapYear(year) && day > 29) {
                    isValid = false;
                }
                if (!isLeapYear(year) && day > 28) {
                    isValid = false;
                }
                break;
            }
        }
        else {
            isValid = false;
        }
        return isValid;
    }

    public static int[] getDateNums(String date) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));
        int[] returnVals = {month, day, year};

        return returnVals;
    }

}
