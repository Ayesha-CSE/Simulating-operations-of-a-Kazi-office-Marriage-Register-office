package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalBackgroundCheck {
    private String caseId;
    private String applicantName;
    private String applicantNid;
    private LocalDate checkDate;
    private String checkResult;
    private String remarks;

    public LegalBackgroundCheck(String caseId, String applicantName, String applicantNid, LocalDate checkDate, String checkResult, String remarks) {
        this.caseId = caseId;
        this.applicantName = applicantName;
        this.applicantNid = applicantNid;
        this.checkDate = checkDate;
        this.checkResult = checkResult;
        this.remarks = remarks;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantNid() {
        return applicantNid;
    }

    public void setApplicantNid(String applicantNid) {
        this.applicantNid = applicantNid;
    }

    public LocalDate getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalBackgroundCheck{" +
                "caseId='" + caseId + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", applicantNid='" + applicantNid + '\'' +
                ", checkDate=" + checkDate +
                ", checkResult='" + checkResult + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
