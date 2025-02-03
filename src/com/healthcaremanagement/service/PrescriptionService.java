package com.healthcaremanagement.service;

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

    public void createPrescription(){

    }

    public void displayPrescription(){

    }
}
