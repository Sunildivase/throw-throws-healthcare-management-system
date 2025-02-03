package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidAmountException;
import com.healthcaremanagement.exception.InvalidBillingException;
import com.healthcaremanagement.exception.InvalidPersonException;
import com.healthcaremanagement.model.Billing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BillingService {

   private static final Scanner scanner = new Scanner(System.in);

   Set<Billing> billings = new HashSet<>();

   void printBilling(Billing billing){
       System.out.println(billing);
   }

   public void createBilling() throws InvalidBillingException {

      System.out.println("please enter billId");
      int billId =0;
      try {
         billId = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
         throw new NumberFormatException("please enter valid input");
      }

      if(billId < 0){
         throw new InvalidBillingException("please enter valid input");
      }

      System.out.println("please enter bill");
      int bill=0;
      try {
         bill = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
         throw new NumberFormatException("please enter valid input");
      }

      if(bill < 0){
         throw new InvalidAmountException("please enter valid amount");
      }

      System.out.println("please enter totalBill");
      int totalBill = 0;
      try {
          totalBill = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
         throw new NumberFormatException("please enter valid amount");
      }

      if(totalBill < 0){
         throw new InvalidAmountException("please enter valid amount");
      }

      System.out.println("please enter personId");
      int personId=0;
      try {
          personId = Integer.parseInt(scanner.nextLine());
      } catch (NumberFormatException e) {
         throw new NumberFormatException("please enter valid input");
      }

      if(personId < 0){
         throw new InvalidPersonException("please enter valid input");
      }


      Billing billing = new Billing();
      billing.setBillId(billId);
      billing.setBill(bill);
      billing.setTotalBill(totalBill);
      billing.setPersonId(personId);

      billings.add(billing);


   }
   public void displayBilling(){
      System.out.println("billing: "+billings);
   }
}
