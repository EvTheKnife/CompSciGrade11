

public class Reindeer {
    public static void main(String[] args) {
        
        System.out.println("Calories: " + calories(5, 5, 5));

        System.out.println(snowflake(3));

        System.out.println(eminem(5, 5, 5));

        System.out.println(lefTheElf("Chell"));

    }
    public static int calories(int carrot, int apple, int oat) {
        int cal = 0;

        cal += carrot * 40;
        cal += apple * 50;
        cal += oat * 60;

        return cal;
    }

    public static String snowflake(int n) {
        String retVal = "";
        
        for (int i = n; i >= 0; i--) {
            for (int x = 0; x < i; x++) {
                retVal += " ";
            }
            if (n % 2 == 1) {
                for (int y = 0; y < ((n - i) * 2) - 1; y++) {
                retVal += "*";
                }
            }
            else {
                for (int y = 0; y < (n - i) * 2; y++) {
                    retVal += "*";
                }
            }
            retVal += "\n";
        }
        return retVal;
    }

    public static double eminem(int l, int w, int h) {
        double retVal = 2 * ((w * l) + (h * l) + (h * w));

        retVal *= 1.1;

        return retVal;
    }
    
    public static String lefTheElf(String name) {
        String retVal = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            retVal += name.charAt(i);
        }
        return retVal + " the Elf";
    }

    

}
