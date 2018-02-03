package us.mattgreen;

/**
 * InputTypeVerifier: <br>
 * Accepts a string, capitalizes it, then looks at the first character to
 * evaluate if it is a letter value.
 * @author Jake Zuehlke
 */
public class InputTypeVerifier
{
    String input;

    /**
     * constructor, requires a string
     * @param i
     */
    public InputTypeVerifier(String i)
    {
        this.input = i;
    }

    /**
     * evaluates string's 1st char to determine if it is a letter
     * @return char
     * @throws Exception
     */
    public char validInputType() throws Exception
    {
        char testChar = input.toUpperCase().charAt(0);
        char validChar = 'A';

        try
        {
            if (Character.isLetter(testChar))
            {
                validChar = testChar;
            }
            else
            {
                System.out.println("Invalid Input Type.");
            }
        }
        catch(Exception e)
        {
            throw new Exception("Invalid Input Type.");
        }

        return validChar;
    }
}
