package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidContactException;
import com.healthcaremanagement.exception.InvalidHospitalException;
import com.healthcaremanagement.model.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalService {

   private static final Scanner scanner = new Scanner(System.in);

    List<String > hospitals = new ArrayList<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public void createHospital(){
        System.out.println("please enter hospital id");
        int hospitalId=0;
        try {
             hospitalId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }
        if(hospitalId < 0){
            throw new InvalidHospitalException("enter valid input");
        }

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter hospital address");
        String hospitalAddress = scanner.nextLine();

        System.out.println("please enter contact No");
        Long contactNo=0L;
        try{
           contactNo = Long.parseLong(scanner.nextLine());
        }catch (NumberFormatException e){
            throw new InvalidContactException("enter valid mobile number");
        }

        if(contactNo !=10){
           hospitals.add(String.valueOf(contactNo));
        }else{
            throw new InvalidContactException("enter valid contact number");
        }

        System.out.println("please enter email id ");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);
        hospitals.add(String.valueOf(hospital));
    }

    public void displayHospital(){
        System.out.println("hospital: "+hospitals);
    }

}
