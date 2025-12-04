package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalDocumentationReview {
    private String caseId;
    private String documentName;
    private String legalAdvisorName;
    private LocalDate reviewDate;
    private String reviewStatus;
    private String remarks;

    public LegalDocumentationReview(String caseId, String documentName, String legalAdvisorName, LocalDate reviewDate, String reviewStatus, String remarks) {
        this.caseId = caseId;
        this.documentName = documentName;
        this.legalAdvisorName = legalAdvisorName;
        this.reviewDate = reviewDate;
        this.reviewStatus = reviewStatus;
        this.remarks = remarks;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getLegalAdvisorName() {
        return legalAdvisorName;
    }

    public void setLegalAdvisorName(String legalAdvisorName) {
        this.legalAdvisorName = legalAdvisorName;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalDocumentationReview{" +
                "caseId='" + caseId + '\'' +
                ", documentName='" + documentName + '\'' +
                ", legalAdvisorName='" + legalAdvisorName + '\'' +
                ", reviewDate=" + reviewDate +
                ", reviewStatus='" + reviewStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
