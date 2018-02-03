package us.mattgreen;

/**
 * Person:  <br>
 * Class for use in instantiating a Person object.  Has a String name attribute. <br>
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 */
public abstract class Person
{
    private String name;

    /**
     * Constructor for Person, requires a name String
     * @param name String
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * getter method for name
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * setter method for name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
}