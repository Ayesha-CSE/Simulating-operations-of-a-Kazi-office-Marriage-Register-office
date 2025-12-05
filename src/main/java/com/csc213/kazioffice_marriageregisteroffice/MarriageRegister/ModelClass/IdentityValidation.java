package com.csc213.kazioffice_marriageregisteroffice.MarriageRegister.ModelClass;

import java.time.LocalDate;

public class IdentityValidation {
    public String applicantName;
    public String caseID;
    public Integer nidNumber;
    public LocalDate dateOfBirth;
    public String status;
    public Integer contact;

    public IdentityValidation(String applicantName, String caseID, Integer nidNumber, LocalDate dateOfBirth, String status, Integer contact) {
        this.applicantName = applicantName;
        this.caseID = caseID;
        this.nidNumber = nidNumber;
        this.dateOfBirth = dateOfBirth;
        this.status = status;
        this.contact = contact;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public Integer getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(Integer nidNumber) {
        this.nidNumber = nidNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "IdentityValidation{" +
                "applicantName='" + applicantName + '\'' +
                ", caseID='" + caseID + '\'' +
                ", nidNumber=" + nidNumber +
                ", dateOfBirth=" + dateOfBirth +
                ", status='" + status + '\'' +
                ", contact=" + contact +
                '}';
    }
}
