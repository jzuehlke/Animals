package us.mattgreen;

/**
 * Student:<br>
 * This class extends Person and implements Talkable.  Gives age attribute to Student object.
 * Overrides Talkable's talk with "Can we talk about my grade?" <br>
 * Created by mgreen14 on 12/27/17.
 * @author Matt Green
 */
public class Student extends Person implements Talkable
{
    private int age;

    /**
     * Constructor for Student, requires age and name
     * @param age int
     * @param name String
     */
    public Student(int age, String name)
    {
        super(name);
        this.age = age;
    }

    /**
     * getter for age
     * @return age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * setter for age
     * @param age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * override for Talkable's talk
     * @return
     */
    @Override
    public String talk()
    {
        return "Can we talk about my grade.";
    }
}
