package com.healthcaremanagement.service;

import com.healthcaremanagement.exception.InvalidAppointmentException;
import com.healthcaremanagement.exception.InvalidPersonException;
import com.healthcaremanagement.model.Appointment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppointmentService {

    private static final Scanner scanner = new Scanner(System.in);

    Set<String > appointments = new HashSet<>();

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public void createAppointment() throws InvalidAppointmentException {
        System.out.println("please enter appointmentId");
        int appointmentId=0;
        try {
            appointmentId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("please enter valid input");
        }

        if(appointmentId < 0){
            throw new InvalidAppointmentException("please enter valid input");
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


        System.out.println("please enter doctorId");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospitalId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter deptId");
        int deptId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);
        appointments.add(String.valueOf(appointment));
    }
    public void displayAppointment(){
        System.out.println("appointments: "+appointments);
    }
}
