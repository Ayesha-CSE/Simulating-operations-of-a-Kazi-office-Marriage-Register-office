package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalDisputeCase {
    private String caseId;
    private String disputeId;
    private String raisedBy;
    private LocalDate disputeDate;
    private String disputeDescription;
    private String resolutionStatus;

    public LegalDisputeCase(String caseId, String disputeId, String raisedBy, LocalDate disputeDate, String disputeDescription, String resolutionStatus) {
        this.caseId = caseId;
        this.disputeId = disputeId;
        this.raisedBy = raisedBy;
        this.disputeDate = disputeDate;
        this.disputeDescription = disputeDescription;
        this.resolutionStatus = resolutionStatus;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(String disputeId) {
        this.disputeId = disputeId;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public LocalDate getDisputeDate() {
        return disputeDate;
    }

    public void setDisputeDate(LocalDate disputeDate) {
        this.disputeDate = disputeDate;
    }

    public String getDisputeDescription() {
        return disputeDescription;
    }

    public void setDisputeDescription(String disputeDescription) {
        this.disputeDescription = disputeDescription;
    }

    public String getResolutionStatus() {
        return resolutionStatus;
    }

    public void setResolutionStatus(String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    @Override
    public String toString() {
        return "LegalDisputeCase{" +
                "caseId='" + caseId + '\'' +
                ", disputeId='" + disputeId + '\'' +
                ", raisedBy='" + raisedBy + '\'' +
                ", disputeDate=" + disputeDate +
                ", disputeDescription='" + disputeDescription + '\'' +
                ", resolutionStatus='" + resolutionStatus + '\'' +
                '}';
    }
}
