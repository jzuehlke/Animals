package us.mattgreen;

/**
 * Dog:  <br>
 * This class is used to instantiate a Dog object, with boolean attribute of friendly,
 * and String attribute of name.
 * Overrides Talkable's talk to return "Bark".  <br>
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 */
public class Dog extends Pet implements Talkable
{
    private boolean friendly;

    /**
     * Constructor for Dog
     * @param friendly boolean
     * @param name String
     */
    public Dog(boolean friendly, String name)
    {
        super(name);
        this.friendly = friendly;
    }

    /**
     * getter for friendly boolean
     * @return friendly
     */
    public boolean isFriendly()
    {
        return friendly;
    }

    /**
     * override for Talkable's talk
     * @return
     */
    @Override
    public String talk()
    {
        return "Bark";
    }

    /**
     * override for toString
     * @return
     */
    @Override
    public String toString()
    {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }
}