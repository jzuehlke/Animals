package us.mattgreen;

import java.util.ArrayList;

/**
 * Main:<br>
 * Instantiates arraylist zoo to hold talkable objects,
 * then uses AnimalIO class methods to prompt user for data to be used in zoo.
 * @author Matt Green
 */

public class Main
{
    //Instantiate FileInput and FileOutput classes for file I/O
    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args)
    {
        //instantiate new arraylist
        ArrayList<Talkable> zoo = new ArrayList<>();

        /*Lines to Replace
        zoo.add(new Dog(true, "Pete"));
        zoo.add(new Cat(9, "Anne Belly"));
        zoo.add(new Student(19, "Joe John Johnson"));
        End Lines to Replace*/

        //prompt user for data as long as they don't enter "E" when prompted
        boolean addAnotherAnimal=true;
        AnimalIO input = new AnimalIO();
        do
        {
            try
            {
                zoo.add(input.getAnimal());
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                addAnotherAnimal=false;
            }
        } while(addAnotherAnimal);

        for (Talkable thing: zoo)
        {
            printOut(thing);
        }

        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null)
        {
            System.out.println(line);
        }
    }

    /**
     * outputs pet's name and their talk to console
     * @param p
     */
    public static void printOut(Talkable p)
    {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
