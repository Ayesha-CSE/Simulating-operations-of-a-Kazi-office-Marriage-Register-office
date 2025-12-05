package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalCertificateApproval {
    private String certificateId;
    private String applicantNames;
    private String legalAdvisorName;
    private LocalDate approvalDate;
    private String approvalStatus;
    private String remarks;

    public LegalCertificateApproval(String certificateId, String applicantNames, String legalAdvisorName, LocalDate approvalDate, String approvalStatus, String remarks) {
        this.certificateId = certificateId;
        this.applicantNames = applicantNames;
        this.legalAdvisorName = legalAdvisorName;
        this.approvalDate = approvalDate;
        this.approvalStatus = approvalStatus;
        this.remarks = remarks;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public String getApplicantNames() {
        return applicantNames;
    }

    public void setApplicantNames(String applicantNames) {
        this.applicantNames = applicantNames;
    }

    public String getLegalAdvisorName() {
        return legalAdvisorName;
    }

    public void setLegalAdvisorName(String legalAdvisorName) {
        this.legalAdvisorName = legalAdvisorName;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalCertificateApproval{" +
                "certificateId='" + certificateId + '\'' +
                ", applicantNames='" + applicantNames + '\'' +
                ", legalAdvisorName='" + legalAdvisorName + '\'' +
                ", approvalDate=" + approvalDate +
                ", approvalStatus='" + approvalStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
