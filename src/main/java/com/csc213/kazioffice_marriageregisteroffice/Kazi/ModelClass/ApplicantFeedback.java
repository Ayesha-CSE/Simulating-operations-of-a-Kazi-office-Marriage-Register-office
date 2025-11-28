package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

import java.time.LocalDate;

public class ApplicantFeedback {
    private LocalDate date;
    private float rating;
    private int caseId;
    private String applicantName;
    private String feedback;

    public ApplicantFeedback(LocalDate date, float rating, int caseId, String applicantName, String feedback) {
        this.date = date;
        this.rating = rating;
        this.caseId = caseId;
        this.applicantName = applicantName;
        this.feedback = feedback;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
