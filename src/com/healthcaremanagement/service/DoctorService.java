package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidContactException;
import com.healthcaremanagement.exception.InvalidExperienceException;
import com.healthcaremanagement.exception.InvalidIdException;
import com.healthcaremanagement.model.Doctor;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Scanner;

public class DoctorService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Doctor> doctorHashMap = new HashMap<>();

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }

    public Doctor createDoctor(){
        System.out.println("please enter doctor id");
        int doctorId=0;
        try{
             doctorId = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException nfe){
            throw new NumberFormatException("enter valid input");
        }

        if(doctorId<=0){
            throw new InvalidIdException("please enter valid id");
        }

        System.out.println("please enter first Name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last Name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = 0;
        try{
          age =  Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }

        if(age <= 0){
            throw new InvalidAgeException("enter valid input");
        }

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        Long contactNo =0L;
        try{
            contactNo = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }
        if(contactNo !=10){
            throw new InvalidContactException("enter valid input");
        }

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter experience");
        int experience=0;
        try{
            experience = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }
        if(experience < 0){
            throw new InvalidExperienceException("enter valid experience");
        }

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);
        doctor.setExperience(experience);
        doctorHashMap.put(String.valueOf(1),doctor);
        return doctor;
    }
    public void displayDoctor(){

    }

}
