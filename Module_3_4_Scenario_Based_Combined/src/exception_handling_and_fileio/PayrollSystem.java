package exception_handling_and_fileio;
import java.io.*;

public class PayrollSystem {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("hours.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int hours = Integer.parseInt(parts[1].trim());
                if (hours > 35) {
                    System.out.println(parts[0] + " worked " + hours + " hours.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}