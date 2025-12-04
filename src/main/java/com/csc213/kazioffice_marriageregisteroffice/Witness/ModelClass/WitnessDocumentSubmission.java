package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import java.time.LocalDate;

public class WitnessDocumentSubmission {
    private String caseId;
    private String witnessName;
    private String witnessNid;
    private String documentType;
    private String documentNumber;
    private LocalDate submissionDate;
    private String verificationStatus;
    private String comments;

    public WitnessDocumentSubmission(String caseId, String witnessName, String witnessNid, String documentType, String documentNumber, LocalDate submissionDate, String verificationStatus, String comments) {
        this.caseId = caseId;
        this.witnessName = witnessName;
        this.witnessNid = witnessNid;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.submissionDate = submissionDate;
        this.verificationStatus = verificationStatus;
        this.comments = comments;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getWitnessName() {
        return witnessName;
    }

    public void setWitnessName(String witnessName) {
        this.witnessName = witnessName;
    }

    public String getWitnessNid() {
        return witnessNid;
    }

    public void setWitnessNid(String witnessNid) {
        this.witnessNid = witnessNid;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "WitnessDocumentSubmission{" +
                "caseId='" + caseId + '\'' +
                ", witnessName='" + witnessName + '\'' +
                ", witnessNid='" + witnessNid + '\'' +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", submissionDate=" + submissionDate +
                ", verificationStatus='" + verificationStatus + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
