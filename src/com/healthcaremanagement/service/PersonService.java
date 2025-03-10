package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidAgeException;
import com.healthcaremanagement.exception.InvalidContactException;
import com.healthcaremanagement.exception.InvalidPersonException;
import com.healthcaremanagement.exception.UserNotFound;
import com.healthcaremanagement.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

    private static final Scanner scanner = new Scanner(System.in);

    HashMap<String, Person> personHashMap = new HashMap<String, Person>();

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
            throw new InvalidPersonException("please enter valid input");
        }

//        if(personId != createPerson().getPersonId()){
//            throw new UserNotFound("user not found");
//        }
        System.out.println("please enter first Name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age ");
        int age =0;

        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("enter valid input");
        }

        if(age < 0){
            throw new InvalidAgeException("invalid age");
        }

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        Long contactNo = 0L;

        try{
            contactNo = Long.parseLong(scanner.nextLine());
        }catch (NumberFormatException e){
            throw new NumberFormatException("enter valid input");
        }

        if(contactNo != 10){

        }else {
            throw new InvalidContactException("enter valid input");
        }

        System.out.println("please enter alternateMobile");
        Long alternateMobile = 0L;
        try {
             alternateMobile = Long.parseLong(scanner.nextLine());
        }catch (NumberFormatException e){
            throw new NumberFormatException("enter valid input");
        }
        if(alternateMobile != 10){

        }else{
            throw new InvalidContactException("enter valid input");
        }

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
        Set<Map.Entry<String, Person>> entrySet = personHashMap.entrySet();
        for(Map.Entry<String, Person> personEntry: entrySet){
            System.out.println("key: "+personEntry.getKey()+"value: "+personEntry.getValue());
        }

   }
}
