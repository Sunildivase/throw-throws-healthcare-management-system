package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidIdException;
import com.healthcaremanagement.model.Department;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DepartmentService {

    private static final Scanner scanner = new Scanner(System.in);

    Set<String > departments = new HashSet<>();

    void printDepartment(Department department){
        System.out.println(department);
    }

    public void createDepartment(){
        System.out.println("please enter dept id");
        int deptId=0;
        try{
            deptId =Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }

        if(deptId < 0){
            throw new InvalidIdException("enter valid input");
        }

        System.out.println("please enter dept name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctorId");
        int doctorId = 0;
        try{
            doctorId =Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }

        if(doctorId < 0){
            throw new InvalidIdException("enter valid input");
        }

        System.out.println("please enter hospitalId");
        int hospitalId = 0;
        try{
           hospitalId =Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }

        if(hospitalId < 0){
            throw new InvalidIdException("enter valid input");
        }

        Department department = new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.setHospitalId(hospitalId);
        departments.add(String.valueOf(department));

    }
    public void displayDepartment(){
        System.out.println("departments: "+departments);
    }
}
