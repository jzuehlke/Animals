package us.mattgreen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileInput:  <br>
 * This class attempts to open, read from, and close a file given the file name String provided. <br>
 * Created by mgreen14 on 12/27/17.
 * @throws FileNotFoundException
 * @throws IOException
 * @throws Exception
 * @author Matt Green
 */
public class FileInput
{
    private BufferedReader in = null;
    private String fileName;

    /**
     * reads a file by name
     * @param fileName String
     */
    public FileInput(String fileName)
    {
        this.fileName = fileName;
        try
        {
            in = new BufferedReader(new FileReader(fileName));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * output file's content line by line to console
     */
    public void fileRead()
    {
        String line;
        try
        {
            while ((line = in.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e)
        {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
    }

    /**
     * read a line from the file
     * @return line from file
     */
    public String fileReadLine() {
        try
        {
            String line = in.readLine();
            return line;
        }
        catch (Exception e)
        {
            System.out.println("File Write Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * close the file
     */
    public void fileClose()
    {
        if (in != null)
        {
            try
            {
                in.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}