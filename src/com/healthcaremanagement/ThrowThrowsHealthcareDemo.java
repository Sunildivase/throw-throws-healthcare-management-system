package com.healthcaremanagement;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidIdException;
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
                    }catch (InvalidIdException | NumberFormatException | InvalidAgeException e ){
                       System.err.println(e.getMessage());
                    }

                    personService.displayPerson();
                    System.out.println("person registered successfully");
            }

        }while(option!=0);{

        }
    }
}
