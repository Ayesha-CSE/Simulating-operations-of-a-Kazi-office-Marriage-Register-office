package com.csc213.kazioffice_marriageregisteroffice.Witness.ModelClass;

import java.time.LocalDate;

public class WitnessConsent {
    private String caseId;
    private String brideName;
    private String groomName;
    private LocalDate consentObservedDate;
    private boolean brideConsent;
    private boolean groomConsent;
    private String overallConsentResult;
    private String witnessNotes;
    private String comments;
    private String recordedBy;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getBrideName() {
        return brideName;
    }

    public void setBrideName(String brideName) {
        this.brideName = brideName;
    }

    public String getGroomName() {
        return groomName;
    }

    public void setGroomName(String groomName) {
        this.groomName = groomName;
    }

    public LocalDate getConsentObservedDate() {
        return consentObservedDate;
    }

    public void setConsentObservedDate(LocalDate consentObservedDate) {
        this.consentObservedDate = consentObservedDate;
    }

    public boolean isBrideConsent() {
        return brideConsent;
    }

    public void setBrideConsent(boolean brideConsent) {
        this.brideConsent = brideConsent;
    }

    public boolean isGroomConsent() {
        return groomConsent;
    }

    public void setGroomConsent(boolean groomConsent) {
        this.groomConsent = groomConsent;
    }

    public String getOverallConsentResult() {
        return overallConsentResult;
    }

    public void setOverallConsentResult(String overallConsentResult) {
        this.overallConsentResult = overallConsentResult;
    }

    public String getWitnessNotes() {
        return witnessNotes;
    }

    public void setWitnessNotes(String witnessNotes) {
        this.witnessNotes = witnessNotes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRecordedBy() {
        return recordedBy;
    }

    public void setRecordedBy(String recordedBy) {
        this.recordedBy = recordedBy;
    }

    public WitnessConsent(String caseId, String brideName, String groomName, LocalDate consentObservedDate, boolean brideConsent, boolean groomConsent, String overallConsentResult, String witnessNotes, String comments, String recordedBy) {
        this.caseId = caseId;
        this.brideName = brideName;
        this.groomName = groomName;
        this.consentObservedDate = consentObservedDate;
        this.brideConsent = brideConsent;
        this.groomConsent = groomConsent;
        this.overallConsentResult = overallConsentResult;
        this.witnessNotes = witnessNotes;
        this.comments = comments;
        this.recordedBy = recordedBy;




    }

    @Override
    public String toString() {
        return "WitnessConsent{" +
                "caseId='" + caseId + '\'' +
                ", brideName='" + brideName + '\'' +
                ", groomName='" + groomName + '\'' +
                ", consentObservedDate=" + consentObservedDate +
                ", brideConsent=" + brideConsent +
                ", groomConsent=" + groomConsent +
                ", overallConsentResult='" + overallConsentResult + '\'' +
                ", witnessNotes='" + witnessNotes + '\'' +
                ", comments='" + comments + '\'' +
                ", recordedBy='" + recordedBy + '\'' +
                '}';
    }
}
