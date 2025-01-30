package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidIdException;
import com.healthcaremanagement.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Person> personHashMap = new HashMap<>();

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson() throws NumberFormatException {

        System.out.println("please enter id");
         int personId =0;
         try{
             personId=Integer.parseInt(scanner.nextLine());
         }catch (NumberFormatException e){
             throw new NumberFormatException("please enter valid input");
         }

        if(personId<=0 ){
            throw new InvalidIdException("please enter valid input");
        }
        System.out.println("please enter first Name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age ");
        int age = Integer.parseInt(scanner.nextLine());

        if(age < 0){
            throw new InvalidAgeException("invalid age");
        }

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        Long contactNo = Long.parseLong(scanner.nextLine());

        System.out.println("please enter alternateMobile");
        Long alternateMobile = Long.parseLong(scanner.nextLine());

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(contactNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);
        personHashMap.put(String.valueOf(1),person);
        return person;
    }

    public void displayPerson(){
        Set<Map.Entry<String,Person>> entrySet = personHashMap.entrySet();
        for(Map.Entry<String,Person> personEntry: entrySet){
            System.out.println("key: "+personEntry.getKey()+"value: "+personEntry.getValue());
        }

   }
}
