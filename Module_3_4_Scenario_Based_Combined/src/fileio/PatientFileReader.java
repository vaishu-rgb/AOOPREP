package fileio;
import java.io.*;

public class PatientFileReader {
    public static void main(String[] args) {
        int total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("patients.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                total++;
                String[] parts = line.split(",");
                String name = parts[1].trim();
                if (name.startsWith("J")) {
                    System.out.println("Patient: " + name);
                }
            }
            System.out.println("Total patients: " + total);
        } catch (IOException e) {
            System.out.println("Error reading patients file: " + e.getMessage());
        }
    }
}