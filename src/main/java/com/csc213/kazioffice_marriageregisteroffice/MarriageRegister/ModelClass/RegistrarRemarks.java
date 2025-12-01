package com.csc213.kazioffice_marriageregisteroffice.MarriageRegister.ModelClass;

import java.time.LocalDate;

public class RegistrarRemarks {
    private Integer caseID;
    private String applicantName;
    private LocalDate date;
    private String applicantNote;
    private String registrarRemarks;

    public RegistrarRemarks(Integer caseID, String applicantName, LocalDate date, String applicantNote, String registrarRemarks) {
        this.caseID = caseID;
        this.applicantName = applicantName;
        this.date = date;
        this.applicantNote = applicantNote;
        this.registrarRemarks = registrarRemarks;
    }

    public Integer getCaseID() {
        return caseID;
    }

    public void setCaseID(Integer caseID) {
        this.caseID = caseID;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getApplicantNote() {
        return applicantNote;
    }

    public void setApplicantNote(String applicantNote) {
        this.applicantNote = applicantNote;
    }

    public String getRegistrarRemarks() {
        return registrarRemarks;
    }

    public void setRegistrarRemarks(String registrarRemarks) {
        this.registrarRemarks = registrarRemarks;
    }

    @Override
    public String toString() {
        return "RegistrarRemarks{" +
                "caseID=" + caseID +
                ", applicantName='" + applicantName + '\'' +
                ", date=" + date +
                ", applicantNote='" + applicantNote + '\'' +
                ", registrarRemarks='" + registrarRemarks + '\'' +
                '}';
    }
}
