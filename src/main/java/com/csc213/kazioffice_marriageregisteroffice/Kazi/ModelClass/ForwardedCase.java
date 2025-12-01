package com.csc213.kazioffice_marriageregisteroffice.Kazi.ModelClass;

public class ForwardedCase {
    private Integer caseId;
    private String applicantName;
    private String status;

    public ForwardedCase(Integer caseId, String applicantName, String status) {
        this.caseId = caseId;
        this.applicantName = applicantName;
        this.status = status;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ForwardedCase{" +
                "caseId=" + caseId +
                ", applicantName='" + applicantName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
