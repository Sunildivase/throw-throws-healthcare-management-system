package com.healthcaremanagement.model;

public class Appointment {

    private int appointmentId;
    private int personId;
    private int doctorId;
    private int hospitalId;
    private int deptId;

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", personId=" + personId +
                ", doctorId=" + doctorId +
                ", hospitalId=" + hospitalId +
                ", deptId=" + deptId +
                '}';
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
}
