package com.healthcaremanagement;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidAppointmentException;
import com.healthcaremanagement.exception.InvalidContactException;
import com.healthcaremanagement.exception.InvalidPersonException;
import com.healthcaremanagement.service.*;

import java.util.Scanner;

public class ThrowThrowsHealthcareDemo {

    private static final Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("---------healthcare-management-system------------------");
            System.out.println("1. create person");
            System.out.println("2. create doctor");
            System.out.println("3. create hospital");
            System.out.println("4. create department");
            System.out.println("5. create appointment");
            System.out.println("6. create prescription");
            System.out.println("7. create billing");

            System.out.println("please enter the option ");
            try{
                option= Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new NumberFormatException("please enter valid input");
            }
            if(option<=0){
                throw new NumberFormatException("please enter valid input");
            }

            switch (option){
                case 1:
                    PersonService personService = new PersonService();
                    try {
                        personService.createPerson();
                    }catch (InvalidPersonException | NumberFormatException | InvalidAgeException | InvalidContactException e ){
                       System.err.println(e.getMessage());
                    }

                    personService.displayPerson();
                    System.out.println("person registered successfully");
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    try {
                        doctorService.createDoctor();
                    }catch (InvalidPersonException | NumberFormatException | InvalidContactException | InvalidAgeException e){
                        System.err.println(e.getMessage());
                    }
                    doctorService.displayDoctor();
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    try{
                        hospitalService.createHospital();
                    }catch (NumberFormatException | InvalidPersonException | InvalidContactException e){
                        System.err.println(e.getMessage());
                    }

                    hospitalService.displayHospital();
                    System.out.println("hospital created successfully");
                    break;

                case 4:
                    DepartmentService departmentService = new DepartmentService();
                    try {
                        departmentService.createDepartment();
                    }catch (NumberFormatException e){
                        System.err.println(e.getMessage());
                    }
                    departmentService.displayDepartment();
                    System.out.println("department created successfully");
                    break;

                case 5:
                    AppointmentService appointmentService = new AppointmentService();
                    try {
                        appointmentService.createAppointment();
                    }catch (NumberFormatException |InvalidAppointmentException e){
                        System.err.println(e.getMessage());
                    }
                    appointmentService.displayAppointment();
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    PrescriptionService prescriptionService = new PrescriptionService();
                    prescriptionService.createPrescription();
                    prescriptionService.displayPrescription();
                    System.out.println("prescription created successfully");
                    break;

                case 7:
                    BillingService billingService = new BillingService();
                    billingService.createBilling();
                    billingService.displayBilling();
                    System.out.println("bill generated successfully");
                    break;

                default:
                    System.out.println("please enter valid input");
                    break;

            }

        }while(option!=0);{

        }
    }
}
