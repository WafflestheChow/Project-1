package company;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class Project1 {
    public static void main(String[] args) throws FileNotFoundException, ParseException { // throws exceptions if file not found or parse error.
        DateGUI hello = new DateGUI();
        if(args.length > 0){
            String name = args[0];
            DateGUI.setFileName(name); // set file name
            hello.readNumbers(name); // call readnumbers with filename passed.
            hello.runDate();
        }
        else{
            throw new IllegalArgumentException("No Arguments Detected. " +
                    "\n Terminating");
        }
    }
}
