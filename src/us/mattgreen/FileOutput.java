package us.mattgreen;

import java.io.*;

/**
 * FileOutput:  <br>
 * This class attempts to open, write to, and close a file for output, using given file name String.<br>
 * Created by mgreen14 on 12/27/17.
 * @throws FileNotFoundException
 * @throws IOException
 * @throws Exception
 * @author Matt Green
 */
public class FileOutput
{
    Writer out = null;
    private String fileName;

    /**
     * opens a file for output based on given file name
     * @param fileName String
     */
    public FileOutput(String fileName)
    {
        this.fileName = fileName;
        try
        {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
    }

    /**
     * writes line to file
     * @param line String
     */
    public void fileWrite(String line)
    {
        try
        {
            out.write(line+"\n");
        }
        catch(Exception e)
        {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
    }

    /**
     * closes the file
     */
    public void fileClose()
    {
        if (out != null)
        {
            try
            {
                out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}