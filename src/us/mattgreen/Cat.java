package us.mattgreen;

/**
 * Cat:  <br>
 * This class is used to instantiate a Cat object, with int attribute of mousesKilled,
 * and String attribute of name.
 * Overrides Talkable's talk to return "Meow".  <br>
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 */
public class Cat extends Pet implements Talkable
{
    private int mousesKilled;

    /**
     * Constructor for Cat
     * @param mousesKilled int
     * @param name String
     */
    public Cat(int mousesKilled, String name)
    {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     * getter method for mousesKilled
     * @return mousesKilled
     */
    public int getMousesKilled()
    {
        return mousesKilled;
    }

    /**
     * increments mousesKilled by 1
     */
    public void addMouse()
    {
        mousesKilled++;
    }

    /**
     * override for Talkable's talk
     * @return
     */
    @Override
    public String talk()
    {
        return "Meow";
    }

    /**
     * override for toString
     * @return
     */
    @Override
    public String toString()
    {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

