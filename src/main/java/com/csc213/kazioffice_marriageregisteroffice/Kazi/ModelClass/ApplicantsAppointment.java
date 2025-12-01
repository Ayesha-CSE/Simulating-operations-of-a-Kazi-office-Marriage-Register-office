package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

import java.time.LocalDate;

public class ApplicantsAppointment {
    private String applicantName;
    private Integer caseID;
    private String maritalStatus;
    private LocalDate requestedDate;
    private Integer requestedTime;
    private String requestDetails;

    public ApplicantsAppointment(String applicantName, Integer caseID, String maritalStatus, LocalDate requestedDate, Integer requestedTime, String requestDetails) {
        this.applicantName = applicantName;
        this.caseID = caseID;
        this.maritalStatus = maritalStatus;
        this.requestedDate = requestedDate;
        this.requestedTime = requestedTime;
        this.requestDetails = requestDetails;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Integer getCaseID() {
        return caseID;
    }

    public void setCaseID(Integer caseID) {
        this.caseID = caseID;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(LocalDate requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Integer getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(Integer requestedTime) {
        this.requestedTime = requestedTime;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    @Override
    public String toString() {
        return "ApplicantsAppointment{" +
                "applicantName='" + applicantName + '\'' +
                ", caseID=" + caseID +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", requestedDate=" + requestedDate +
                ", requestedTime=" + requestedTime +
                ", requestDetails='" + requestDetails + '\'' +
                '}';
    }
}
