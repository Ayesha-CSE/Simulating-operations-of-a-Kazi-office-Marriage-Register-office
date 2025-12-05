package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

import java.time.LocalDate;

public class MarriageCase {
    private String name;
    private Integer age;
    private String address;
    private Integer idNumber;
    private Integer contact;
    private String maritalStatus;
    private LocalDate date;


    public MarriageCase(String name, Integer age, String address, Integer idNumber, Integer contact, String maritalStatus, LocalDate date) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idNumber = idNumber;
        this.contact = contact;
        this.maritalStatus = maritalStatus;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MarriageCase{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", idNumber=" + idNumber +
                ", contact=" + contact +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", date=" + date +
                '}';
    }
}
