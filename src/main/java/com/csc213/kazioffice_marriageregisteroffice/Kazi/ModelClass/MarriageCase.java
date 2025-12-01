package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

public class MarriageCase {
    private String name;
    private Integer age;
    private String address;
    private Integer idNumber;
    private Integer contact;
    private String maritalStatus;


    public MarriageCase(String name, Integer age, String address, Integer idNumber, Integer contact, String maritalStatus) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.idNumber = idNumber;
        this.contact = contact;
        this.maritalStatus = maritalStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
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
                '}';
    }
}
