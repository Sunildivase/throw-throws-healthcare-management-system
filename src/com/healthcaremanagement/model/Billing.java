package com.healthcaremanagement.model;

public class Billing {
    private int billId;
    private int bill;
    private int totalBill;
    private int personId;

    @Override
    public String toString() {
        return "Billing{" +
                "billId=" + billId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                ", personId=" + personId +
                '}';
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }
}
