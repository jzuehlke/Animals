package us.mattgreen;

/**
 * Pet: <br>
 * Class for instantiating a Pet object, has name String attribute. <br>
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 */
public abstract class Pet
{
    protected String name;

    /**
     * Constructor for Pet, requires name String
     * @param name
     */
    public Pet(String name)
    {
        this.name = name;
    }

    /**
     * getter for name
     * @return name
     */
    public String getName()
    {
        return name;
    }
}