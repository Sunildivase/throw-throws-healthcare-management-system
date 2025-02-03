package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidPrescriptionException;
import com.healthcaremanagement.model.Prescription;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrescriptionService {

   private static final Scanner scanner = new Scanner(System.in);

    Set<Prescription> prescriptions = new HashSet<>();

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription() throws InvalidPrescriptionException {

        System.out.println("please enter prescriptionId");
        int prescriptionId =0;
        try {
             prescriptionId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("please enter valid input");
        }

        if(prescriptionId < 0){
            throw new InvalidPrescriptionException("please enter valid input");
        }

        System.out.println("please enter prescription Details");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);
        prescriptions.add(prescription);
        return prescription;
    }

    public void displayPrescription(){
        System.out.println("prescriptions: "+ prescriptions);
    }
}
