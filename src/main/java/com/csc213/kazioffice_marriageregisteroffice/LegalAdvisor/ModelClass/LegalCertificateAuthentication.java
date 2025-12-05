package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalCertificateAuthentication {
    private String caseId;
    private String certificateNumber;
    private String destinationCountry;
    private LocalDate authenticationDate;
    private String authenticationStatus;
    private String remarks;

    public LegalCertificateAuthentication(String caseId, String certificateNumber, String destinationCountry, LocalDate authenticationDate, String authenticationStatus, String remarks) {
        this.caseId = caseId;
        this.certificateNumber = certificateNumber;
        this.destinationCountry = destinationCountry;
        this.authenticationDate = authenticationDate;
        this.authenticationStatus = authenticationStatus;
        this.remarks = remarks;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public LocalDate getAuthenticationDate() {
        return authenticationDate;
    }

    public void setAuthenticationDate(LocalDate authenticationDate) {
        this.authenticationDate = authenticationDate;
    }

    public String getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(String authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalCertificateAuthentication{" +
                "caseId='" + caseId + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", destinationCountry='" + destinationCountry + '\'' +
                ", authenticationDate=" + authenticationDate +
                ", authenticationStatus='" + authenticationStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
