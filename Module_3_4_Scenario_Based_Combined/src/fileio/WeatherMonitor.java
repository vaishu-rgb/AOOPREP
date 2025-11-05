package fileio;
import java.io.*;

public class WeatherMonitor {
    public static void main(String[] args) {
        int totalCities = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("weather_data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalCities++;
                String[] parts = line.split(",");
                String city = parts[0].trim();
                double temp = Double.parseDouble(parts[1].trim());
                if (temp > 25.0) {
                    System.out.println("Warm City: " + city + " (" + temp + "°C)");
                }
            }
            System.out.println("Total cities: " + totalCities);
        } catch (IOException e) {
            System.out.println("Error reading weather data: " + e.getMessage());
        }
    }
}