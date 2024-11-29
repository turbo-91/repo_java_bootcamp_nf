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

}
