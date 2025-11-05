public class HospitalSystem {
    static class Patient {
        private String patientId;
        private String name;
        private String[] visits;

        private static int totalPatients = 0;

        // Constructor
        public Patient(String patientId, String name, String[] visits) {
            this.patientId = patientId;
            this.name = name;
            this.visits = visits;
            totalPatients++;
        }

        // Display visit history
        public void displayVisits() {
            System.out.println("Visit history for " + name + " (ID: " + patientId + "):");
            for (String visit : visits) {
                System.out.println(" - " + visit);
            }
        }

        // Compare name using equals()
        public boolean hasSameName(String otherName) {
            return this.name.equals(otherName);
        }

        // Static method to get total patients
        public static int getTotalPatients() {
            return totalPatients;
        }
    }

    public static void main(String[] args) {
        String[] visits1 = {"2025-01-10", "2025-03-15", "2025-06-20"};
        String[] visits2 = {"2025-02-05", "2025-04-18"};

        Patient p1 = new Patient("P001", "Vaishnavi", visits1);
        Patient p2 = new Patient("P002", "Anika", visits2);

        p1.displayVisits();
        p2.displayVisits();

        // Compare names
        String inputName = "Vaishnavi";
        if (p1.hasSameName(inputName)) {
            System.out.println("✅ Name match found for: " + inputName);
        } else {
            System.out.println("❌ No match for: " + inputName);
        }

        System.out.println("Total patients registered: " + Patient.getTotalPatients());
    }
}