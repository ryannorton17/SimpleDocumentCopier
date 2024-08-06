import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        makeCopy();

    }

    public static void makeCopy() {
        try {
            File inputFile = new File("src/input.txt");
            Scanner reader = new Scanner(inputFile);
            File outputFile = new File("src/output.txt");
            FileWriter writer = new FileWriter("src/output.txt");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("Reading: " + line);
                writer.write("\n" + line);
                System.out.println("Writing: " + line);
            }
            System.out.println("Output file successfully written.");
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred: File not Found");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
