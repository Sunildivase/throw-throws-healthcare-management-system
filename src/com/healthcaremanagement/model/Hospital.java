package com.healthcaremanagement.model;

public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String hospitalAddress;
    private Long contactNo;
    private String emailId;

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", contactNo=" + contactNo +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
