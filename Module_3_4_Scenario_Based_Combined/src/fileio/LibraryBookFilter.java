package fileio;
import java.io.*;

public class LibraryBookFilter {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("books.txt"));
             FileWriter fw = new FileWriter("available_books.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].startsWith("B1")) {
                    fw.write(line + "\n");
                    count++;
                }
            }
            System.out.println("Books processed: " + count);
        } catch (IOException e) {
            System.out.println("Error processing books: " + e.getMessage());
        }
    }
}