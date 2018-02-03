package us.mattgreen;

import java.util.Scanner;

/**
 * AnimalIO: <br>
 * This class will prompt the user if they want to enter data for a dog or a cat,
 * then uses createCat or createDog methods to gather the data needed for the
 * Dog or Cat class constructors.
 * @author Matt Green
 */
public class AnimalIO
{
    public static Scanner keyboard = new Scanner(System.in);

    public AnimalIO()
    {

    }

    /**
     * User prompt menu, call createCat or createDog as appropriate
     * @return Talkable Pet object
     * @throws Exception thrown if user enters undesired input
     */
    public Talkable getAnimal() throws Exception
    {
        String ans;
        Talkable pet = null;
        do
        {
            System.out.println("Do you want to enter a (C)at or (D)og or (E)xit? ");
            ans = keyboard.nextLine();

            if ((ans != null) && (ans.toUpperCase().charAt(0) == 'C'))
            {
                pet = createCat();
            }
            else if (ans.toUpperCase().charAt(0) == 'D')
            {
                pet =  createDog();
            }
            else if (ans.toUpperCase().charAt(0) == 'E')
            {
                throw new Exception("Out of input");
            }
            else
            {
                System.out.println("Invalid Animal Type.");
            }
        }
        while((ans != null) && (ans.toUpperCase().charAt(0) != 'C') && (ans.toUpperCase().charAt(0) != 'D'));
        return pet;
    }

    /**
     * Create a Dog object
     * @return Talkable Dog object
     */
    private Talkable createDog()
    {
        String name = inputName();
        String ans;
        boolean friendly=true;

        do
        {
            System.out.println("Is the Dog Friendly (Y)es or (N)o? ");
            ans = keyboard.nextLine();

            if ((ans != null) && ans.toUpperCase().charAt(0) == 'Y')
            {
                friendly = true;
            }
            else if ((ans != null) && ans.toUpperCase().charAt(0) == 'N')
            {
                friendly = false;
            }
        }
        while((ans != null) && (ans.toUpperCase().charAt(0) != 'Y') && (ans.toUpperCase().charAt(0) != 'N'));
        return new Dog(friendly, name);
    }

    /**
     * Create a Talkable Cat object
     * @return Talkable Cat object
     */
    private Talkable createCat()
    {
        String name = inputName();
        String ans;
        int miceKilled=0;
        boolean miceNumeric=false;

        while (!miceNumeric)
        {
            System.out.println("Please enter number of mice killed:  ");
            ans = keyboard.nextLine();
            try
            {
                miceKilled = Integer.parseInt(ans);
                miceNumeric=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println(ans
                        + " is not a number.");
            }
            catch (Exception e)
            {
                System.out.println("Bad number format.");
            }
        }
        return new Cat(miceKilled, name);
    }

    /**
     * Prompt user for a name
     * @return prompted name
     */
    private String inputName()
    {
        String ans;
        do
        {
            System.out.println("Please Enter your Pet's name: ");
            ans = keyboard.nextLine();

            if (ans != null && ans.length() < 1)
            {
                System.out.println("Pet name must be at least a Character or more.");
            }
        }
        while((ans != null) && (ans.length() < 1));
        return ans;
    }
}
