
/**
 * This program can be used to test the Thermostat class.
 * This is not necessarily a complete test of the Thermostat
 * class.
 *
 * @author Martino
 * @version
 */
public class ThermostatDriver
{

    public static void main(String[] args) {
        testOne();
        testTwo();
    }

    /**
     * Use this method to test the Thermostat class where
     * indicated in the lab directions.
     */
    public static void testOne()
    {
        int score = 0;
        int maxScore = 0;

        //testing default constructor
        Thermostat therm = new Thermostat();
        if(!therm.getFan()){
            score++;
        }
        if(therm.getTemp() == 68){
            score++;
        }
        maxScore += 2;

        //testing second constructor
        therm = new Thermostat(true, 70);
        if(therm.getFan()){
            score++;
        }
        if(therm.getTemp() == 70){
            score++;
        }
        maxScore += 2;

        therm = new Thermostat(false, 90);
        if(!therm.getFan()){
            score++;
        }
        if(therm.getTemp() == 68){
            score++;
        }
        maxScore += 2;

        therm = new Thermostat(true, 0);
        if(therm.getFan()){
            score++;
        }
        if(therm.getTemp() == 68){
            score++;
        }
        maxScore += 2;

        //testing setFan
        therm.setFan(false);
        if(!therm.getFan()){
            score++;
        }
        therm.setFan(true);
        if(therm.getFan()){
            score++;
        }
        maxScore += 2;

        //testing setTemp
        therm.setTemp(86);
        if(therm.getTemp() == 68){
            score++;
        }
        therm.setTemp(85);
        if(therm.getTemp() == 85){
            score++;
        }
        therm.setTemp(84);
        if(therm.getTemp() == 84){
            score++;
        }
        therm.setTemp(75);
        if(therm.getTemp() == 75){
            score++;
        }
        therm.setTemp(61);
        if(therm.getTemp() == 61){
            score++;
        }
        therm.setTemp(60);
        if(therm.getTemp() == 60){
            score++;
        }
        therm.setTemp(59);
        if(therm.getTemp() == 68){
            score++;
        }
        maxScore += 7;

        if(score == maxScore){
            System.out.println("Congratulations!  You have passed all the tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points.");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }

    /**
     * Use this method to test the Thermostat class where
     * indicated in the directions.
     */
    public static void testTwo()
    {
        int score = 0;
        int maxScore = 0;

        //testing default constructor
        Thermostat therm = new Thermostat();
        if(!therm.getFan()){
            score++;
        }
        if(therm.getTemp() == 68){
            score++;
        }
        maxScore += 2;

        //testing toggleFan
        therm.toggleFan();
        if(therm.getFan()){
            score++;
        }
        therm.toggleFan();
        if(!therm.getFan()){
            score++;
        }
        maxScore += 2;

        //testing increaseTemp and decreaseTemp
        therm.increaseTemp(10);
        if(therm.getTemp() == 78){
            score++;
        }
        therm.increaseTemp(10);
        if(therm.getTemp() == 85){
            score++;
        }
        therm.increaseTemp(10);
        if(therm.getTemp() == 85){
            score++;
        }
        therm.decreaseTemp(10);
        if(therm.getTemp() == 75){
            score++;
        }
        therm.decreaseTemp(20);
        if(therm.getTemp() == 60){
            score++;
        }
        therm.decreaseTemp(10);
        if(therm.getTemp() == 60){
            score++;
        }
        maxScore += 6;

        // testing toString
        if(therm.toString().equalsIgnoreCase("Fan is off; Temperature = 60")){
            score++;
        }
        therm.toggleFan();
        therm.increaseTemp(15);
        if(therm.toString().equalsIgnoreCase("Fan is on; Temperature = 75")){
            score++;
        }
        maxScore += 2;

        if(score == maxScore){
            System.out.println("Congratulations!  You have passed all the tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points.");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }
}
