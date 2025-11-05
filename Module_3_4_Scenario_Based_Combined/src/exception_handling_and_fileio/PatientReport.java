package exception_handling_and_fileio;
import java.io.*;

public class PatientReport {
    public static void main(String[] args) {
        int total = 0, positive = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("reports.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                total++;
                String[] parts = line.split(",");
                if (parts[1].trim().equalsIgnoreCase("Positive")) {
                    System.out.println("Positive: " + parts[0]);
                    positive++;
                }
            }
            System.out.println("Total Patients: " + total + ", Positive Cases: " + positive);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}