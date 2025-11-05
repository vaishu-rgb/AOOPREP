package exception_handling_and_fileio;
import java.io.*;

public class GradeBackup {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("grades.txt"));
             FileWriter fw = new FileWriter("grades_backup.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int grade = Integer.parseInt(parts[1].trim());
                if (grade > 75) {
                    fw.write(line + "\n");
                    count++;
                }
            }
            System.out.println("Backed up students: " + count);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}