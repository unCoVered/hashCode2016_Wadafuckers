package loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CommandLoader
{

    private static Scanner sc;
    public static void LoadCommand (File commandInput)
    {
        try
        {
            sc = new Scanner(commandInput);
            int numberOfCommands;
            while(sc.hasNextLine())
            {
                numberOfCommands = sc.nextInt();
                sc.nextLine();  //End Line
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
