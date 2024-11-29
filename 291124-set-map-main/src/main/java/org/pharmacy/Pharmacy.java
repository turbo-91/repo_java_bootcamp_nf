package org.pharmacy;
import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;

    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
        System.out.println("Medication saved: " + medication.getName());
    }

    public Medication find(String medicationName) {
        return medications.getOrDefault(medicationName, null);
    }

    public void delete(String medicationName) {
            medications.remove(medicationName);
            System.out.println("Medication deleted: " + medicationName);
    }

    public void printAllMedications() {
        if (medications.isEmpty()) {
            System.out.println("No medications in the pharmacy.");
        } else {
            System.out.println("Medications in the pharmacy:");
            for (Medication medication : medications.values()) {
                System.out.println("Name: " + medication.getName() +
                        ", Price: $" + medication.getPrice() +
                        ", Availability: " + (medication.getAvailability() ? "In Stock" : "Out of Stock"));
            }
        }
    }
}
