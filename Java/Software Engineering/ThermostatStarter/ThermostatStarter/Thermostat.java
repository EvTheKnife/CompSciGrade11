/**
 * This class represents a simple thermostat that has a
 * fan the can be turned on or off and a temperature
 * range of [60, 85] degrees Fahrenheit.
 * 
 * @author Martino
 * @version 
 */
public class Thermostat
{
    private boolean fan;
    private int temp;

    /**
     * Constructs a thermostat that is off and has a temperature
     * setting of 68 degrees Fahrenheit.
     */
    public Thermostat()
    {
        fan = false;
        temp = 68;
    }

    /**
     * Constructs a thermostat. The fan will be set to the input
     * value.  If the temperature is in [60, 85], it is set to
     * the input value.  Otherwise, it is set to 68 degrees.
     * 
     * @param fan True if the fan should be on or false if
     * it should be off.
     * @param The setting for the thermostat in [60, 85].
     */
    public Thermostat(boolean fan, int temp)
    {
        this.fan = fan;
        if (temp <= 85 && temp >= 60) {
            this.temp = temp;
        }
        else {
            this.temp = 68;
        }
    }

    /**
     * Returns true if the fan is on and false otherwise.
     * 
     * @return true if the fan is on and false otherwise.
     */
    public boolean getFan()
    {
        return fan;
    }

    /**
     * Returns the current temperature of the thermostat.
     * 
     * @return The current temperature of the thermostat.
     */
    public int getTemp()
    {
        return temp;
    }

    /**
     * Sets the fan to on(true) or off(false) according
     * to the input value.
     * 
     * @param fan True if the fan should be set to on and
     * false otherwise.
     */
    public void setFan(boolean fan)
    {
        this.fan = fan;
    }

    /**
     * If the input temperature is in [60, 85], sets the
     * thermostate to the input temperature.  Otherwise,
     * sets the temperature to 68 degrees Fahrenheit.
     * 
     * @param temp The temperature at which to set the
     * thermostat in [60, 85].
     */
    public void setTemp(int temp)
    {
        if (temp <= 85 && temp >= 60) {
            this.temp = temp;
        }
        else {
            this.temp = 68;
        }
    }

    /**
     * If the fan is on, turns it off.  If the fan is off,
     * turns it on.
     */
    public void toggleFan()
    { 
        fan = !fan;
    }

    /**
     * If the input value + the current temperature is
     * less than or equal to 85 degrees, changes the
     * temperature to the current temperature plus the input
     * value.  Otherwise, sets the temperature to 85 degrees.
     *
     * @param adder The amount by which the temperature may
     * be increased.
     * @return The temperature of the thermostat after it is
     * updated.
     */
    public int increaseTemp(int adder)
    {
        if (temp + adder <= 85) {
            this.temp = temp + adder;
        }
        else {
            this.temp = 85;
        }
        return temp;
    }

    /**
     * If the the current temperature - input value is
     * greater than or equal to 60 degrees, changes the
     * temperature to the current temperature minus the input
     * value.  Otherwise, sets the temperature to 60 degrees.
     *
     * @param adder The amount by which the temperature may
     * be decreased.
     * @return The temperature of the thermostat after it is
     * updated.
     */
    public int decreaseTemp(int subtr)
    {
        if (temp - subtr >= 60) {
            this.temp = temp - subtr;
        }
        else {
            this.temp = 60;
        }
        return temp;
    }

    /**
     * Returns a description of the thermostat settings,
     * including whether the fan is on or off and
     * the current temperature.
     * 
     * E.g., 
     * Fan is on; Temperature = 72
     * 
     * @return A description of the thermostat settings,
     * includeing whether the fan is on or off and
     * the current temperature.
     */
    @Override
    public String toString()
    {
        if (fan == true) {
            return "Fan is on; Temperature = " + temp;

        }
        else {
            return "Fan is off; Temperature = " + temp;
        }
    }
}
