import java.io.File;  // Import the File class
import java.io.FileNotFoundException; // Import to handle FileNotFound Exceptions
import java.util.Scanner; // Import the Scanner class to read text files

public class BotBanner {
    public static void main(String[] args) {
        try {
        String file = "src/ViewBotDataBase.txt";
        Scanner scanner = new Scanner(new File(file));
        //Scanner.useDelimiter(" "); space is default : tried using ENTER didn't work : works with default

        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println("/ban " + data);
            
        } scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error");
        e.printStackTrace();
    }
    } 
}

/*

try to take "src/ViewBotDataBase.txt" and turn it into a string "file" 
Then scan the string "file" with scanner. 
while scanner has an available next line continue.
save next line as string "data"
output /ban + "data"
close scanner aka close file
catch FileNotFoundException : needs to be catched even if it may not happen
output Error if catched
output stack trace  

*/