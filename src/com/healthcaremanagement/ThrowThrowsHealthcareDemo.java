package com.healthcaremanagement;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidContactException;
import com.healthcaremanagement.exception.InvalidIdException;
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

            System.out.println("please enter the option");
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
                    }catch (InvalidIdException | NumberFormatException | InvalidAgeException | InvalidContactException e ){
                       System.err.println(e.getMessage());
                    }

                    personService.displayPerson();
                    System.out.println("person registered successfully");
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    try {
                        doctorService.createDoctor();
                    }catch (InvalidIdException | NumberFormatException | InvalidContactException | InvalidAgeException e){
                        System.err.println(e.getMessage());
                    }
                    doctorService.displayDoctor();
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    try{
                        hospitalService.createHospital();
                    }catch (NumberFormatException |InvalidIdException | InvalidContactException e){
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
                    appointmentService.createAppointment();
                    appointmentService.displayAppointment();
                    System.out.println("appointment created successfully");
                    break;

                case 6:
                    System.out.println("prescription created successfully");
                    break;

                case 7:
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
