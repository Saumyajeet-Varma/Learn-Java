package src.module10;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Hello World!");
            myWriter.close();

            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e) {
            System.out.println("Some error occured");
            e.printStackTrace();
        }
    }
}
