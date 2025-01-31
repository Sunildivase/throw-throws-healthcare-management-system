package com.healthcaremanagement.model;

public class Prescription {
    private int prescriptionId;
    private String prescriptionDetails;
    private int personId;

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", prescriptionDetails='" + prescriptionDetails + '\'' +
                ", personId=" + personId +
                '}';
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getPrescriptionDetails() {
        return prescriptionDetails;
    }

    public void setPrescriptionDetails(String prescriptionDetails) {
        this.prescriptionDetails = prescriptionDetails;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
