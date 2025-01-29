package com.healthcaremanagement;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.service.PersonService;

import java.util.Scanner;

public class ThrowThrowsHealthcareDemo {

    private static final Scanner scanner =new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("---------healthcare-management-system------------------");
            System.out.println("1. create person");


            System.out.println("please enter the option");
            option= Integer.parseInt(scanner.nextLine());


            switch (option){
                case 1:
                    PersonService personService = new PersonService();
                    try {
                        personService.createPerson();
                    }catch (InvalidAgeException e){
                       System.err.println(e.getMessage());
                    }

                    personService.displayPerson();
                    System.out.println("person registered successfully");
            }

        }while(option!=0);{

        }
    }
}
