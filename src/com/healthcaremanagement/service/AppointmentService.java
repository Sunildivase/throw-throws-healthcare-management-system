package com.healthcaremanagement.service;

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

    public void createAppointment(){
        System.out.println("please enter appointmentId");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

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
