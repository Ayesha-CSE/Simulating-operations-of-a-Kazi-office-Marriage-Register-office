package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

import java.time.LocalDate;

public class WitnessSummary {
    private String applicantName;
    private Integer caseID;
    private LocalDate date;
    private String caseDetails;
    private String marriageConditions;
    private String witnessNotes;

    public WitnessSummary(String applicantName, Integer caseID, LocalDate date, String caseDetails, String marriageConditions, String witnessNotes) {
        this.applicantName = applicantName;
        this.caseID = caseID;
        this.date = date;
        this.caseDetails = caseDetails;
        this.marriageConditions = marriageConditions;
        this.witnessNotes = witnessNotes;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
    }

    public String getMarriageConditions() {
        return marriageConditions;
    }

    public void setMarriageConditions(String marriageConditions) {
        this.marriageConditions = marriageConditions;
    }

    public String getWitnessNotes() {
        return witnessNotes;
    }

    public void setWitnessNotes(String witnessNotes) {
        this.witnessNotes = witnessNotes;
    }

    @Override
    public String toString() {
        return "WitnessSummary{" +
                "applicantName='" + applicantName + '\'' +
                ", caseID=" + caseID +
                ", date=" + date +
                ", caseDetails='" + caseDetails + '\'' +
                ", marriageConditions='" + marriageConditions + '\'' +
                ", witnessNotes='" + witnessNotes + '\'' +
                '}';
    }
}
