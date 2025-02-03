package com.healthcaremanagement.service;

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

   public void createBilling(){

   }
   public void displayBilling(){

   }
}
