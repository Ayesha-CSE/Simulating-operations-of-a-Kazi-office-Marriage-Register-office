package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalAdviceRecord {
    private String caseId;
    private String advisorName;
    private LocalDate adviceDate;
    private String adviceDetails;
    private String remarks;

    public LegalAdviceRecord(String caseId, String advisorName, LocalDate adviceDate, String adviceDetails, String remarks) {
        this.caseId = caseId;
        this.advisorName = advisorName;
        this.adviceDate = adviceDate;
        this.adviceDetails = adviceDetails;
        this.remarks = remarks;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    public LocalDate getAdviceDate() {
        return adviceDate;
    }

    public void setAdviceDate(LocalDate adviceDate) {
        this.adviceDate = adviceDate;
    }

    public String getAdviceDetails() {
        return adviceDetails;
    }

    public void setAdviceDetails(String adviceDetails) {
        this.adviceDetails = adviceDetails;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalAdviceRecord{" +
                "caseId='" + caseId + '\'' +
                ", advisorName='" + advisorName + '\'' +
                ", adviceDate=" + adviceDate +
                ", adviceDetails='" + adviceDetails + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
